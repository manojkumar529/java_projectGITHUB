package com.aptara.inc.dao;

import java.util.List;

import com.aptara.inc.model.User;

public interface UserDao {
void save(User u);
List<User> list();
}
