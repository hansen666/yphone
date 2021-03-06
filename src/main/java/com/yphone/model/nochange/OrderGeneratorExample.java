package com.yphone.model.nochange;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderGeneratorExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public OrderGeneratorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_generator
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andOrderGeneratorIdIsNull() {
            addCriterion("order_generator_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdIsNotNull() {
            addCriterion("order_generator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdEqualTo(Long value) {
            addCriterion("order_generator_id =", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdNotEqualTo(Long value) {
            addCriterion("order_generator_id <>", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdGreaterThan(Long value) {
            addCriterion("order_generator_id >", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_generator_id >=", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdLessThan(Long value) {
            addCriterion("order_generator_id <", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdLessThanOrEqualTo(Long value) {
            addCriterion("order_generator_id <=", value, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdIn(List<Long> values) {
            addCriterion("order_generator_id in", values, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdNotIn(List<Long> values) {
            addCriterion("order_generator_id not in", values, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdBetween(Long value1, Long value2) {
            addCriterion("order_generator_id between", value1, value2, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andOrderGeneratorIdNotBetween(Long value1, Long value2) {
            addCriterion("order_generator_id not between", value1, value2, "orderGeneratorId");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4IsNull() {
            addCriterion("phone_last4 is null");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4IsNotNull() {
            addCriterion("phone_last4 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4EqualTo(String value) {
            addCriterion("phone_last4 =", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4NotEqualTo(String value) {
            addCriterion("phone_last4 <>", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4GreaterThan(String value) {
            addCriterion("phone_last4 >", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4GreaterThanOrEqualTo(String value) {
            addCriterion("phone_last4 >=", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4LessThan(String value) {
            addCriterion("phone_last4 <", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4LessThanOrEqualTo(String value) {
            addCriterion("phone_last4 <=", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4Like(String value) {
            addCriterion("phone_last4 like", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4NotLike(String value) {
            addCriterion("phone_last4 not like", value, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4In(List<String> values) {
            addCriterion("phone_last4 in", values, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4NotIn(List<String> values) {
            addCriterion("phone_last4 not in", values, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4Between(String value1, String value2) {
            addCriterion("phone_last4 between", value1, value2, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andPhoneLast4NotBetween(String value1, String value2) {
            addCriterion("phone_last4 not between", value1, value2, "phoneLast4");
            return (Criteria) this;
        }

        public Criteria andDateNumIsNull() {
            addCriterion("date_num is null");
            return (Criteria) this;
        }

        public Criteria andDateNumIsNotNull() {
            addCriterion("date_num is not null");
            return (Criteria) this;
        }

        public Criteria andDateNumEqualTo(String value) {
            addCriterion("date_num =", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumNotEqualTo(String value) {
            addCriterion("date_num <>", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumGreaterThan(String value) {
            addCriterion("date_num >", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumGreaterThanOrEqualTo(String value) {
            addCriterion("date_num >=", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumLessThan(String value) {
            addCriterion("date_num <", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumLessThanOrEqualTo(String value) {
            addCriterion("date_num <=", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumLike(String value) {
            addCriterion("date_num like", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumNotLike(String value) {
            addCriterion("date_num not like", value, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumIn(List<String> values) {
            addCriterion("date_num in", values, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumNotIn(List<String> values) {
            addCriterion("date_num not in", values, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumBetween(String value1, String value2) {
            addCriterion("date_num between", value1, value2, "dateNum");
            return (Criteria) this;
        }

        public Criteria andDateNumNotBetween(String value1, String value2) {
            addCriterion("date_num not between", value1, value2, "dateNum");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_generator
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_generator
     *
     * @mbggenerated
     */
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