package com.cnbisoft.demo.mapper;

import com.cnbisoft.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Description
 *
 * @author djl
 * @version 1.0
 * @taskId:
 * @createDate 2020/12/20 13:31
 * @project: demo
 * @see com.cnbisoft.demo.mapper
 */

// mybatis映射类
@Mapper
@Repository
public interface UserMapper {

    List<User> queryAllUsers();

    User queryUserById(int userId);

    void addUser(@Param("user") User user);

    void updateUser(@Param("user") User user);

    void deleteUserById(int userId);
}
