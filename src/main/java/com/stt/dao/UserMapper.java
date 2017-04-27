package com.stt.dao;

import com.stt.entity.User;

import java.util.List;

/**
 * Created by taotaosun on 2017/4/26.
 */
public interface UserMapper {
    List<User> selectAll();

    int addUser(User user);
}
