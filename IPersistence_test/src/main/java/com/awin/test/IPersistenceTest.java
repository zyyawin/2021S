package com.awin.test;

import com.awin.io.Resources;

import java.io.InputStream;

public class IPersistenceTest {
    public void test() {
        InputStream resourcesAsStream = Resources.getResourcesAsStream("sqlMapConfig.xml");
        System.out.println("resourcesAsStream = " + resourcesAsStream);
    }
}
