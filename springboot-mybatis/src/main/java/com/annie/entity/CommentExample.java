package com.annie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCcIdIsNull() {
            addCriterion("cc_id is null");
            return (Criteria) this;
        }

        public Criteria andCcIdIsNotNull() {
            addCriterion("cc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcIdEqualTo(Integer value) {
            addCriterion("cc_id =", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotEqualTo(Integer value) {
            addCriterion("cc_id <>", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThan(Integer value) {
            addCriterion("cc_id >", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_id >=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThan(Integer value) {
            addCriterion("cc_id <", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_id <=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdIn(List<Integer> values) {
            addCriterion("cc_id in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotIn(List<Integer> values) {
            addCriterion("cc_id not in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_id between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_id not between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcCIdIsNull() {
            addCriterion("cc_c_id is null");
            return (Criteria) this;
        }

        public Criteria andCcCIdIsNotNull() {
            addCriterion("cc_c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcCIdEqualTo(Integer value) {
            addCriterion("cc_c_id =", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdNotEqualTo(Integer value) {
            addCriterion("cc_c_id <>", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdGreaterThan(Integer value) {
            addCriterion("cc_c_id >", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_c_id >=", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdLessThan(Integer value) {
            addCriterion("cc_c_id <", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_c_id <=", value, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdIn(List<Integer> values) {
            addCriterion("cc_c_id in", values, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdNotIn(List<Integer> values) {
            addCriterion("cc_c_id not in", values, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_c_id between", value1, value2, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_c_id not between", value1, value2, "ccCId");
            return (Criteria) this;
        }

        public Criteria andCcTimeIsNull() {
            addCriterion("cc_time is null");
            return (Criteria) this;
        }

        public Criteria andCcTimeIsNotNull() {
            addCriterion("cc_time is not null");
            return (Criteria) this;
        }

        public Criteria andCcTimeEqualTo(Date value) {
            addCriterion("cc_time =", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeNotEqualTo(Date value) {
            addCriterion("cc_time <>", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeGreaterThan(Date value) {
            addCriterion("cc_time >", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cc_time >=", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeLessThan(Date value) {
            addCriterion("cc_time <", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeLessThanOrEqualTo(Date value) {
            addCriterion("cc_time <=", value, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeIn(List<Date> values) {
            addCriterion("cc_time in", values, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeNotIn(List<Date> values) {
            addCriterion("cc_time not in", values, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeBetween(Date value1, Date value2) {
            addCriterion("cc_time between", value1, value2, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcTimeNotBetween(Date value1, Date value2) {
            addCriterion("cc_time not between", value1, value2, "ccTime");
            return (Criteria) this;
        }

        public Criteria andCcContentIsNull() {
            addCriterion("cc_content is null");
            return (Criteria) this;
        }

        public Criteria andCcContentIsNotNull() {
            addCriterion("cc_content is not null");
            return (Criteria) this;
        }

        public Criteria andCcContentEqualTo(String value) {
            addCriterion("cc_content =", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentNotEqualTo(String value) {
            addCriterion("cc_content <>", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentGreaterThan(String value) {
            addCriterion("cc_content >", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentGreaterThanOrEqualTo(String value) {
            addCriterion("cc_content >=", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentLessThan(String value) {
            addCriterion("cc_content <", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentLessThanOrEqualTo(String value) {
            addCriterion("cc_content <=", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentLike(String value) {
            addCriterion("cc_content like", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentNotLike(String value) {
            addCriterion("cc_content not like", value, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentIn(List<String> values) {
            addCriterion("cc_content in", values, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentNotIn(List<String> values) {
            addCriterion("cc_content not in", values, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentBetween(String value1, String value2) {
            addCriterion("cc_content between", value1, value2, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcContentNotBetween(String value1, String value2) {
            addCriterion("cc_content not between", value1, value2, "ccContent");
            return (Criteria) this;
        }

        public Criteria andCcBulouIsNull() {
            addCriterion("cc_bulou is null");
            return (Criteria) this;
        }

        public Criteria andCcBulouIsNotNull() {
            addCriterion("cc_bulou is not null");
            return (Criteria) this;
        }

        public Criteria andCcBulouEqualTo(Integer value) {
            addCriterion("cc_bulou =", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouNotEqualTo(Integer value) {
            addCriterion("cc_bulou <>", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouGreaterThan(Integer value) {
            addCriterion("cc_bulou >", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_bulou >=", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouLessThan(Integer value) {
            addCriterion("cc_bulou <", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouLessThanOrEqualTo(Integer value) {
            addCriterion("cc_bulou <=", value, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouIn(List<Integer> values) {
            addCriterion("cc_bulou in", values, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouNotIn(List<Integer> values) {
            addCriterion("cc_bulou not in", values, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouBetween(Integer value1, Integer value2) {
            addCriterion("cc_bulou between", value1, value2, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcBulouNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_bulou not between", value1, value2, "ccBulou");
            return (Criteria) this;
        }

        public Criteria andCcUIdIsNull() {
            addCriterion("cc_u_id is null");
            return (Criteria) this;
        }

        public Criteria andCcUIdIsNotNull() {
            addCriterion("cc_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcUIdEqualTo(Integer value) {
            addCriterion("cc_u_id =", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdNotEqualTo(Integer value) {
            addCriterion("cc_u_id <>", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdGreaterThan(Integer value) {
            addCriterion("cc_u_id >", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_u_id >=", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdLessThan(Integer value) {
            addCriterion("cc_u_id <", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_u_id <=", value, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdIn(List<Integer> values) {
            addCriterion("cc_u_id in", values, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdNotIn(List<Integer> values) {
            addCriterion("cc_u_id not in", values, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_u_id between", value1, value2, "ccUId");
            return (Criteria) this;
        }

        public Criteria andCcUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_u_id not between", value1, value2, "ccUId");
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