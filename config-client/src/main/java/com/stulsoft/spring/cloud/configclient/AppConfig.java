///*
// * Copyright (c) 2019. Yuriy Stul
// */
//
//package com.stulsoft.spring.cloud.configclient;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
///**
// * @author Yuriy Stul
// */
//@Component
////@Configuration
//@ConfigurationProperties("test")
//public class AppConfig {
//
//    @Autowired
//    Environment env;
//
//
//    @Value("${tree.leave1}")
//    String treeLeave1;
//
//
//    public String getPropertyOne() {
//        return env.getProperty("test.one");
//    }
//
//
//    public String getTreeLeave1() {
//        return treeLeave1;
//    }
//
//}
