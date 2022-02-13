package com.atguigu.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private boolean status; //响应状态  true  false
    private String msg;  // 响应信息
    private Object data;  //处理成功的响应数据

    public static Result ok(Object data) {
        Result result = new Result();
        result.setStatus(true);
        result.setData(data);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setStatus(false);
        result.setMsg(msg);
        return result;
    }
}  
