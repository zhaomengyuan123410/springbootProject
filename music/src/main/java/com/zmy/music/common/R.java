package com.zmy.music.common;
import lombok.Data;
@Data
public class R {

    private int code;

    private String message;

    private String type;

    private Boolean success;

    private Object data;

    public static R success(String message) {
        R r = new R();
        r.setCode(200);
        r.setMessage(message);
        r.setSuccess(true);
        r.setType("success");
        r.setData(null);
        return r;
    }

    public static R error(String message) {
        R r = success(message);
        r.setSuccess(false);
        r.setType("error");
        return r;
    }
}
