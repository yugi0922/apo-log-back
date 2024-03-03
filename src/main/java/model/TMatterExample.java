package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMatterExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public TMatterExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApoCategoryIsNull() {
            addCriterion("apo_category is null");
            return (Criteria) this;
        }

        public Criteria andApoCategoryIsNotNull() {
            addCriterion("apo_category is not null");
            return (Criteria) this;
        }

        public Criteria andApoCategoryEqualTo(String value) {
            addCriterion("apo_category =", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryNotEqualTo(String value) {
            addCriterion("apo_category <>", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryGreaterThan(String value) {
            addCriterion("apo_category >", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("apo_category >=", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryLessThan(String value) {
            addCriterion("apo_category <", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryLessThanOrEqualTo(String value) {
            addCriterion("apo_category <=", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryLike(String value) {
            addCriterion("apo_category like", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryNotLike(String value) {
            addCriterion("apo_category not like", value, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryIn(List<String> values) {
            addCriterion("apo_category in", values, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryNotIn(List<String> values) {
            addCriterion("apo_category not in", values, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryBetween(String value1, String value2) {
            addCriterion("apo_category between", value1, value2, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andApoCategoryNotBetween(String value1, String value2) {
            addCriterion("apo_category not between", value1, value2, "apoCategory");
            return (Criteria) this;
        }

        public Criteria andDeadFlgIsNull() {
            addCriterion("dead_flg is null");
            return (Criteria) this;
        }

        public Criteria andDeadFlgIsNotNull() {
            addCriterion("dead_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDeadFlgEqualTo(Byte value) {
            addCriterion("dead_flg =", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgNotEqualTo(Byte value) {
            addCriterion("dead_flg <>", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgGreaterThan(Byte value) {
            addCriterion("dead_flg >", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgGreaterThanOrEqualTo(Byte value) {
            addCriterion("dead_flg >=", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgLessThan(Byte value) {
            addCriterion("dead_flg <", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgLessThanOrEqualTo(Byte value) {
            addCriterion("dead_flg <=", value, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgIn(List<Byte> values) {
            addCriterion("dead_flg in", values, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgNotIn(List<Byte> values) {
            addCriterion("dead_flg not in", values, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgBetween(Byte value1, Byte value2) {
            addCriterion("dead_flg between", value1, value2, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andDeadFlgNotBetween(Byte value1, Byte value2) {
            addCriterion("dead_flg not between", value1, value2, "deadFlg");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andAppCategoryIsNull() {
            addCriterion("app_category is null");
            return (Criteria) this;
        }

        public Criteria andAppCategoryIsNotNull() {
            addCriterion("app_category is not null");
            return (Criteria) this;
        }

        public Criteria andAppCategoryEqualTo(String value) {
            addCriterion("app_category =", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryNotEqualTo(String value) {
            addCriterion("app_category <>", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryGreaterThan(String value) {
            addCriterion("app_category >", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("app_category >=", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryLessThan(String value) {
            addCriterion("app_category <", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryLessThanOrEqualTo(String value) {
            addCriterion("app_category <=", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryLike(String value) {
            addCriterion("app_category like", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryNotLike(String value) {
            addCriterion("app_category not like", value, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryIn(List<String> values) {
            addCriterion("app_category in", values, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryNotIn(List<String> values) {
            addCriterion("app_category not in", values, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryBetween(String value1, String value2) {
            addCriterion("app_category between", value1, value2, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAppCategoryNotBetween(String value1, String value2) {
            addCriterion("app_category not between", value1, value2, "appCategory");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andLooksLevelIsNull() {
            addCriterion("looks_level is null");
            return (Criteria) this;
        }

        public Criteria andLooksLevelIsNotNull() {
            addCriterion("looks_level is not null");
            return (Criteria) this;
        }

        public Criteria andLooksLevelEqualTo(Integer value) {
            addCriterion("looks_level =", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelNotEqualTo(Integer value) {
            addCriterion("looks_level <>", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelGreaterThan(Integer value) {
            addCriterion("looks_level >", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("looks_level >=", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelLessThan(Integer value) {
            addCriterion("looks_level <", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelLessThanOrEqualTo(Integer value) {
            addCriterion("looks_level <=", value, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelIn(List<Integer> values) {
            addCriterion("looks_level in", values, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelNotIn(List<Integer> values) {
            addCriterion("looks_level not in", values, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelBetween(Integer value1, Integer value2) {
            addCriterion("looks_level between", value1, value2, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andLooksLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("looks_level not between", value1, value2, "looksLevel");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFhaseIsNull() {
            addCriterion("fhase is null");
            return (Criteria) this;
        }

        public Criteria andFhaseIsNotNull() {
            addCriterion("fhase is not null");
            return (Criteria) this;
        }

        public Criteria andFhaseEqualTo(String value) {
            addCriterion("fhase =", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseNotEqualTo(String value) {
            addCriterion("fhase <>", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseGreaterThan(String value) {
            addCriterion("fhase >", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseGreaterThanOrEqualTo(String value) {
            addCriterion("fhase >=", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseLessThan(String value) {
            addCriterion("fhase <", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseLessThanOrEqualTo(String value) {
            addCriterion("fhase <=", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseLike(String value) {
            addCriterion("fhase like", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseNotLike(String value) {
            addCriterion("fhase not like", value, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseIn(List<String> values) {
            addCriterion("fhase in", values, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseNotIn(List<String> values) {
            addCriterion("fhase not in", values, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseBetween(String value1, String value2) {
            addCriterion("fhase between", value1, value2, "fhase");
            return (Criteria) this;
        }

        public Criteria andFhaseNotBetween(String value1, String value2) {
            addCriterion("fhase not between", value1, value2, "fhase");
            return (Criteria) this;
        }

        public Criteria andNextApoDateIsNull() {
            addCriterion("next_apo_date is null");
            return (Criteria) this;
        }

        public Criteria andNextApoDateIsNotNull() {
            addCriterion("next_apo_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextApoDateEqualTo(Date value) {
            addCriterion("next_apo_date =", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateNotEqualTo(Date value) {
            addCriterion("next_apo_date <>", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateGreaterThan(Date value) {
            addCriterion("next_apo_date >", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("next_apo_date >=", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateLessThan(Date value) {
            addCriterion("next_apo_date <", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateLessThanOrEqualTo(Date value) {
            addCriterion("next_apo_date <=", value, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateIn(List<Date> values) {
            addCriterion("next_apo_date in", values, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateNotIn(List<Date> values) {
            addCriterion("next_apo_date not in", values, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateBetween(Date value1, Date value2) {
            addCriterion("next_apo_date between", value1, value2, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNextApoDateNotBetween(Date value1, Date value2) {
            addCriterion("next_apo_date not between", value1, value2, "nextApoDate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIsNull() {
            addCriterion("complete_flg is null");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIsNotNull() {
            addCriterion("complete_flg is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgEqualTo(Byte value) {
            addCriterion("complete_flg =", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotEqualTo(Byte value) {
            addCriterion("complete_flg <>", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgGreaterThan(Byte value) {
            addCriterion("complete_flg >", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgGreaterThanOrEqualTo(Byte value) {
            addCriterion("complete_flg >=", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgLessThan(Byte value) {
            addCriterion("complete_flg <", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgLessThanOrEqualTo(Byte value) {
            addCriterion("complete_flg <=", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIn(List<Byte> values) {
            addCriterion("complete_flg in", values, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotIn(List<Byte> values) {
            addCriterion("complete_flg not in", values, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgBetween(Byte value1, Byte value2) {
            addCriterion("complete_flg between", value1, value2, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotBetween(Byte value1, Byte value2) {
            addCriterion("complete_flg not between", value1, value2, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andApoStatusIsNull() {
            addCriterion("apo_status is null");
            return (Criteria) this;
        }

        public Criteria andApoStatusIsNotNull() {
            addCriterion("apo_status is not null");
            return (Criteria) this;
        }

        public Criteria andApoStatusEqualTo(Byte value) {
            addCriterion("apo_status =", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusNotEqualTo(Byte value) {
            addCriterion("apo_status <>", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusGreaterThan(Byte value) {
            addCriterion("apo_status >", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("apo_status >=", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusLessThan(Byte value) {
            addCriterion("apo_status <", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusLessThanOrEqualTo(Byte value) {
            addCriterion("apo_status <=", value, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusIn(List<Byte> values) {
            addCriterion("apo_status in", values, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusNotIn(List<Byte> values) {
            addCriterion("apo_status not in", values, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusBetween(Byte value1, Byte value2) {
            addCriterion("apo_status between", value1, value2, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andApoStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("apo_status not between", value1, value2, "apoStatus");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIsNull() {
            addCriterion("consume_money is null");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIsNotNull() {
            addCriterion("consume_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyEqualTo(Integer value) {
            addCriterion("consume_money =", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotEqualTo(Integer value) {
            addCriterion("consume_money <>", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyGreaterThan(Integer value) {
            addCriterion("consume_money >", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_money >=", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyLessThan(Integer value) {
            addCriterion("consume_money <", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("consume_money <=", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIn(List<Integer> values) {
            addCriterion("consume_money in", values, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotIn(List<Integer> values) {
            addCriterion("consume_money not in", values, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("consume_money between", value1, value2, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_money not between", value1, value2, "consumeMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}