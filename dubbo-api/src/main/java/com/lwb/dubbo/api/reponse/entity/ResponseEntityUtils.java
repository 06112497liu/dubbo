package com.lwb.dubbo.api.reponse.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.function.Function;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
public interface ResponseEntityUtils {


    static ResponseEntity ok(Object data) {
        return new ResponseEntity(true, (Serializable) data);
    }

    public static Function<Object, ResponseEntity> OK = data -> ok(data);


    public static ResponseEntity fail(String msg) {
        return new ResponseEntity(false, msg);
    }

    public static Function<String, ResponseEntity> FAIL = msg -> fail(msg);


}
