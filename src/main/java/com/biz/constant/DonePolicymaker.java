package com.biz.constant;

/**
 * 标注是否搞定决策人
 */
public enum DonePolicymaker {
    YES("1", "Y", "是"),
    NO("0", "N", "否");

    private String code;
    private String value;
    private String desc;

    DonePolicymaker(String code, String value, String desc){
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static DonePolicymaker getByCode(String code) {
        for (DonePolicymaker type : DonePolicymaker.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static DonePolicymaker getByValue(String value) {
        for (DonePolicymaker type : DonePolicymaker.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

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
