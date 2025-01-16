package org.example.base;

import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {

    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }


    @AfterMethod
    public void TearDown(){
        DriverManager.down();
    }
}
