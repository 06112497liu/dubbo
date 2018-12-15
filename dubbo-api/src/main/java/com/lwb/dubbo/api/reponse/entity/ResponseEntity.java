package com.lwb.dubbo.api.reponse.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.function.Function;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResponseEntity<T extends Serializable> implements Serializable {

    boolean success;

    String msg;

    T data;

    public ResponseEntity() {
    }

    public ResponseEntity(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    ResponseEntity(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    ResponseEntity(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }


}
