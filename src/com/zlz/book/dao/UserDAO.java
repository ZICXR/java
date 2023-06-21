package com.zlz.book.dao;

import com.zlz.book.pojo.User;

public interface UserDAO {
    User getUser(String uname , String pwd );
}
