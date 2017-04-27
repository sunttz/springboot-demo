package com.stt.service.impl;

import com.stt.dao.UserMapper;
import com.stt.entity.User;
import com.stt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by taotaosun on 2017/4/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

}
