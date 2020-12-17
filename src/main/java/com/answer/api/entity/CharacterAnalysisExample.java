package com.answer.api.entity;

import java.util.ArrayList;
import java.util.List;

public class CharacterAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CharacterAnalysisExample() {
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

        public Criteria andCharacterNameIsNull() {
            addCriterion("character_name is null");
            return (Criteria) this;
        }

        public Criteria andCharacterNameIsNotNull() {
            addCriterion("character_name is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterNameEqualTo(String value) {
            addCriterion("character_name =", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameNotEqualTo(String value) {
            addCriterion("character_name <>", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameGreaterThan(String value) {
            addCriterion("character_name >", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameGreaterThanOrEqualTo(String value) {
            addCriterion("character_name >=", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameLessThan(String value) {
            addCriterion("character_name <", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameLessThanOrEqualTo(String value) {
            addCriterion("character_name <=", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameLike(String value) {
            addCriterion("character_name like", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameNotLike(String value) {
            addCriterion("character_name not like", value, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameIn(List<String> values) {
            addCriterion("character_name in", values, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameNotIn(List<String> values) {
            addCriterion("character_name not in", values, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameBetween(String value1, String value2) {
            addCriterion("character_name between", value1, value2, "characterName");
            return (Criteria) this;
        }

        public Criteria andCharacterNameNotBetween(String value1, String value2) {
            addCriterion("character_name not between", value1, value2, "characterName");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileIsNull() {
            addCriterion("personality_profile is null");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileIsNotNull() {
            addCriterion("personality_profile is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileEqualTo(String value) {
            addCriterion("personality_profile =", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileNotEqualTo(String value) {
            addCriterion("personality_profile <>", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileGreaterThan(String value) {
            addCriterion("personality_profile >", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileGreaterThanOrEqualTo(String value) {
            addCriterion("personality_profile >=", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileLessThan(String value) {
            addCriterion("personality_profile <", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileLessThanOrEqualTo(String value) {
            addCriterion("personality_profile <=", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileLike(String value) {
            addCriterion("personality_profile like", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileNotLike(String value) {
            addCriterion("personality_profile not like", value, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileIn(List<String> values) {
            addCriterion("personality_profile in", values, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileNotIn(List<String> values) {
            addCriterion("personality_profile not in", values, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileBetween(String value1, String value2) {
            addCriterion("personality_profile between", value1, value2, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityProfileNotBetween(String value1, String value2) {
            addCriterion("personality_profile not between", value1, value2, "personalityProfile");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsIsNull() {
            addCriterion("personality_characteristics is null");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsIsNotNull() {
            addCriterion("personality_characteristics is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsEqualTo(String value) {
            addCriterion("personality_characteristics =", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsNotEqualTo(String value) {
            addCriterion("personality_characteristics <>", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsGreaterThan(String value) {
            addCriterion("personality_characteristics >", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("personality_characteristics >=", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsLessThan(String value) {
            addCriterion("personality_characteristics <", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("personality_characteristics <=", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsLike(String value) {
            addCriterion("personality_characteristics like", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsNotLike(String value) {
            addCriterion("personality_characteristics not like", value, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsIn(List<String> values) {
            addCriterion("personality_characteristics in", values, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsNotIn(List<String> values) {
            addCriterion("personality_characteristics not in", values, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsBetween(String value1, String value2) {
            addCriterion("personality_characteristics between", value1, value2, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andPersonalityCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("personality_characteristics not between", value1, value2, "personalityCharacteristics");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNull() {
            addCriterion("advantage is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNotNull() {
            addCriterion("advantage is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageEqualTo(String value) {
            addCriterion("advantage =", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotEqualTo(String value) {
            addCriterion("advantage <>", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThan(String value) {
            addCriterion("advantage >", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("advantage >=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThan(String value) {
            addCriterion("advantage <", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThanOrEqualTo(String value) {
            addCriterion("advantage <=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLike(String value) {
            addCriterion("advantage like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotLike(String value) {
            addCriterion("advantage not like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageIn(List<String> values) {
            addCriterion("advantage in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotIn(List<String> values) {
            addCriterion("advantage not in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageBetween(String value1, String value2) {
            addCriterion("advantage between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotBetween(String value1, String value2) {
            addCriterion("advantage not between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andShortcomingIsNull() {
            addCriterion("shortcoming is null");
            return (Criteria) this;
        }

        public Criteria andShortcomingIsNotNull() {
            addCriterion("shortcoming is not null");
            return (Criteria) this;
        }

        public Criteria andShortcomingEqualTo(String value) {
            addCriterion("shortcoming =", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingNotEqualTo(String value) {
            addCriterion("shortcoming <>", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingGreaterThan(String value) {
            addCriterion("shortcoming >", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingGreaterThanOrEqualTo(String value) {
            addCriterion("shortcoming >=", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingLessThan(String value) {
            addCriterion("shortcoming <", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingLessThanOrEqualTo(String value) {
            addCriterion("shortcoming <=", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingLike(String value) {
            addCriterion("shortcoming like", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingNotLike(String value) {
            addCriterion("shortcoming not like", value, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingIn(List<String> values) {
            addCriterion("shortcoming in", values, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingNotIn(List<String> values) {
            addCriterion("shortcoming not in", values, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingBetween(String value1, String value2) {
            addCriterion("shortcoming between", value1, value2, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andShortcomingNotBetween(String value1, String value2) {
            addCriterion("shortcoming not between", value1, value2, "shortcoming");
            return (Criteria) this;
        }

        public Criteria andWorkStyleIsNull() {
            addCriterion("work_style is null");
            return (Criteria) this;
        }

        public Criteria andWorkStyleIsNotNull() {
            addCriterion("work_style is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStyleEqualTo(String value) {
            addCriterion("work_style =", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleNotEqualTo(String value) {
            addCriterion("work_style <>", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleGreaterThan(String value) {
            addCriterion("work_style >", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleGreaterThanOrEqualTo(String value) {
            addCriterion("work_style >=", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleLessThan(String value) {
            addCriterion("work_style <", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleLessThanOrEqualTo(String value) {
            addCriterion("work_style <=", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleLike(String value) {
            addCriterion("work_style like", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleNotLike(String value) {
            addCriterion("work_style not like", value, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleIn(List<String> values) {
            addCriterion("work_style in", values, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleNotIn(List<String> values) {
            addCriterion("work_style not in", values, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleBetween(String value1, String value2) {
            addCriterion("work_style between", value1, value2, "workStyle");
            return (Criteria) this;
        }

        public Criteria andWorkStyleNotBetween(String value1, String value2) {
            addCriterion("work_style not between", value1, value2, "workStyle");
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