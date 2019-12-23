package cn.tongdun.mybatis.utils;

import lombok.Data;

import java.io.Serializable;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CephServerResponse<T> implements Serializable {
    private int code;
    private String message;
    private T data;
    private boolean success;


    private CephServerResponse(int status) {
        this.code = status;
    }

    private CephServerResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private CephServerResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    private CephServerResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CephServerResponse(int code, String message, T data, boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }


    //    @JsonIgnore
    public boolean isSuccess() {
        return this.code == CephResultStatusEnum.SUCCESS.getCode();
    }

    public static <T> CephServerResponse<T> createSuccess() {
        return new CephServerResponse<T>(CephResultStatusEnum.SUCCESS.getCode(),
                CephResultStatusEnum.SUCCESS.getProductDescription(),
                null,
                true);
    }

//    public static <T> CephServerResponse<T> createSuccess(String message) {
//        return new CephServerResponse<T>(CephResultStatusEnum.SUCCESS.getCode(), message);
//    }

    //    code，message，tips，data，success
    public static <T> CephServerResponse<T> createSuccess(T data) {
        return new CephServerResponse<T>(
                CephResultStatusEnum.SUCCESS.getCode(),
                CephResultStatusEnum.SUCCESS.getProductDescription(),
                data,
                true);
    }

    public static <T> CephServerResponse<T> createSuccess(String message) {
        return new CephServerResponse<T>(
                CephResultStatusEnum.SUCCESS.getCode(),
                message,
                null,
                true);
    }


    public static <T> CephServerResponse<T> createSuccess(String message, T data) {
        return new CephServerResponse<T>(CephResultStatusEnum.SUCCESS.getCode(), message, data, true);
    }

    public static <T> CephServerResponse<T> createSuccess(int code, String message) {
        return new CephServerResponse<T>(code, message, null, true);
    }

    public static <T> CephServerResponse<T> createSuccess(int code, String message, T data) {
        return new CephServerResponse<T>(code, message, data, true);
    }

    public static <T> CephServerResponse<T> createError() {
        return new CephServerResponse<T>(CephResultStatusEnum.ERROR.getCode(),
                CephResultStatusEnum.ERROR.getProductDescription(),
                null,
                false);
    }

    public static <T> CephServerResponse<T> createError(String message) {
        return new CephServerResponse<T>(CephResultStatusEnum.ERROR.getCode(),
                message,
                null,
                false);
    }

    public static <T> CephServerResponse<T> createError(String message, T data) {
        return new CephServerResponse<T>(CephResultStatusEnum.ERROR.getCode(), message, data, false);
    }

    public static <T> CephServerResponse<T> createError(int code, String message) {
        return new CephServerResponse<T>(code, message, null, false);
    }
}
