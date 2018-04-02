package com.biz.common;

public class ResultDTOBuilder {

    public ResultDTOBuilder() {}

    //成功时调用，参数为data
    public static <T> ResultDTO<T> success(T data) {
        ResultDTO<T> resultDTO = new ResultDTO();
        resultDTO.setData(data);
        return resultDTO;
    }

    //失败时调用，参数：errCode，errMsg
    public static <T> ResultDTO<T> failure(String errCode, String errMsg) {
        ResultDTO<T> resultDTO = new ResultDTO();
        resultDTO.setSuccess(false);
        resultDTO.setErrCode(errCode);
        resultDTO.setErrMsg(errMsg);
        return resultDTO;
    }

    public static <T> ResultDTO<T> failure(String errCode) {
        String errMsg = MessageUtil.getMessage(errCode);
        return failure(errCode, errMsg);
    }
}
