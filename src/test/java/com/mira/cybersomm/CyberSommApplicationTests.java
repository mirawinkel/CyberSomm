package com.mira.cybersomm;

import com.mira.cybersomm.controllers.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;


@SpringBootTest
class CyberSommApplicationTests {

    private HomeController homeController;

    @Autowired
    public CyberSommApplicationTests(HomeController homeController) {
        this.homeController = homeController;
    }

    @Test
    void contextLoads() {
        assertNotNull(homeController);
    }

}
