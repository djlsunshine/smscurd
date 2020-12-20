package com.cnbisoft.demo.service.impl;

import com.cnbisoft.demo.entity.User;
import com.cnbisoft.demo.mapper.UserMapper;
import com.cnbisoft.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 *
 * @author djl
 * @version 1.0
 * @taskId:
 * @createDate 2020/12/20 15:14
 * @project: demo
 * @see com.cnbisoft.demo.service.impl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }

    @Override
    public User queryUserById(int userId) {
        return userMapper.queryUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(int userId) {
        userMapper.deleteUserById(userId);
    }
}
