package com.kronos.config;

import sun.tools.java.ClassPath;

import java.io.InputStream;

/**
 * @Author: jackila
 * @Date: 3:48 PM 2022-5-30
 */
class ConfigTest {

    public void testImport(){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("example.yml");

    }
}