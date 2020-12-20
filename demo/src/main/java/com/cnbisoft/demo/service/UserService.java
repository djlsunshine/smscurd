package com.cnbisoft.demo.service;

import com.cnbisoft.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 *
 * @author djl
 * @version 1.0
 * @taskId:
 * @createDate 2020/12/20 15:10
 * @project: demo
 * @see com.cnbisoft.demo.service
 */
@Service
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAllUsers();

    /**
     * 根据ID查询用户
     * @param userId
     * @return
     */
    User queryUserById(int userId);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userId
     */
    void deleteUserById(int userId);
}