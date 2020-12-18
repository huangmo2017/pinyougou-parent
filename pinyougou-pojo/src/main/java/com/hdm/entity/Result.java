package com.hdm.entity;

import java.io.Serializable;

/**
 * @Description 返回结果封装
 * @Author HDM
 * @Date 2020-12-14 20:08
 */
public class Result implements Serializable {
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
