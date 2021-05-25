package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    @BeforeMethod
    public void openBrowser() {

        //open the browser
        browserSelector.OpenBrowser();

        //open url
        driver.get("https://demo.nopcommerce.com/");


    }
    @AfterMethod
    public void closeBrowser(ITestResult result){

       if (!result.isSuccess()){
            captureScreenShot(result.getName());
       }
       //close the browser
        driver.quit();
    }

}
