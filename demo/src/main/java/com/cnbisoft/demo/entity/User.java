package com.cnbisoft.demo.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * @ClassName User
 * @Author Djl
 * @Date 2020/11/13 15:45
 * @Description User
 * @Version 1.0
 */

// set和get
@Data
// 无参
//@NoArgsConstructor
// 有参
//@AllArgsConstructor
public class User implements Serializable {

//    public static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private String address;
    private String sex;
    private String birthday;
}