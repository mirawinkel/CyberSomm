package com.reflectionwebdesign.cybersomm.services.impl;

import static org.junit.jupiter.api.Assertions.*;
import com.reflectionwebdesign.cybersomm.models.User;
import com.reflectionwebdesign.cybersomm.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

//    void deleteUserByEmail(String email);

    @Test
    void testFindUserByEmail() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setName("tester");
        user.setPassword("test");
        userService.save(user);
        User result = userService.findUserByEmail("test@test.com");
        assertEquals(user, result);
    }

    @Test
    void testDeleteUserByEmail() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setName("tester");
        user.setPassword("test");
        userService.save(user);
        userService.deleteUserByEmail("test@test.com");
        User result = userService.findUserByEmail("test@test.com");
        assertNull(result);
    }
}