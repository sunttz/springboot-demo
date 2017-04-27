package com.stt.dao;

import com.stt.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by taotaosun on 2017/4/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    UserMapper userDao;

    @Test
    public void selectAll() throws Exception {
        List<User> users = userDao.selectAll();
        System.out.println(users);
    }

    @Test
    public void addUser() throws Exception{
        User user = new User();
        user.setName("干啥过");
        user.setAge(12);
        user.setSex(1);
        int i = userDao.addUser(user);
        System.out.println(i);
    }

}