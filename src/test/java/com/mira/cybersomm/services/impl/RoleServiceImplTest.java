package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.Role;
import com.mira.cybersomm.services.RoleService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RoleServiceImplTest {

    @Autowired
    RoleService roleService;

    @BeforeAll
    public void setup() {
        Role admin = new Role();
        admin.setId(1);
        admin.setName("ROLE_ADMIN");
        Role user = new Role();
        user.setId(2);
        user.setName("ROLE_USER");
        roleService.save(admin);
        roleService.save(user);
    }

    @ParameterizedTest
    @ValueSource(ints={1,2})
    void RoleIdTest(int idNumber) {
        assertNotNull(roleService.findRoleById(idNumber));
    }
}
