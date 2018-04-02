package com.biz.constant;

/**
 * 标注搞定的决策人的职位
 */
public enum DonePolicymakerPosition {
    BOSS("1", "BOSS", "老板"),
    COMPANY_VP("2", "COMPANY_VP", "公司VP"),
    BUSINESS_VP("3", "BUSINESS_VP", "业务线VP"),
    HRVP("4", "HRVP", "HRVP!!!!!!!!"),
    HRD("5", "HRD", "HRD"),
    COMPANY_COL_PREX("6", "COMPANY_COL_PREX", "企业大学校长"),
    T_DIRECTOR("7", "T_DIRECTOR", "培训总监"),
    HR_MANAGER("8", "HR_MANAGER", "人力资源经理"),
    T_MANAGER("9", "T_MANAGER", "培训经理"),
    OTHER("10", "OTHER", "其他"),
    UNKNOW("11", "UNKNOW", "未知");

    private String code;
    private String value;
    private String desc;

    DonePolicymakerPosition(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static DonePolicymakerPosition getByCode(String code) {
        for (DonePolicymakerPosition type : DonePolicymakerPosition.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static DonePolicymakerPosition getByValue(String value) {
        for (DonePolicymakerPosition type : DonePolicymakerPosition.values()) {
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
