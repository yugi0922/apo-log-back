package com.yugi.apolog.domain;
import lombok.Data;

/**
 * アポ結果レスポンス
 */
@Data
public class ApoResult {
    /**
     * 累計アポ数
     * Type: INT
     */
    private Integer countApoTotal;

    /**
     * 累計即数
     * Type: INT
     */
    private Integer countSokuTotal;

    /**
     * 直近1か月間のアポ数
     * Type: INT
     */
    private Integer countApoTotalMonthBefore;

    /**
     * 直近一か月の勝率
     * Type: INT
     */
    private Integer rateSokuMonthBefore;

    /**
     * 直近一か月の合計アポ費用
     * Type: INT
     */
    private Integer countMoneyTotalMonthBefore;

    /**
     * 今月のアポ予定合計数
     * Type: INT
     */
    private Integer forecastApoTotalCurrentMonth;

    /**
     * 今月の勝率
     * Type: INT
     */
    private Integer rateSokuCurrentMonth;

    /**
     * 今月の合計アポ費用
     * Type: INT
     */
    private Integer countMoneyTotalCurrentMonth;


}
