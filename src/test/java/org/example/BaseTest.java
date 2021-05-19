package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @BeforeMethod
    public void openBrowser() {
        //setting up chromedriver path from the system
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        //creating object for driver
        driver = new ChromeDriver();
        //maximise the driver window
        driver.manage().window().maximize();
        //applying implicit wait to driver object
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public void closeBrowser(){
         //close all open browsers windows
        driver.quit();
    }

}
