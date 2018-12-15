package com.lwb.dubbo.service.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
public enum Sex implements IEnum<String> {


    MALE("male", "男"),
    FEMALE("female", "女");

    String code;

    String desc;

    Sex(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getValue() {
        return this.code;
    }
}
