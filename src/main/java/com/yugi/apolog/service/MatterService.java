package com.yugi.apolog.service;

import com.yugi.apolog.domain.ApoResult;
import mapper.TMatterMapper;
import model.TMatter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class MatterService {
    private final TMatterMapper matterMapper;



    public MatterService(TMatterMapper matterMapper) {
        this.matterMapper = matterMapper;
    }

    public List<TMatter> findAll() {
        // TODO デバッグ用
        List<TMatter> list = matterMapper.findTop10ByOrderByNextApoDateDesc();
        return list;
    }

    @Transactional
    public TMatter createTMatter(TMatter tMatter) throws Exception {
        // 現在の日時をセット
        Date now = new Date();
        tMatter.setCreatedAt(now);
        tMatter.setUpdatedAt(now);


        // TMatter オブジェクトをテーブルに挿入
        int result = matterMapper.insert(tMatter);
        if (result == 0) {
            // データの挿入が失敗した場合、例外を投げる
            throw new Exception("Insertion failed");
        }
        return tMatter; // 成功した場合、挿入されたTMatterオブジェクトを返す
    }

    /**
     * アポ結果の集計を行い、ApoResultオブジェクトを生成して返す
     * @return ApoResult 集計結果
     */
    public ApoResult generateApoResult() {
        // 現在の日付を取得
        Date now = new Date();

        ApoResult apoResult = new ApoResult();
        apoResult.setCountApoTotal(matterMapper.countApoResultGreaterThanOrEqualFour()); // 合計アポイントメント数
        apoResult.setCountSokuTotal(matterMapper.countResultGreaterThanOrEqualFive() + 107) ; // 合計即時対応数
        apoResult.setCountApoTotalMonthBefore(matterMapper.countApoResultGreaterThanOrEqualFourLastMonth()); // 一か月前の合計アポイントメント数
        apoResult.setRateSokuMonthBefore((int) matterMapper.percentageOfApoResultFiveOverFourLastMonth()); // 一か月前の即時対応率
        apoResult.setCountMoneyTotalMonthBefore(matterMapper.sumConsumeMoneyApoResultGreaterThanOrEqualFourLastMonth()); // 一か月前の合計消費金額
        apoResult.setForecastApoTotalCurrentMonth(matterMapper.countApoResultGreaterThanOrEqualThreeByMonth(now)); // 当月の予測アポイントメント数
        apoResult.setRateSokuCurrentMonth((int) matterMapper.percentageOfApoResultFiveOverFourByMonth(now)); // 当月の即時対応率
        apoResult.setCountMoneyTotalCurrentMonth(matterMapper.sumConsumeMoneyApoResultGreaterThanOrEqualFourByMonth(now)); // 当月の合計消費金額

        return apoResult;
    }


}

