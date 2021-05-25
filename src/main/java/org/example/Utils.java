package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public static String dateStamp(){
        SimpleDateFormat format = new SimpleDateFormat("ddmmyyHHss");
        return format.format(new Date());
    }

    public static String  getSelectedTextFromDropDown(By by){
    Select select = new Select(driver.findElement(by));
    return select.getFirstSelectedOption().getText();
    }

    public static void captureScreenShot(String screenshotName){
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("src/test/resources/screenshots" + screenshotName + dateStamp()+".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
