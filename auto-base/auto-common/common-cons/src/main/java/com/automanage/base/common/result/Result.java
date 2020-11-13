package com.automanage.base.common.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private String code;

    private T data;

    private String msg;


    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        ResultCode rce = ResultCode.SUCCESS;
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            rce = ResultCode.SYSTEM_EXECUTION_ERROR;
        }
        return result(rce, data);
    }


    public static <T> Result<T> error() {
        return result(ResultCode.SYSTEM_EXECUTION_ERROR.getCode(), ResultCode.SYSTEM_EXECUTION_ERROR.getMsg(), null);
    }

    public static <T> Result<T> error(String msg) {
        return result(ResultCode.SYSTEM_EXECUTION_ERROR.getCode(), msg, null);
    }

    public static <T> Result<T> status(boolean status) {
        if (status) {
            return success();
        } else {
            return error();
        }
    }

    public static <T> Result<T> custom(IResultCode resultCode) {
        return result(resultCode.getCode(), resultCode.getMsg(), null);
    }


    private static <T> Result<T> result(IResultCode resultCode, T data) {
        return result(resultCode.getCode(), resultCode.getMsg(), data);
    }

    private static <T> Result<T> result(String code, String msg, T data) {
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

}
