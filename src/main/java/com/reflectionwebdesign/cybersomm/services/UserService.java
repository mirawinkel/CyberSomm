package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.User;

public interface UserService {

    User save(User user);
    void deleteUserByEmail(String email);
    User findUserByEmail(String email);
    void encodePassword(User source);
    User findUserByUsername(String name);

}
