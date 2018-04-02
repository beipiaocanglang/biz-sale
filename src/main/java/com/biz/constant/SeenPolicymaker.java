package com.biz.constant;

/**
 * 标注是否见过决策人
 */
public enum SeenPolicymaker {
    YES("1", "Y", "是"),
    NO("0", "N", "否");

    private String code;
    private String value;
    private String desc;

    SeenPolicymaker(String code, String value, String desc){
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static SeenPolicymaker getByCode(String code) {
        for (SeenPolicymaker type : SeenPolicymaker.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static SeenPolicymaker getByValue(String value) {
        for (SeenPolicymaker type : SeenPolicymaker.values()) {
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
