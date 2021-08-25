package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.User;
import com.mira.cybersomm.repositories.UserRepository;
import com.mira.cybersomm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void encodePassword(User source) {
        source.setPassword(passwordEncoder.encode(source.getPassword()));
    }

    @Override
    public User findUserByUsername(String name) {
        return userRepository.findUserByUsername(name);
    }

    @Override
    public Iterable<User> findUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteUserByEmail(String email)
    {
        userRepository.deleteUserByEmail(email);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
