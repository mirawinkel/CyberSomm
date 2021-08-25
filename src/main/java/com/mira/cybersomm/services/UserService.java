package com.mira.cybersomm.services;

import com.mira.cybersomm.models.User;

public interface UserService {

    User save(User user);
    void deleteUserByEmail(String email);
    User findUserByEmail(String email);
    void encodePassword(User source);
    User findUserByUsername(String name);
    Iterable<User> findUsers();

}
