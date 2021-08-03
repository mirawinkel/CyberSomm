package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.User;
import com.reflectionwebdesign.cybersomm.repositories.UserRepository;
import com.reflectionwebdesign.cybersomm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserByEmail(String email) {
        userRepository.deleteUserByEmail(email);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
