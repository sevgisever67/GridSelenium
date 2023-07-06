package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static maneger.DriverManeger.driver;
import static maneger.DriverManeger.setDriver;


public class Grid_02 {
    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser") String browser){
        setDriver("chrome");
    }


    @Test
    void test01(){
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());




    }

}
