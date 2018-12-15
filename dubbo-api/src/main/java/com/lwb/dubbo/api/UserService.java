package com.lwb.dubbo.api;

import com.lwb.dubbo.api.reponse.entity.ResponseEntity;

import java.io.Serializable;
import java.lang.annotation.Target;

/**
 * 用户操作远程接口
 *
 * @author liuweibo
 * @date 2018/12/15
 */
public interface UserService {

    /**
     * 根据用户id，获取用户信息
     *
     * @param id
     * @return
     */
    ResponseEntity getUser(Serializable id);

    /**
     * 根据用户code，获取用户信息
     *
     * @param code
     * @return
     */
    ResponseEntity getUser(String code);

}
