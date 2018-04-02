package com.biz.constant;

/**
 * 标注下一步对于需求的销售行动
 */
public enum NextReqAction {
    COMPANY_HAVE_REQ("1", "COMPANY_HAVE_REQ", "企业有需求，待做实"),
    BUSINESS_HAVE_REQ("2", "BUSINESS_HAVE_REQ", "业务部门有需求，待做实"),
    HR_HAVE_REQ("3", "HR_HAVE_REQ", "HR部门有需求，待做实"),
    OTHER("4", "OTHER", "其他");


    private String code;
    private String value;
    private String desc;

    NextReqAction(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static NextReqAction getByCode(String code) {
        for (NextReqAction type : NextReqAction.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static NextReqAction getByValue(String value) {
        for (NextReqAction type : NextReqAction.values()) {
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
