package com.lwb.dubbo.service;

import com.lwb.dubbo.service.dao.UserDao;
import com.lwb.dubbo.service.entity.User;
import com.lwb.dubbo.service.enums.Sex;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DubboServiceApplicationTest {

    @Autowired
    UserDao userDao;

    @Test
    public void createTest() {
        User user = new User();
        user.setName("小明");
        user.setCode("XM");
        user.setSex(Sex.MALE);
        user.setAge(25);
        this.userDao.insert(user);
    }
}
