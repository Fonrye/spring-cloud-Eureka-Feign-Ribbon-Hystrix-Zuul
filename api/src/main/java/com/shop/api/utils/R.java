package com.shop.api.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class R implements Serializable {

    public  Integer code;
    public String msg;
    public Object data;


    public R(Integer code) {
        this.code = code;
    }
    public R() {

    }

    public R ok(){
        this.code = 200;
        this.msg = "";
        return this;
    }
    public R ok(String msg){
        this.code = 200;
        this.msg = msg;
        return this;
    }

    public R error(){
        this.code = 500;
        this.msg = "";
        return this;
    }
    public R error(String msg){
        this.code = 500;
        this.msg = msg;
        return this;
    }

    public R(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    public R(String message) {
        this.msg = message;
    }

    public R setCode(Integer code) {
        this.code = code;
        return this;
    }

    public R setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    public R setData(Object data) {
        this.data = data;
        return this;
    }
}
