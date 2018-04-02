package com.biz.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleMainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleMainDataExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerIsNull() {
            addCriterion("seen_policymaker is null");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerIsNotNull() {
            addCriterion("seen_policymaker is not null");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerEqualTo(String value) {
            addCriterion("seen_policymaker =", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerNotEqualTo(String value) {
            addCriterion("seen_policymaker <>", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerGreaterThan(String value) {
            addCriterion("seen_policymaker >", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerGreaterThanOrEqualTo(String value) {
            addCriterion("seen_policymaker >=", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerLessThan(String value) {
            addCriterion("seen_policymaker <", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerLessThanOrEqualTo(String value) {
            addCriterion("seen_policymaker <=", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerLike(String value) {
            addCriterion("seen_policymaker like", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerNotLike(String value) {
            addCriterion("seen_policymaker not like", value, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerIn(List<String> values) {
            addCriterion("seen_policymaker in", values, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerNotIn(List<String> values) {
            addCriterion("seen_policymaker not in", values, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerBetween(String value1, String value2) {
            addCriterion("seen_policymaker between", value1, value2, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andSeenPolicymakerNotBetween(String value1, String value2) {
            addCriterion("seen_policymaker not between", value1, value2, "seenPolicymaker");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionIsNull() {
            addCriterion("policymaker_position is null");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionIsNotNull() {
            addCriterion("policymaker_position is not null");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionEqualTo(String value) {
            addCriterion("policymaker_position =", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionNotEqualTo(String value) {
            addCriterion("policymaker_position <>", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionGreaterThan(String value) {
            addCriterion("policymaker_position >", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionGreaterThanOrEqualTo(String value) {
            addCriterion("policymaker_position >=", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionLessThan(String value) {
            addCriterion("policymaker_position <", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionLessThanOrEqualTo(String value) {
            addCriterion("policymaker_position <=", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionLike(String value) {
            addCriterion("policymaker_position like", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionNotLike(String value) {
            addCriterion("policymaker_position not like", value, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionIn(List<String> values) {
            addCriterion("policymaker_position in", values, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionNotIn(List<String> values) {
            addCriterion("policymaker_position not in", values, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionBetween(String value1, String value2) {
            addCriterion("policymaker_position between", value1, value2, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andPolicymakerPositionNotBetween(String value1, String value2) {
            addCriterion("policymaker_position not between", value1, value2, "policymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerIsNull() {
            addCriterion("done_policymaker is null");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerIsNotNull() {
            addCriterion("done_policymaker is not null");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerEqualTo(String value) {
            addCriterion("done_policymaker =", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerNotEqualTo(String value) {
            addCriterion("done_policymaker <>", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerGreaterThan(String value) {
            addCriterion("done_policymaker >", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerGreaterThanOrEqualTo(String value) {
            addCriterion("done_policymaker >=", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerLessThan(String value) {
            addCriterion("done_policymaker <", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerLessThanOrEqualTo(String value) {
            addCriterion("done_policymaker <=", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerLike(String value) {
            addCriterion("done_policymaker like", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerNotLike(String value) {
            addCriterion("done_policymaker not like", value, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerIn(List<String> values) {
            addCriterion("done_policymaker in", values, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerNotIn(List<String> values) {
            addCriterion("done_policymaker not in", values, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerBetween(String value1, String value2) {
            addCriterion("done_policymaker between", value1, value2, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerNotBetween(String value1, String value2) {
            addCriterion("done_policymaker not between", value1, value2, "donePolicymaker");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionIsNull() {
            addCriterion("done_policymaker_position is null");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionIsNotNull() {
            addCriterion("done_policymaker_position is not null");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionEqualTo(String value) {
            addCriterion("done_policymaker_position =", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionNotEqualTo(String value) {
            addCriterion("done_policymaker_position <>", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionGreaterThan(String value) {
            addCriterion("done_policymaker_position >", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionGreaterThanOrEqualTo(String value) {
            addCriterion("done_policymaker_position >=", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionLessThan(String value) {
            addCriterion("done_policymaker_position <", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionLessThanOrEqualTo(String value) {
            addCriterion("done_policymaker_position <=", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionLike(String value) {
            addCriterion("done_policymaker_position like", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionNotLike(String value) {
            addCriterion("done_policymaker_position not like", value, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionIn(List<String> values) {
            addCriterion("done_policymaker_position in", values, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionNotIn(List<String> values) {
            addCriterion("done_policymaker_position not in", values, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionBetween(String value1, String value2) {
            addCriterion("done_policymaker_position between", value1, value2, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andDonePolicymakerPositionNotBetween(String value1, String value2) {
            addCriterion("done_policymaker_position not between", value1, value2, "donePolicymakerPosition");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNull() {
            addCriterion("is_real is null");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNotNull() {
            addCriterion("is_real is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealEqualTo(String value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(String value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(String value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(String value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(String value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(String value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLike(String value) {
            addCriterion("is_real like", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotLike(String value) {
            addCriterion("is_real not like", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<String> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<String> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(String value1, String value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(String value1, String value2) {
            addCriterion("is_real not between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentIsNull() {
            addCriterion("is_real_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentIsNotNull() {
            addCriterion("is_real_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentEqualTo(String value) {
            addCriterion("is_real_comment =", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentNotEqualTo(String value) {
            addCriterion("is_real_comment <>", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentGreaterThan(String value) {
            addCriterion("is_real_comment >", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentGreaterThanOrEqualTo(String value) {
            addCriterion("is_real_comment >=", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentLessThan(String value) {
            addCriterion("is_real_comment <", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentLessThanOrEqualTo(String value) {
            addCriterion("is_real_comment <=", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentLike(String value) {
            addCriterion("is_real_comment like", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentNotLike(String value) {
            addCriterion("is_real_comment not like", value, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentIn(List<String> values) {
            addCriterion("is_real_comment in", values, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentNotIn(List<String> values) {
            addCriterion("is_real_comment not in", values, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentBetween(String value1, String value2) {
            addCriterion("is_real_comment between", value1, value2, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andIsRealCommentNotBetween(String value1, String value2) {
            addCriterion("is_real_comment not between", value1, value2, "isRealComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpIsNull() {
            addCriterion("five_user_up is null");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpIsNotNull() {
            addCriterion("five_user_up is not null");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpEqualTo(String value) {
            addCriterion("five_user_up =", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpNotEqualTo(String value) {
            addCriterion("five_user_up <>", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpGreaterThan(String value) {
            addCriterion("five_user_up >", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpGreaterThanOrEqualTo(String value) {
            addCriterion("five_user_up >=", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpLessThan(String value) {
            addCriterion("five_user_up <", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpLessThanOrEqualTo(String value) {
            addCriterion("five_user_up <=", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpLike(String value) {
            addCriterion("five_user_up like", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpNotLike(String value) {
            addCriterion("five_user_up not like", value, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpIn(List<String> values) {
            addCriterion("five_user_up in", values, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpNotIn(List<String> values) {
            addCriterion("five_user_up not in", values, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpBetween(String value1, String value2) {
            addCriterion("five_user_up between", value1, value2, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpNotBetween(String value1, String value2) {
            addCriterion("five_user_up not between", value1, value2, "fiveUserUp");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentIsNull() {
            addCriterion("five_user_up_comment is null");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentIsNotNull() {
            addCriterion("five_user_up_comment is not null");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentEqualTo(String value) {
            addCriterion("five_user_up_comment =", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentNotEqualTo(String value) {
            addCriterion("five_user_up_comment <>", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentGreaterThan(String value) {
            addCriterion("five_user_up_comment >", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentGreaterThanOrEqualTo(String value) {
            addCriterion("five_user_up_comment >=", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentLessThan(String value) {
            addCriterion("five_user_up_comment <", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentLessThanOrEqualTo(String value) {
            addCriterion("five_user_up_comment <=", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentLike(String value) {
            addCriterion("five_user_up_comment like", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentNotLike(String value) {
            addCriterion("five_user_up_comment not like", value, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentIn(List<String> values) {
            addCriterion("five_user_up_comment in", values, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentNotIn(List<String> values) {
            addCriterion("five_user_up_comment not in", values, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentBetween(String value1, String value2) {
            addCriterion("five_user_up_comment between", value1, value2, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andFiveUserUpCommentNotBetween(String value1, String value2) {
            addCriterion("five_user_up_comment not between", value1, value2, "fiveUserUpComment");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumIsNull() {
            addCriterion("cus_emp_num is null");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumIsNotNull() {
            addCriterion("cus_emp_num is not null");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumEqualTo(Integer value) {
            addCriterion("cus_emp_num =", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumNotEqualTo(Integer value) {
            addCriterion("cus_emp_num <>", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumGreaterThan(Integer value) {
            addCriterion("cus_emp_num >", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_emp_num >=", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumLessThan(Integer value) {
            addCriterion("cus_emp_num <", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumLessThanOrEqualTo(Integer value) {
            addCriterion("cus_emp_num <=", value, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumIn(List<Integer> values) {
            addCriterion("cus_emp_num in", values, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumNotIn(List<Integer> values) {
            addCriterion("cus_emp_num not in", values, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumBetween(Integer value1, Integer value2) {
            addCriterion("cus_emp_num between", value1, value2, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusEmpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_emp_num not between", value1, value2, "cusEmpNum");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNull() {
            addCriterion("cus_city is null");
            return (Criteria) this;
        }

        public Criteria andCusCityIsNotNull() {
            addCriterion("cus_city is not null");
            return (Criteria) this;
        }

        public Criteria andCusCityEqualTo(String value) {
            addCriterion("cus_city =", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotEqualTo(String value) {
            addCriterion("cus_city <>", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThan(String value) {
            addCriterion("cus_city >", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityGreaterThanOrEqualTo(String value) {
            addCriterion("cus_city >=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThan(String value) {
            addCriterion("cus_city <", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLessThanOrEqualTo(String value) {
            addCriterion("cus_city <=", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityLike(String value) {
            addCriterion("cus_city like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotLike(String value) {
            addCriterion("cus_city not like", value, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityIn(List<String> values) {
            addCriterion("cus_city in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotIn(List<String> values) {
            addCriterion("cus_city not in", values, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityBetween(String value1, String value2) {
            addCriterion("cus_city between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andCusCityNotBetween(String value1, String value2) {
            addCriterion("cus_city not between", value1, value2, "cusCity");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeIsNull() {
            addCriterion("launch_time is null");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeIsNotNull() {
            addCriterion("launch_time is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeEqualTo(Date value) {
            addCriterion("launch_time =", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeNotEqualTo(Date value) {
            addCriterion("launch_time <>", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeGreaterThan(Date value) {
            addCriterion("launch_time >", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("launch_time >=", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeLessThan(Date value) {
            addCriterion("launch_time <", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeLessThanOrEqualTo(Date value) {
            addCriterion("launch_time <=", value, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeIn(List<Date> values) {
            addCriterion("launch_time in", values, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeNotIn(List<Date> values) {
            addCriterion("launch_time not in", values, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeBetween(Date value1, Date value2) {
            addCriterion("launch_time between", value1, value2, "launchTime");
            return (Criteria) this;
        }

        public Criteria andLaunchTimeNotBetween(Date value1, Date value2) {
            addCriterion("launch_time not between", value1, value2, "launchTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionIsNull() {
            addCriterion("next_policymaker_action is null");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionIsNotNull() {
            addCriterion("next_policymaker_action is not null");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionEqualTo(String value) {
            addCriterion("next_policymaker_action =", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionNotEqualTo(String value) {
            addCriterion("next_policymaker_action <>", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionGreaterThan(String value) {
            addCriterion("next_policymaker_action >", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionGreaterThanOrEqualTo(String value) {
            addCriterion("next_policymaker_action >=", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionLessThan(String value) {
            addCriterion("next_policymaker_action <", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionLessThanOrEqualTo(String value) {
            addCriterion("next_policymaker_action <=", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionLike(String value) {
            addCriterion("next_policymaker_action like", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionNotLike(String value) {
            addCriterion("next_policymaker_action not like", value, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionIn(List<String> values) {
            addCriterion("next_policymaker_action in", values, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionNotIn(List<String> values) {
            addCriterion("next_policymaker_action not in", values, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionBetween(String value1, String value2) {
            addCriterion("next_policymaker_action between", value1, value2, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextPolicymakerActionNotBetween(String value1, String value2) {
            addCriterion("next_policymaker_action not between", value1, value2, "nextPolicymakerAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionIsNull() {
            addCriterion("next_req_action is null");
            return (Criteria) this;
        }

        public Criteria andNextReqActionIsNotNull() {
            addCriterion("next_req_action is not null");
            return (Criteria) this;
        }

        public Criteria andNextReqActionEqualTo(String value) {
            addCriterion("next_req_action =", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionNotEqualTo(String value) {
            addCriterion("next_req_action <>", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionGreaterThan(String value) {
            addCriterion("next_req_action >", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionGreaterThanOrEqualTo(String value) {
            addCriterion("next_req_action >=", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionLessThan(String value) {
            addCriterion("next_req_action <", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionLessThanOrEqualTo(String value) {
            addCriterion("next_req_action <=", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionLike(String value) {
            addCriterion("next_req_action like", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionNotLike(String value) {
            addCriterion("next_req_action not like", value, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionIn(List<String> values) {
            addCriterion("next_req_action in", values, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionNotIn(List<String> values) {
            addCriterion("next_req_action not in", values, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionBetween(String value1, String value2) {
            addCriterion("next_req_action between", value1, value2, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andNextReqActionNotBetween(String value1, String value2) {
            addCriterion("next_req_action not between", value1, value2, "nextReqAction");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeIsNull() {
            addCriterion("true_close_time is null");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeIsNotNull() {
            addCriterion("true_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeEqualTo(Date value) {
            addCriterion("true_close_time =", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeNotEqualTo(Date value) {
            addCriterion("true_close_time <>", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeGreaterThan(Date value) {
            addCriterion("true_close_time >", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("true_close_time >=", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeLessThan(Date value) {
            addCriterion("true_close_time <", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("true_close_time <=", value, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeIn(List<Date> values) {
            addCriterion("true_close_time in", values, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeNotIn(List<Date> values) {
            addCriterion("true_close_time not in", values, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeBetween(Date value1, Date value2) {
            addCriterion("true_close_time between", value1, value2, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andTrueCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("true_close_time not between", value1, value2, "trueCloseTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUploadsIsNull() {
            addCriterion("uploads is null");
            return (Criteria) this;
        }

        public Criteria andUploadsIsNotNull() {
            addCriterion("uploads is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsEqualTo(String value) {
            addCriterion("uploads =", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotEqualTo(String value) {
            addCriterion("uploads <>", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsGreaterThan(String value) {
            addCriterion("uploads >", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsGreaterThanOrEqualTo(String value) {
            addCriterion("uploads >=", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsLessThan(String value) {
            addCriterion("uploads <", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsLessThanOrEqualTo(String value) {
            addCriterion("uploads <=", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsLike(String value) {
            addCriterion("uploads like", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotLike(String value) {
            addCriterion("uploads not like", value, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsIn(List<String> values) {
            addCriterion("uploads in", values, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotIn(List<String> values) {
            addCriterion("uploads not in", values, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsBetween(String value1, String value2) {
            addCriterion("uploads between", value1, value2, "uploads");
            return (Criteria) this;
        }

        public Criteria andUploadsNotBetween(String value1, String value2) {
            addCriterion("uploads not between", value1, value2, "uploads");
            return (Criteria) this;
        }

        public Criteria andAssignIsNull() {
            addCriterion("assign is null");
            return (Criteria) this;
        }

        public Criteria andAssignIsNotNull() {
            addCriterion("assign is not null");
            return (Criteria) this;
        }

        public Criteria andAssignEqualTo(String value) {
            addCriterion("assign =", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotEqualTo(String value) {
            addCriterion("assign <>", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignGreaterThan(String value) {
            addCriterion("assign >", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignGreaterThanOrEqualTo(String value) {
            addCriterion("assign >=", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignLessThan(String value) {
            addCriterion("assign <", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignLessThanOrEqualTo(String value) {
            addCriterion("assign <=", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignLike(String value) {
            addCriterion("assign like", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotLike(String value) {
            addCriterion("assign not like", value, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignIn(List<String> values) {
            addCriterion("assign in", values, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotIn(List<String> values) {
            addCriterion("assign not in", values, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignBetween(String value1, String value2) {
            addCriterion("assign between", value1, value2, "assign");
            return (Criteria) this;
        }

        public Criteria andAssignNotBetween(String value1, String value2) {
            addCriterion("assign not between", value1, value2, "assign");
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