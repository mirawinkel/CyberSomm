package com.mira.cybersomm;

import com.mira.cybersomm.controllers.IndexController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;


@SpringBootTest
class CyberSommApplicationTests {

    private IndexController indexController;

    @Autowired
    public CyberSommApplicationTests(IndexController indexController) {
        this.indexController = indexController;
    }

    @Test
    void contextLoads() {
        assertNotNull(indexController);
    }

}
