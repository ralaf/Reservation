package com.dluzewski.users.dao;

import com.dluzewski.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}