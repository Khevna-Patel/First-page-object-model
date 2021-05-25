package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils{
    LoadProperty loadProperty = new LoadProperty();

    private By _LogInButton = By.xpath("//input[contains(@value, 'Log In')]");
    private By _acceptCookieButton = By.xpath("//button[contains(@data-cookiebanner, 'accept_button')]");

    public void windowHandle_Facebook() {

        String MainWindow = driver.getWindowHandle();

        //To handle all new window
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            //applying condition
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                //switching to child window
                driver.switchTo().window(ChildWindow);

                //click on cookie message
                driver.findElement(_acceptCookieButton).click();

                //verify login button is present  or not on the page
                Assert.assertTrue(driver.findElement(_LogInButton).isDisplayed(),  "Log in button is not present on the Facebook home page");
                System.out.println(loadProperty.getProperty("LogInButtonComment"));

                //closing the child window
                driver.close();
            }
        }
               //Switching to parent window
               driver.switchTo().window(MainWindow);
    }
}
