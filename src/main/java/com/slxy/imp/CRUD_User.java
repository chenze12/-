package com.slxy.imp;

import com.slxy.bean.User;
import com.slxy.dao.CRUD_UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chenze
 * @create 2021-01-10 18:28
 */

public class CRUD_User implements CRUD_UserDao {


    @Autowired



    @Override
    public boolean addUser() {

        return false;
    }

    @Override
    public boolean delUser() {
        return false;
    }

    @Override
    public boolean upadteUser() {
        return false;
    }

    @Override
    public User selectUser() {
        return null;
    }
}
