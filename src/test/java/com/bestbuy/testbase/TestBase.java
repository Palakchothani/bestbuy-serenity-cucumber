package com.bestbuy.testbase;

import groovy.beans.PropertyReader;
import org.junit.BeforeClass;

public class TestBase
{
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
      //  propertyReader = PropertyReader.getInstance();
        //RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        //RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        // RestAssured.basePath = Path.STORES;
    }

}
