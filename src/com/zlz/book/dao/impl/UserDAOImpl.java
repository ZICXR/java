package com.zlz.book.dao.impl;

import com.zlz.book.dao.UserDAO;
import com.zlz.book.pojo.User;
import com.atguigu.myssm.basedao.BaseDAO;

public class UserDAOImpl extends BaseDAO<User> implements UserDAO {
    @Override
    public User getUser(String uname, String pwd) {
        return load("select * from t_user where uname like ? and pwd like ? " ,
                uname , pwd );
    }
}
