package com.slxy.dao;

import com.slxy.bean.User;

/**
 * @author chenze
 * @create 2021-01-10 18:28
 * 对用户的增删改查
 */

public interface CRUD_UserDao {

    // add
    boolean addUser();

    // delete
    boolean delUser();

    // update
    boolean upadteUser();

    // select
    User selectUser();
}
