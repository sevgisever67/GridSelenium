package tests;
import maneger.DriverManeger;
import org.testng.annotations.Test;
public class GridCrossBrowser {
    DriverManeger driverManeger=new DriverManeger();
    @Test
    void test_01(){driverManeger.setUPChromeDriver().get("https://www.amazon.com");}
    @Test void test_02(){driverManeger.setUpEdgeDriver().get("https://www.amazon.com");}
    @Test void test_03(){driverManeger.setUpFireFoxDriver().get("https://www.amazon.com");}
    @Test void test_05(){driverManeger.setUPChromeDriver().get("https://www.wisequarter.com");}
    @Test void test_06(){driverManeger.setUpEdgeDriver().get("https://www.wisequarter.com");}
    @Test void test_07(){driverManeger.setUpFireFoxDriver().get("https://www.wisequarter.com");}
}