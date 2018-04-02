package com.biz.common;

import java.io.Serializable;

/**
 * 返回结果集
 */
public class ResultDTO<T> implements Serializable{

    private Boolean success = true;
    private String errCode = "0";
    private String errMsg = "接口调用成功";
    private T data;

    public ResultDTO(){}

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
