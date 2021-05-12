package org.example;

import org.openqa.selenium.By;

public class SoftwareCategoryPage extends Utils{

    public void addToCartButtonCheck() {

        //check add to cart button present in all the products
        list(By.xpath("//h2[@class='product-title']"));
        if (getTextFromElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("Add to cart"))
        {

        }
        else
            {
                System.out.println(getTextFromElement(By.xpath("//h2[@class='product-title']")).contains("Add to cart"));
        }
    }}