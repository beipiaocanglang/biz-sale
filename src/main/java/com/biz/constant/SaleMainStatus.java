package com.biz.constant;

/**
 * SaleMain - Status取值
 */
public enum SaleMainStatus {
    OPEN("1", "OPEN", "关闭"),
    CLOSE("0", "CLOSE", "打开");

    private String code;
    private String value;
    private String desc;

    SaleMainStatus(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static SaleMainStatus getByCode(String code) {
        for (SaleMainStatus type : SaleMainStatus.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static SaleMainStatus getByValue(String value) {
        for (SaleMainStatus type : SaleMainStatus.values()) {
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
