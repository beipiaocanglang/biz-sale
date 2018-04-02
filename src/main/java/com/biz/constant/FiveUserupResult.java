package com.biz.constant;

/**
 * 5人以上试用感受
 */
public enum FiveUserupResult {
    PLEASED("1", "PLEASED", "决策者已经试用并满意"),
    POL_TRIED_NORESULT("2", "POL_TRIED_NORESULT", "决策者已经试用，态度不知道"),
    OPN_TRIED("3", "OPN_TRIED", "运营负责人试用"),
    ACC_TRIED("4", "ACC_TRIED", "助理试用了"),
    EMP_TRIED("5", "EMP_TRIED", "一部分员工参与了试用"),
    NO("6", "NO", "未满足");

    private String code;
    private String value;
    private String desc;

    FiveUserupResult(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static FiveUserupResult getByCode(String code) {
        for (FiveUserupResult type : FiveUserupResult.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static FiveUserupResult getByValue(String value) {
        for (FiveUserupResult type : FiveUserupResult.values()) {
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
