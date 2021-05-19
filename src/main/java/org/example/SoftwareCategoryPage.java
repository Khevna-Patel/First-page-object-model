package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SoftwareCategoryPage extends Utils{
    private By _itemBoxes = By.className("item-box");
    private By _addToCartButton = By.cssSelector("button.button-2.product-box-add-to-cart-button");
    private By _productName = By.cssSelector("h2.product-title > a");


    public void addToCartButtonCheck() {
        //finding number of items
        List<WebElement> webElementList = driver.findElements(_itemBoxes);
        int count = 0, nobutton = 0;

        for (WebElement element : webElementList)
        {
            if (element.findElements(_addToCartButton).size() == 1)
            {
                count++;
            }
            if (element.findElements(_addToCartButton).size() != 1)
            {
                nobutton++;
                System.out.println(element.findElement(_productName).getText() + " No Add To Cart Button");
            }
        }
        Assert.assertEquals(count, webElementList.size(),"Add to cart button should be "+ webElementList.size() +" but it is "+count+"\n");
        System.out.println("Add to cart button is present in each product of this page");


    }}

