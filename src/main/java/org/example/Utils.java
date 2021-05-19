package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils extends BasePage{

    public static void clickOnElement(By by){
        driver.findElement(by).click();
}
    public static void enterText(By by, String text){
    driver.findElement(by).sendKeys(text);

}
    public static void selectFromDropdownByVisibleText(By by, String text){
    Select select = new Select(driver.findElement(by));
    select.selectByVisibleText(text);
}

    public static void selectFromDropdownByIndex(By by, int index){
    Select select = new Select(driver.findElement(by));
    select.selectByIndex(index);
}
    public static void selectFromDropDownByValue(By by, String text){
    Select select = new Select(driver.findElement(by));
    select.selectByValue(text);

}
    public static String timestamp(By by) {
    return driver.findElement(by).getText();
}
    public static String getTextFromElement(By by){
    return driver.findElement(by).getText();
    }

    public static void list(By by){
    List<WebElement> productsList = driver.findElements(by);
    for (WebElement webElement: productsList){
        System.out.println(webElement.getText());
    }
    }

    public static void waitForClickable(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String  getSelectedTextFromDropDown(By by){
    Select select = new Select(driver.findElement(by));
    return select.getFirstSelectedOption().getText();
    }





}
