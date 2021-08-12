package com.reflectionwebdesign.cybersomm.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SeleniumTests {

    private WebDriver driver;

    @Autowired
    public SeleniumTests(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    void testLoginPage() {
        // Opens the login page for this web application
        driver.get("http://localhost:8080/login");
        assertEquals("Login Page", driver.getTitle());
    }
}