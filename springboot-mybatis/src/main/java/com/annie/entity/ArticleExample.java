package com.annie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andAaIdIsNull() {
            addCriterion("aa_id is null");
            return (Criteria) this;
        }

        public Criteria andAaIdIsNotNull() {
            addCriterion("aa_id is not null");
            return (Criteria) this;
        }

        public Criteria andAaIdEqualTo(Integer value) {
            addCriterion("aa_id =", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdNotEqualTo(Integer value) {
            addCriterion("aa_id <>", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdGreaterThan(Integer value) {
            addCriterion("aa_id >", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_id >=", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdLessThan(Integer value) {
            addCriterion("aa_id <", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdLessThanOrEqualTo(Integer value) {
            addCriterion("aa_id <=", value, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdIn(List<Integer> values) {
            addCriterion("aa_id in", values, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdNotIn(List<Integer> values) {
            addCriterion("aa_id not in", values, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdBetween(Integer value1, Integer value2) {
            addCriterion("aa_id between", value1, value2, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_id not between", value1, value2, "aaId");
            return (Criteria) this;
        }

        public Criteria andAaAIdIsNull() {
            addCriterion("aa_a_id is null");
            return (Criteria) this;
        }

        public Criteria andAaAIdIsNotNull() {
            addCriterion("aa_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAaAIdEqualTo(Integer value) {
            addCriterion("aa_a_id =", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdNotEqualTo(Integer value) {
            addCriterion("aa_a_id <>", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdGreaterThan(Integer value) {
            addCriterion("aa_a_id >", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_a_id >=", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdLessThan(Integer value) {
            addCriterion("aa_a_id <", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdLessThanOrEqualTo(Integer value) {
            addCriterion("aa_a_id <=", value, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdIn(List<Integer> values) {
            addCriterion("aa_a_id in", values, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdNotIn(List<Integer> values) {
            addCriterion("aa_a_id not in", values, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdBetween(Integer value1, Integer value2) {
            addCriterion("aa_a_id between", value1, value2, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_a_id not between", value1, value2, "aaAId");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeIsNull() {
            addCriterion("aa_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeIsNotNull() {
            addCriterion("aa_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeEqualTo(Date value) {
            addCriterion("aa_createtime =", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeNotEqualTo(Date value) {
            addCriterion("aa_createtime <>", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeGreaterThan(Date value) {
            addCriterion("aa_createtime >", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aa_createtime >=", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeLessThan(Date value) {
            addCriterion("aa_createtime <", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("aa_createtime <=", value, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeIn(List<Date> values) {
            addCriterion("aa_createtime in", values, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeNotIn(List<Date> values) {
            addCriterion("aa_createtime not in", values, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeBetween(Date value1, Date value2) {
            addCriterion("aa_createtime between", value1, value2, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("aa_createtime not between", value1, value2, "aaCreatetime");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadIsNull() {
            addCriterion("aa_articlehead is null");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadIsNotNull() {
            addCriterion("aa_articlehead is not null");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadEqualTo(String value) {
            addCriterion("aa_articlehead =", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadNotEqualTo(String value) {
            addCriterion("aa_articlehead <>", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadGreaterThan(String value) {
            addCriterion("aa_articlehead >", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadGreaterThanOrEqualTo(String value) {
            addCriterion("aa_articlehead >=", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadLessThan(String value) {
            addCriterion("aa_articlehead <", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadLessThanOrEqualTo(String value) {
            addCriterion("aa_articlehead <=", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadLike(String value) {
            addCriterion("aa_articlehead like", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadNotLike(String value) {
            addCriterion("aa_articlehead not like", value, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadIn(List<String> values) {
            addCriterion("aa_articlehead in", values, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadNotIn(List<String> values) {
            addCriterion("aa_articlehead not in", values, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadBetween(String value1, String value2) {
            addCriterion("aa_articlehead between", value1, value2, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadNotBetween(String value1, String value2) {
            addCriterion("aa_articlehead not between", value1, value2, "aaArticlehead");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsIsNull() {
            addCriterion("aa_articleheads is null");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsIsNotNull() {
            addCriterion("aa_articleheads is not null");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsEqualTo(String value) {
            addCriterion("aa_articleheads =", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsNotEqualTo(String value) {
            addCriterion("aa_articleheads <>", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsGreaterThan(String value) {
            addCriterion("aa_articleheads >", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsGreaterThanOrEqualTo(String value) {
            addCriterion("aa_articleheads >=", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsLessThan(String value) {
            addCriterion("aa_articleheads <", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsLessThanOrEqualTo(String value) {
            addCriterion("aa_articleheads <=", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsLike(String value) {
            addCriterion("aa_articleheads like", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsNotLike(String value) {
            addCriterion("aa_articleheads not like", value, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsIn(List<String> values) {
            addCriterion("aa_articleheads in", values, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsNotIn(List<String> values) {
            addCriterion("aa_articleheads not in", values, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsBetween(String value1, String value2) {
            addCriterion("aa_articleheads between", value1, value2, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaArticleheadsNotBetween(String value1, String value2) {
            addCriterion("aa_articleheads not between", value1, value2, "aaArticleheads");
            return (Criteria) this;
        }

        public Criteria andAaClickIsNull() {
            addCriterion("aa_click is null");
            return (Criteria) this;
        }

        public Criteria andAaClickIsNotNull() {
            addCriterion("aa_click is not null");
            return (Criteria) this;
        }

        public Criteria andAaClickEqualTo(Integer value) {
            addCriterion("aa_click =", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickNotEqualTo(Integer value) {
            addCriterion("aa_click <>", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickGreaterThan(Integer value) {
            addCriterion("aa_click >", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_click >=", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickLessThan(Integer value) {
            addCriterion("aa_click <", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickLessThanOrEqualTo(Integer value) {
            addCriterion("aa_click <=", value, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickIn(List<Integer> values) {
            addCriterion("aa_click in", values, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickNotIn(List<Integer> values) {
            addCriterion("aa_click not in", values, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickBetween(Integer value1, Integer value2) {
            addCriterion("aa_click between", value1, value2, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaClickNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_click not between", value1, value2, "aaClick");
            return (Criteria) this;
        }

        public Criteria andAaBulouIsNull() {
            addCriterion("aa_bulou is null");
            return (Criteria) this;
        }

        public Criteria andAaBulouIsNotNull() {
            addCriterion("aa_bulou is not null");
            return (Criteria) this;
        }

        public Criteria andAaBulouEqualTo(Integer value) {
            addCriterion("aa_bulou =", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouNotEqualTo(Integer value) {
            addCriterion("aa_bulou <>", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouGreaterThan(Integer value) {
            addCriterion("aa_bulou >", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_bulou >=", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouLessThan(Integer value) {
            addCriterion("aa_bulou <", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouLessThanOrEqualTo(Integer value) {
            addCriterion("aa_bulou <=", value, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouIn(List<Integer> values) {
            addCriterion("aa_bulou in", values, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouNotIn(List<Integer> values) {
            addCriterion("aa_bulou not in", values, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouBetween(Integer value1, Integer value2) {
            addCriterion("aa_bulou between", value1, value2, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaBulouNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_bulou not between", value1, value2, "aaBulou");
            return (Criteria) this;
        }

        public Criteria andAaCommentIsNull() {
            addCriterion("aa_comment is null");
            return (Criteria) this;
        }

        public Criteria andAaCommentIsNotNull() {
            addCriterion("aa_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAaCommentEqualTo(Integer value) {
            addCriterion("aa_comment =", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentNotEqualTo(Integer value) {
            addCriterion("aa_comment <>", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentGreaterThan(Integer value) {
            addCriterion("aa_comment >", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_comment >=", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentLessThan(Integer value) {
            addCriterion("aa_comment <", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentLessThanOrEqualTo(Integer value) {
            addCriterion("aa_comment <=", value, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentIn(List<Integer> values) {
            addCriterion("aa_comment in", values, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentNotIn(List<Integer> values) {
            addCriterion("aa_comment not in", values, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentBetween(Integer value1, Integer value2) {
            addCriterion("aa_comment between", value1, value2, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_comment not between", value1, value2, "aaComment");
            return (Criteria) this;
        }

        public Criteria andAaRewardIsNull() {
            addCriterion("aa_reward is null");
            return (Criteria) this;
        }

        public Criteria andAaRewardIsNotNull() {
            addCriterion("aa_reward is not null");
            return (Criteria) this;
        }

        public Criteria andAaRewardEqualTo(Integer value) {
            addCriterion("aa_reward =", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardNotEqualTo(Integer value) {
            addCriterion("aa_reward <>", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardGreaterThan(Integer value) {
            addCriterion("aa_reward >", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_reward >=", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardLessThan(Integer value) {
            addCriterion("aa_reward <", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardLessThanOrEqualTo(Integer value) {
            addCriterion("aa_reward <=", value, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardIn(List<Integer> values) {
            addCriterion("aa_reward in", values, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardNotIn(List<Integer> values) {
            addCriterion("aa_reward not in", values, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardBetween(Integer value1, Integer value2) {
            addCriterion("aa_reward between", value1, value2, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_reward not between", value1, value2, "aaReward");
            return (Criteria) this;
        }

        public Criteria andAaUIdIsNull() {
            addCriterion("aa_u_id is null");
            return (Criteria) this;
        }

        public Criteria andAaUIdIsNotNull() {
            addCriterion("aa_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andAaUIdEqualTo(Integer value) {
            addCriterion("aa_u_id =", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdNotEqualTo(Integer value) {
            addCriterion("aa_u_id <>", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdGreaterThan(Integer value) {
            addCriterion("aa_u_id >", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aa_u_id >=", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdLessThan(Integer value) {
            addCriterion("aa_u_id <", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdLessThanOrEqualTo(Integer value) {
            addCriterion("aa_u_id <=", value, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdIn(List<Integer> values) {
            addCriterion("aa_u_id in", values, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdNotIn(List<Integer> values) {
            addCriterion("aa_u_id not in", values, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdBetween(Integer value1, Integer value2) {
            addCriterion("aa_u_id between", value1, value2, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAaUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aa_u_id not between", value1, value2, "aaUId");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNull() {
            addCriterion("a_status is null");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNotNull() {
            addCriterion("a_status is not null");
            return (Criteria) this;
        }

        public Criteria andAStatusEqualTo(Integer value) {
            addCriterion("a_status =", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotEqualTo(Integer value) {
            addCriterion("a_status <>", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThan(Integer value) {
            addCriterion("a_status >", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_status >=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThan(Integer value) {
            addCriterion("a_status <", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThanOrEqualTo(Integer value) {
            addCriterion("a_status <=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusIn(List<Integer> values) {
            addCriterion("a_status in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotIn(List<Integer> values) {
            addCriterion("a_status not in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusBetween(Integer value1, Integer value2) {
            addCriterion("a_status between", value1, value2, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("a_status not between", value1, value2, "aStatus");
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