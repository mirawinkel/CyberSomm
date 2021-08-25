package com.mira.cybersomm;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@RunWith(JUnitPlatform.class)
@SpringJUnitConfig
@SelectPackages("com.mira.cybersomm.services.impl")
public class RunAllServicesTests {

}
