package com.lwb.dubbo.service.entity;


import com.baomidou.mybatisplus.annotation.TableLogic;
import com.lwb.dubbo.service.base.BaseEntity;
import com.lwb.dubbo.service.enums.Sex;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    String name;

    String code;

    Integer age;

    Sex sex;

    @TableLogic
    Integer deleted;

}
