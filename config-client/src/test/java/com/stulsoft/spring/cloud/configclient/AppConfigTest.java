/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.spring.cloud.configclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Yuriy Stul
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@TestPropertySource(locations = "classpath:app-config-test1.properties")
public class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Test
    public void getPropertyOne() {
        String one = appConfig.getPropertyOne();
        System.out.println("one = " + one);
        assertFalse(one.isEmpty());

        String treeLeave1 = appConfig.getTreeLeave1();
        System.out.println("treeLeav1 = " + treeLeave1);
        assertFalse(treeLeave1.isEmpty());
    }

}