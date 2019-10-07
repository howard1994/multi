package com.data.source.multi.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private String photo;

    private Date lastLoginTime;

    private Date createTime;

    private Date modifyTime;

    private Integer status;

    private String salt;

    private Integer dept;

    private String deptName;

}
