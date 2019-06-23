/*
 * Copyright (c) 2019. Yuriy Stul
 */

package com.stulsoft.spring.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Yuriy Stul
 */
@Component
public class ClientBean {
    @Value("${test.a}")
    private String msg1;

    @PostConstruct
    public void postConstruct() {
        System.out.println("msg1=" + msg1);
    }

    public String getMsg1() {
        return msg1;
    }
}
