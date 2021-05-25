package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");

    public void OpenBrowser(){

        if (browserName.equalsIgnoreCase("Chrome"))
        {
            //setting up chromedriver path from the system
            System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDriver/chromedriver.exe");

            //initialising the object
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            //setting up Edgedriver path from the system
         System.setProperty("webdriver.edge.driver","src/test/resources/BrowserDriver/msedgedriver.exe");

         //initialising the object
            driver = new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("Firefox"))
        {
            //setting up firefoxdriver path from the system
            System.setProperty("webdriver.gecko.driver","src/test/resources/BrowserDriver/geckodriver.exe");

            //initialising the object
            driver = new FirefoxDriver();
        }
        else
            {
                System.out.println("In correct browser name or empty....:"+browserName);
            }
        driver.manage().window().maximize();
        //applying implicit wait to driver object
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


    }
}
