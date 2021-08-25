package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.User;
import com.mira.cybersomm.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void testFindUserByEmail() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setUsername("tester");
        user.setPassword("test");
        userService.save(user);
        User result = userService.findUserByEmail("test@test.com");
        assertEquals(user, result);
    }

    @Test
    void testDeleteUserByEmail() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setUsername("tester");
        user.setPassword("test");
        userService.save(user);
        userService.deleteUserByEmail("test@test.com");
        User result = userService.findUserByEmail("test@test.com");
        assertNull(result);
    }

    @Test
    void testFindUserByUsername() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setUsername("tester");
        user.setPassword("test");
        userService.save(user);
        User result = userService.findUserByUsername("tester");
        assertEquals(user, result);
    }
}
