package org.ace.apidemo.service;

import org.ace.apidemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}
