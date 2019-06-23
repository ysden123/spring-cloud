/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.spring.cloud.configclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yuriy Stul
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ClientBean.class)
@TestPropertySource(locations = "classpath:app-config-test2.properties")
public class ClientBeanTest {
    @Autowired
    ClientBean clientBean;

    @Test
    public void getMsg1() {
        System.out.println("Test: msg1 = " + clientBean.getMsg1());
    }
}
