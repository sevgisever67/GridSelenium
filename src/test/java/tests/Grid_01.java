package tests;

import maneger.DriverManeger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Grid_01 {
    static WebDriver driver;
    DriverManeger driverManeger;
    public static void main(String[] args) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.8:4444"),new ChromeOptions());
        driver.get("https://www.google.com");
        System.out.printf(driver.getTitle());
        System.out.printf(driver.getCurrentUrl());


    }
    @Test
    void remoteChromeDriver(){
        driver=driverManeger.setUPChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    void remoteEdgeDriver(){
        driver=driverManeger.setUpEdgeDriver();
        driver.get("https://www.yandex.com.tr");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    void remoteFirefoxDriver(){
        driver=driverManeger.setUpFireFoxDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}

