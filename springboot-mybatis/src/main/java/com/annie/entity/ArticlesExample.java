package com.annie.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlesExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUIdIsNull() {
            addCriterion("a_u_id is null");
            return (Criteria) this;
        }

        public Criteria andAUIdIsNotNull() {
            addCriterion("a_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andAUIdEqualTo(Integer value) {
            addCriterion("a_u_id =", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotEqualTo(Integer value) {
            addCriterion("a_u_id <>", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdGreaterThan(Integer value) {
            addCriterion("a_u_id >", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_u_id >=", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdLessThan(Integer value) {
            addCriterion("a_u_id <", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_u_id <=", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdIn(List<Integer> values) {
            addCriterion("a_u_id in", values, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotIn(List<Integer> values) {
            addCriterion("a_u_id not in", values, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdBetween(Integer value1, Integer value2) {
            addCriterion("a_u_id between", value1, value2, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_u_id not between", value1, value2, "aUId");
            return (Criteria) this;
        }

        public Criteria andANewarticleIsNull() {
            addCriterion("a_newarticle is null");
            return (Criteria) this;
        }

        public Criteria andANewarticleIsNotNull() {
            addCriterion("a_newarticle is not null");
            return (Criteria) this;
        }

        public Criteria andANewarticleEqualTo(Integer value) {
            addCriterion("a_newarticle =", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleNotEqualTo(Integer value) {
            addCriterion("a_newarticle <>", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleGreaterThan(Integer value) {
            addCriterion("a_newarticle >", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_newarticle >=", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleLessThan(Integer value) {
            addCriterion("a_newarticle <", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleLessThanOrEqualTo(Integer value) {
            addCriterion("a_newarticle <=", value, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleIn(List<Integer> values) {
            addCriterion("a_newarticle in", values, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleNotIn(List<Integer> values) {
            addCriterion("a_newarticle not in", values, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleBetween(Integer value1, Integer value2) {
            addCriterion("a_newarticle between", value1, value2, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andANewarticleNotBetween(Integer value1, Integer value2) {
            addCriterion("a_newarticle not between", value1, value2, "aNewarticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleIsNull() {
            addCriterion("a_onearticle is null");
            return (Criteria) this;
        }

        public Criteria andAOnearticleIsNotNull() {
            addCriterion("a_onearticle is not null");
            return (Criteria) this;
        }

        public Criteria andAOnearticleEqualTo(Integer value) {
            addCriterion("a_onearticle =", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleNotEqualTo(Integer value) {
            addCriterion("a_onearticle <>", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleGreaterThan(Integer value) {
            addCriterion("a_onearticle >", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_onearticle >=", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleLessThan(Integer value) {
            addCriterion("a_onearticle <", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleLessThanOrEqualTo(Integer value) {
            addCriterion("a_onearticle <=", value, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleIn(List<Integer> values) {
            addCriterion("a_onearticle in", values, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleNotIn(List<Integer> values) {
            addCriterion("a_onearticle not in", values, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleBetween(Integer value1, Integer value2) {
            addCriterion("a_onearticle between", value1, value2, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAOnearticleNotBetween(Integer value1, Integer value2) {
            addCriterion("a_onearticle not between", value1, value2, "aOnearticle");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousIsNull() {
            addCriterion("a_allfabulous is null");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousIsNotNull() {
            addCriterion("a_allfabulous is not null");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousEqualTo(Integer value) {
            addCriterion("a_allfabulous =", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousNotEqualTo(Integer value) {
            addCriterion("a_allfabulous <>", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousGreaterThan(Integer value) {
            addCriterion("a_allfabulous >", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_allfabulous >=", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousLessThan(Integer value) {
            addCriterion("a_allfabulous <", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousLessThanOrEqualTo(Integer value) {
            addCriterion("a_allfabulous <=", value, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousIn(List<Integer> values) {
            addCriterion("a_allfabulous in", values, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousNotIn(List<Integer> values) {
            addCriterion("a_allfabulous not in", values, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousBetween(Integer value1, Integer value2) {
            addCriterion("a_allfabulous between", value1, value2, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllfabulousNotBetween(Integer value1, Integer value2) {
            addCriterion("a_allfabulous not between", value1, value2, "aAllfabulous");
            return (Criteria) this;
        }

        public Criteria andAAllcommentIsNull() {
            addCriterion("a_allcomment is null");
            return (Criteria) this;
        }

        public Criteria andAAllcommentIsNotNull() {
            addCriterion("a_allcomment is not null");
            return (Criteria) this;
        }

        public Criteria andAAllcommentEqualTo(Integer value) {
            addCriterion("a_allcomment =", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentNotEqualTo(Integer value) {
            addCriterion("a_allcomment <>", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentGreaterThan(Integer value) {
            addCriterion("a_allcomment >", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_allcomment >=", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentLessThan(Integer value) {
            addCriterion("a_allcomment <", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentLessThanOrEqualTo(Integer value) {
            addCriterion("a_allcomment <=", value, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentIn(List<Integer> values) {
            addCriterion("a_allcomment in", values, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentNotIn(List<Integer> values) {
            addCriterion("a_allcomment not in", values, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentBetween(Integer value1, Integer value2) {
            addCriterion("a_allcomment between", value1, value2, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllcommentNotBetween(Integer value1, Integer value2) {
            addCriterion("a_allcomment not between", value1, value2, "aAllcomment");
            return (Criteria) this;
        }

        public Criteria andAAllrewardIsNull() {
            addCriterion("a_allreward is null");
            return (Criteria) this;
        }

        public Criteria andAAllrewardIsNotNull() {
            addCriterion("a_allreward is not null");
            return (Criteria) this;
        }

        public Criteria andAAllrewardEqualTo(Integer value) {
            addCriterion("a_allreward =", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardNotEqualTo(Integer value) {
            addCriterion("a_allreward <>", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardGreaterThan(Integer value) {
            addCriterion("a_allreward >", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_allreward >=", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardLessThan(Integer value) {
            addCriterion("a_allreward <", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardLessThanOrEqualTo(Integer value) {
            addCriterion("a_allreward <=", value, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardIn(List<Integer> values) {
            addCriterion("a_allreward in", values, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardNotIn(List<Integer> values) {
            addCriterion("a_allreward not in", values, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardBetween(Integer value1, Integer value2) {
            addCriterion("a_allreward between", value1, value2, "aAllreward");
            return (Criteria) this;
        }

        public Criteria andAAllrewardNotBetween(Integer value1, Integer value2) {
            addCriterion("a_allreward not between", value1, value2, "aAllreward");
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