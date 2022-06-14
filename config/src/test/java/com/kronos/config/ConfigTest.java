package com.kronos.config;

import org.junit.Before;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import sun.tools.java.ClassPath;

import java.io.InputStream;
import java.util.Map;

/**
 * @Author: jackila
 * @Date: 3:48 PM 2022-5-30
 */
public class ConfigTest {

    private Yaml yaml;

    @Before
    public void startUp() {
        yaml = new Yaml(new Constructor(Config.class));
    }

    @Test
    public void testImport() {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("example.yml");
        Config config = yaml.load(resourceAsStream);
        System.out.println(config);
    }
}