package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils {
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(By.linkText("Register"));
    }

    public void changeCurrencySymbolEuro(){
        //select Euro currency
        selectFromDropdownByIndex(By.xpath("//select[@id='customerCurrency']"),1);
        list(By.xpath("//div[@class='item-box']//span[@class='price actual-price']"));
    }
    public void changeCurrencySymbolDollar(){
        //select dollar currency
        selectFromDropdownByIndex(By.xpath("//select[@id='customerCurrency']"),0);
        list(By.xpath("//div[@class='item-box']//span[@class='price actual-price']"));
    }

    public void searchNike(){
        //type nike in search bar
        enterText(By.xpath("//input[@type='text']"),"Nike");
        //click search
        clickOnElement(By.xpath("//button[@type='submit']"));
    }

    public void clickOnComputers(){
        //click computers
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']"));

    }
    public void NewOnlineStoreIsOpen(){
        //click New online store is open!
        clickOnElement(By.xpath("//div[@class='news-head']//a[@href='/new-online-store-is-open']"));
    }
}
