package com.lwb.dubbo.service.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lwb.dubbo.api.UserService;
import com.lwb.dubbo.api.reponse.entity.ResponseEntity;
import com.lwb.dubbo.api.reponse.entity.ResponseEntityUtils;
import com.lwb.dubbo.service.dao.UserDao;
import com.lwb.dubbo.service.entity.User;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@Service
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public ResponseEntity getUser(Serializable id) {
        User user = this.userDao.selectById(id);
        if (Objects.isNull(user)) {
            return ResponseEntityUtils.fail(String.format("id为：s% 用户不存在", id));
        } else {
            return ResponseEntityUtils.ok(user);
        }
    }

    @Override
    public ResponseEntity getUser(String code) {
        return null;
    }
}
