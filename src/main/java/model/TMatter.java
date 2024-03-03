package model;

import java.util.Date;
import lombok.Data;

/**
 * Table: t_matter
 */
@Data
public class TMatter {
    /**
     * Column: id
     * Type: INT
     */
    private Integer id;

    /**
     * Column: apo_category
     * Type: VARCHAR(255)
     */
    private String apoCategory;

    /**
     * Column: dead_flg
     * Type: TINYINT(3)
     */
    private Byte deadFlg;

    /**
     * Column: nick_name
     * Type: VARCHAR(255)
     */
    private String nickName;

    /**
     * Column: app_category
     * Type: VARCHAR(255)
     */
    private String appCategory;

    /**
     * Column: age
     * Type: INT
     */
    private Integer age;

    /**
     * Column: looks_level
     * Type: INT
     */
    private Integer looksLevel;

    /**
     * Column: job
     * Type: VARCHAR(255)
     */
    private String job;

    /**
     * Column: address
     * Type: VARCHAR(255)
     */
    private String address;

    /**
     * Column: fhase
     * Type: VARCHAR(255)
     */
    private String fhase;

    /**
     * Column: next_apo_date
     * Type: DATETIME
     */
    private Date nextApoDate;

    /**
     * Column: note
     * Type: VARCHAR(255)
     */
    private String note;

    /**
     * Column: created_at
     * Type: DATETIME
     * Default value: CURRENT_TIMESTAMP(6)
     */
    private Date createdAt;

    /**
     * Column: updated_at
     * Type: DATETIME
     * Default value: CURRENT_TIMESTAMP(6)
     */
    private Date updatedAt;

    /**
     * Column: complete_flg
     * Type: TINYINT(3)
     */
    private Byte completeFlg;

    /**
     * Column: apo_status
     * Type: TINYINT(3)
     */
    private Byte apoStatus;

    /**
     * Column: consume_money
     * Type: INT
     */
    private Integer consumeMoney;
}