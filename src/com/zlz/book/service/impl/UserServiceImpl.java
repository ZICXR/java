package com.zlz.book.service.impl;

import com.zlz.book.dao.UserDAO;
import com.zlz.book.pojo.User;
import com.zlz.book.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO ;

    @Override
    public User login(String uname, String pwd) {
        return userDAO.getUser(uname,pwd);
    }
}
