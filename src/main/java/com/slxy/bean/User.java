package com.slxy.bean;

import java.io.Serializable;

/**
 * @author chenze
 * @create 2021-01-10 17:52
 * 用户类  用户名 、密码  使用redis
 * 每个用户在登记的时候产生一个用户信息 将该用户信息存在数据库中
 *
 *
 * 姓名 性别 身份证（16位）手机号 是否有车（1，0） 门牌号
 *
 * 车牌号 车位 门牌号
 */

public class User implements Serializable {

    private String username;

    private String password;





    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
