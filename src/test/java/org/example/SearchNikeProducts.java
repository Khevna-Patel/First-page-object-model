package org.example;

import org.openqa.selenium.By;

public class SearchNikeProducts extends Utils{

    public void nikeProducts(){
        //search nike products
        list(By.xpath("//div[@class='item-box']//h2[@class='product-title']"));
    }
}
