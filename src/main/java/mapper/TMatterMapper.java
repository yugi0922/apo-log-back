package mapper;

import model.TMatter;
import model.TMatterExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TMatterMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TMatterExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TMatterExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TMatter row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TMatter row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TMatter> selectByExample(TMatterExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<TMatter> selectByExample(TMatterExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TMatter selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") TMatter row, @Param("example") TMatterExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") TMatter row, @Param("example") TMatterExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TMatter row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TMatter row);

    // 新しいメソッドを追加
    List<TMatter> findTop10ByOrderByNextApoDateDesc();

    // TMatterテーブルのapo_resultが4以上のレコード数をカウント
    int countApoResultGreaterThanOrEqualFour();

    // TMatterテーブルのresultが5以上のレコード数をカウント
    int countResultGreaterThanOrEqualFive();

    // 直近1ヶ月間でapo_resultが4以上のレコード数をカウント
    int countApoResultGreaterThanOrEqualFourLastMonth();

    // 直近1ヶ月間のapo_resultが5以上のレコード数の割合（apo_resultが4以上のレコード数に対する百分率）
    double percentageOfApoResultFiveOverFourLastMonth();

    // 直近1ヶ月間でapo_resultが4以上のレコードのconsume_moneyの合計を算出
    int sumConsumeMoneyApoResultGreaterThanOrEqualFourLastMonth();

    // 特定の月でapo_resultが3以上のレコード数をカウント（月は引数から指定）
    int countApoResultGreaterThanOrEqualThreeByMonth(@Param("processingMonth") Date processingMonth);

    // 特定の月でapo_resultが5以上のレコード数の割合（apo_resultが4以上のレコード数に対する百分率）を算出（月は引数から指定）
    double percentageOfApoResultFiveOverFourByMonth(@Param("processingMonth") Date processingMonth);

    // 特定の月でapo_resultが4以上のレコードのconsume_moneyの合計を算出（月は引数から指定）
    int sumConsumeMoneyApoResultGreaterThanOrEqualFourByMonth(@Param("processingMonth") Date processingMonth);
}
