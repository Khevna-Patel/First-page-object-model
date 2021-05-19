package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchNikeProducts extends Utils{
    private By _itemBoxes = By.className("item-box");
    private By _productNames = By.cssSelector("h2.product-title");

    public void nikeProducts(){
        //find number of items
        List<WebElement> webElementList = driver.findElements(_itemBoxes);
        int count = 0;
        //item list
        for (WebElement element : webElementList){
            //checking condition if product name contains Nike word
            if (element.findElement(_productNames).getText().contains("Nike")){
                //print the product name when above condition is true
                System.out.println(element.findElement(_productNames).getText());
                //counting with actual product name
                count++;
            }
            else {
                //when condition do not match
                System.out.println("Product name does not contain Nike ");
            }
        }
        //assert to check total product name which contains Nike word
        Assert.assertEquals(count,webElementList.size()," Nike word should be present in " + webElementList.size() + " It is present in " + count + "\n");
        System.out.println("Nike word is present in all product names");
    }
}
