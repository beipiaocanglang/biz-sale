package com.biz.constant;

/**
 * 标注意外事情详情
 */
public enum IsRealComment {
    BUS_NO_FEEL("1", "BUS_NO_FEEL", "业务部门无感"),
    NO_PLAT_DOUBT_RESULT("2", "NO_PLAT_DOUBT_RESULT", "企业没上过平台担心效果"),
    HAVE_PLAT_NO_GOOD_DOUBT_RESULT("3", "HAVE_PLAT_NO_GOOD_DOUBT_RESULT", "企业上过平台,效果不好,再上担心效果"),
    HR_NEED_BUS_NO("4", "HR_NEED_BUS_NO", "HR认为有需求，业务部门认为没有"),
    YES("5", "YES", "确有其事");

    private String code;
    private String value;
    private String desc;

    IsRealComment(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static IsRealComment getByCode(String code) {
        for (IsRealComment type : IsRealComment.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static IsRealComment getByValue(String value) {
        for (IsRealComment type : IsRealComment.values()) {
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
