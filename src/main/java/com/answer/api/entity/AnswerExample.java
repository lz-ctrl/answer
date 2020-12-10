package com.answer.api.entity;

import java.util.ArrayList;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andQuestionsIsNull() {
            addCriterion("questions is null");
            return (Criteria) this;
        }

        public Criteria andQuestionsIsNotNull() {
            addCriterion("questions is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionsEqualTo(String value) {
            addCriterion("questions =", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotEqualTo(String value) {
            addCriterion("questions <>", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsGreaterThan(String value) {
            addCriterion("questions >", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsGreaterThanOrEqualTo(String value) {
            addCriterion("questions >=", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLessThan(String value) {
            addCriterion("questions <", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLessThanOrEqualTo(String value) {
            addCriterion("questions <=", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLike(String value) {
            addCriterion("questions like", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotLike(String value) {
            addCriterion("questions not like", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsIn(List<String> values) {
            addCriterion("questions in", values, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotIn(List<String> values) {
            addCriterion("questions not in", values, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsBetween(String value1, String value2) {
            addCriterion("questions between", value1, value2, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotBetween(String value1, String value2) {
            addCriterion("questions not between", value1, value2, "questions");
            return (Criteria) this;
        }

        public Criteria andAIsNull() {
            addCriterion("A is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("A is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(String value) {
            addCriterion("A =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(String value) {
            addCriterion("A <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(String value) {
            addCriterion("A >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(String value) {
            addCriterion("A >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(String value) {
            addCriterion("A <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(String value) {
            addCriterion("A <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALike(String value) {
            addCriterion("A like", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotLike(String value) {
            addCriterion("A not like", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<String> values) {
            addCriterion("A in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<String> values) {
            addCriterion("A not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(String value1, String value2) {
            addCriterion("A between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(String value1, String value2) {
            addCriterion("A not between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("B is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("B is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(String value) {
            addCriterion("B =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(String value) {
            addCriterion("B <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(String value) {
            addCriterion("B >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(String value) {
            addCriterion("B >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(String value) {
            addCriterion("B <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(String value) {
            addCriterion("B <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLike(String value) {
            addCriterion("B like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotLike(String value) {
            addCriterion("B not like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<String> values) {
            addCriterion("B in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<String> values) {
            addCriterion("B not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(String value1, String value2) {
            addCriterion("B between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(String value1, String value2) {
            addCriterion("B not between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("C is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("C is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("C =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("C <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("C >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("C >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("C <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("C <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("C like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("C not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("C in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("C not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("C between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("C not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("D is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("D is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(String value) {
            addCriterion("D =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(String value) {
            addCriterion("D <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(String value) {
            addCriterion("D >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(String value) {
            addCriterion("D >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(String value) {
            addCriterion("D <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(String value) {
            addCriterion("D <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLike(String value) {
            addCriterion("D like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotLike(String value) {
            addCriterion("D not like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<String> values) {
            addCriterion("D in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<String> values) {
            addCriterion("D not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(String value1, String value2) {
            addCriterion("D between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(String value1, String value2) {
            addCriterion("D not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andEIsNull() {
            addCriterion("E is null");
            return (Criteria) this;
        }

        public Criteria andEIsNotNull() {
            addCriterion("E is not null");
            return (Criteria) this;
        }

        public Criteria andEEqualTo(String value) {
            addCriterion("E =", value, "e");
            return (Criteria) this;
        }

        public Criteria andENotEqualTo(String value) {
            addCriterion("E <>", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThan(String value) {
            addCriterion("E >", value, "e");
            return (Criteria) this;
        }

        public Criteria andEGreaterThanOrEqualTo(String value) {
            addCriterion("E >=", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThan(String value) {
            addCriterion("E <", value, "e");
            return (Criteria) this;
        }

        public Criteria andELessThanOrEqualTo(String value) {
            addCriterion("E <=", value, "e");
            return (Criteria) this;
        }

        public Criteria andELike(String value) {
            addCriterion("E like", value, "e");
            return (Criteria) this;
        }

        public Criteria andENotLike(String value) {
            addCriterion("E not like", value, "e");
            return (Criteria) this;
        }

        public Criteria andEIn(List<String> values) {
            addCriterion("E in", values, "e");
            return (Criteria) this;
        }

        public Criteria andENotIn(List<String> values) {
            addCriterion("E not in", values, "e");
            return (Criteria) this;
        }

        public Criteria andEBetween(String value1, String value2) {
            addCriterion("E between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andENotBetween(String value1, String value2) {
            addCriterion("E not between", value1, value2, "e");
            return (Criteria) this;
        }

        public Criteria andAfIsNull() {
            addCriterion("AF is null");
            return (Criteria) this;
        }

        public Criteria andAfIsNotNull() {
            addCriterion("AF is not null");
            return (Criteria) this;
        }

        public Criteria andAfEqualTo(String value) {
            addCriterion("AF =", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotEqualTo(String value) {
            addCriterion("AF <>", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfGreaterThan(String value) {
            addCriterion("AF >", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfGreaterThanOrEqualTo(String value) {
            addCriterion("AF >=", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLessThan(String value) {
            addCriterion("AF <", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLessThanOrEqualTo(String value) {
            addCriterion("AF <=", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfLike(String value) {
            addCriterion("AF like", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotLike(String value) {
            addCriterion("AF not like", value, "af");
            return (Criteria) this;
        }

        public Criteria andAfIn(List<String> values) {
            addCriterion("AF in", values, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotIn(List<String> values) {
            addCriterion("AF not in", values, "af");
            return (Criteria) this;
        }

        public Criteria andAfBetween(String value1, String value2) {
            addCriterion("AF between", value1, value2, "af");
            return (Criteria) this;
        }

        public Criteria andAfNotBetween(String value1, String value2) {
            addCriterion("AF not between", value1, value2, "af");
            return (Criteria) this;
        }

        public Criteria andBfIsNull() {
            addCriterion("BF is null");
            return (Criteria) this;
        }

        public Criteria andBfIsNotNull() {
            addCriterion("BF is not null");
            return (Criteria) this;
        }

        public Criteria andBfEqualTo(String value) {
            addCriterion("BF =", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotEqualTo(String value) {
            addCriterion("BF <>", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfGreaterThan(String value) {
            addCriterion("BF >", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfGreaterThanOrEqualTo(String value) {
            addCriterion("BF >=", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLessThan(String value) {
            addCriterion("BF <", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLessThanOrEqualTo(String value) {
            addCriterion("BF <=", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfLike(String value) {
            addCriterion("BF like", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotLike(String value) {
            addCriterion("BF not like", value, "bf");
            return (Criteria) this;
        }

        public Criteria andBfIn(List<String> values) {
            addCriterion("BF in", values, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotIn(List<String> values) {
            addCriterion("BF not in", values, "bf");
            return (Criteria) this;
        }

        public Criteria andBfBetween(String value1, String value2) {
            addCriterion("BF between", value1, value2, "bf");
            return (Criteria) this;
        }

        public Criteria andBfNotBetween(String value1, String value2) {
            addCriterion("BF not between", value1, value2, "bf");
            return (Criteria) this;
        }

        public Criteria andCfIsNull() {
            addCriterion("CF is null");
            return (Criteria) this;
        }

        public Criteria andCfIsNotNull() {
            addCriterion("CF is not null");
            return (Criteria) this;
        }

        public Criteria andCfEqualTo(String value) {
            addCriterion("CF =", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotEqualTo(String value) {
            addCriterion("CF <>", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThan(String value) {
            addCriterion("CF >", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThanOrEqualTo(String value) {
            addCriterion("CF >=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThan(String value) {
            addCriterion("CF <", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThanOrEqualTo(String value) {
            addCriterion("CF <=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLike(String value) {
            addCriterion("CF like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotLike(String value) {
            addCriterion("CF not like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfIn(List<String> values) {
            addCriterion("CF in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotIn(List<String> values) {
            addCriterion("CF not in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfBetween(String value1, String value2) {
            addCriterion("CF between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotBetween(String value1, String value2) {
            addCriterion("CF not between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andDfIsNull() {
            addCriterion("DF is null");
            return (Criteria) this;
        }

        public Criteria andDfIsNotNull() {
            addCriterion("DF is not null");
            return (Criteria) this;
        }

        public Criteria andDfEqualTo(String value) {
            addCriterion("DF =", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotEqualTo(String value) {
            addCriterion("DF <>", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThan(String value) {
            addCriterion("DF >", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfGreaterThanOrEqualTo(String value) {
            addCriterion("DF >=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThan(String value) {
            addCriterion("DF <", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLessThanOrEqualTo(String value) {
            addCriterion("DF <=", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfLike(String value) {
            addCriterion("DF like", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotLike(String value) {
            addCriterion("DF not like", value, "df");
            return (Criteria) this;
        }

        public Criteria andDfIn(List<String> values) {
            addCriterion("DF in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotIn(List<String> values) {
            addCriterion("DF not in", values, "df");
            return (Criteria) this;
        }

        public Criteria andDfBetween(String value1, String value2) {
            addCriterion("DF between", value1, value2, "df");
            return (Criteria) this;
        }

        public Criteria andDfNotBetween(String value1, String value2) {
            addCriterion("DF not between", value1, value2, "df");
            return (Criteria) this;
        }

        public Criteria andEfIsNull() {
            addCriterion("EF is null");
            return (Criteria) this;
        }

        public Criteria andEfIsNotNull() {
            addCriterion("EF is not null");
            return (Criteria) this;
        }

        public Criteria andEfEqualTo(String value) {
            addCriterion("EF =", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotEqualTo(String value) {
            addCriterion("EF <>", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThan(String value) {
            addCriterion("EF >", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfGreaterThanOrEqualTo(String value) {
            addCriterion("EF >=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThan(String value) {
            addCriterion("EF <", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLessThanOrEqualTo(String value) {
            addCriterion("EF <=", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfLike(String value) {
            addCriterion("EF like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotLike(String value) {
            addCriterion("EF not like", value, "ef");
            return (Criteria) this;
        }

        public Criteria andEfIn(List<String> values) {
            addCriterion("EF in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotIn(List<String> values) {
            addCriterion("EF not in", values, "ef");
            return (Criteria) this;
        }

        public Criteria andEfBetween(String value1, String value2) {
            addCriterion("EF between", value1, value2, "ef");
            return (Criteria) this;
        }

        public Criteria andEfNotBetween(String value1, String value2) {
            addCriterion("EF not between", value1, value2, "ef");
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