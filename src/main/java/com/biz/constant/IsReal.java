package com.biz.constant;

/**
 * 标注确有其事详情
 */
public enum IsReal {
    BID("1", "BID", "竞标"),
    NEG("2", "NEG", "竞争性谈判"),
    PRE_BID("3", "PRE_BID", "筹备竞标中"),
    MONOPOLY("4", "MONOPOLY", "就和兜行一家谈判"),
    INFO_COLLECTION("5", "INFO_COLLECTION", "供应商信息收集中"),
    PROPOSAL("6", "PROPOSAL", "给决策者制作方案中"),
    NO("7", "NO", "否");

    private String code;
    private String value;
    private String desc;

    IsReal(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static IsReal getByCode(String code) {
        for (IsReal type : IsReal.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static IsReal getByValue(String value) {
        for (IsReal type : IsReal.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
