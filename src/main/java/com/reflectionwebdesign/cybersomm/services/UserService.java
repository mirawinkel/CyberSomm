package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.User;

public interface UserService {

    User createUser(User user);
    void deleteUserByEmail(String email);
    User findUserByEmail(String email);

}
