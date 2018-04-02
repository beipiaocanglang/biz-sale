package com.biz.constant;

/**
 * 标注下一步对于决策人的销售行动
 */
public enum NextPolicymakerAction {
    FINDING_POL("1", "FINDING_POL", "判断谁是决策人"),
    FINDING_POL_PROBLEM("2", "FINDING_POL_PROBLEM", "判断谁是决策人中遇到了困难"),
    DATEING_POL("3", "DATEING_POL", "约见决策人中"),
    DATEING_POL_PROBLEM("4", "DATEING_POL_PROBLEM", "约见决策人中遇到了困难"),
    DOING_POL("5","DOING_POL","搞定决策人中"),
    DOING_POL_PROBLEM("6","DOING_POL_PROBLEM","搞定决策人过程中遇到了困难"),
    OTHER("7","OTHER","其他");


    private String code;
    private String value;
    private String desc;

    NextPolicymakerAction(String code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public static NextPolicymakerAction getByCode(String code) {
        for (NextPolicymakerAction type : NextPolicymakerAction.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }

    public static NextPolicymakerAction getByValue(String value) {
        for (NextPolicymakerAction type : NextPolicymakerAction.values()) {
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
