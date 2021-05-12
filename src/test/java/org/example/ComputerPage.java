package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    public void clickOnSoftware(){

       sleep(2000);
        //click software
        clickOnElement(By.xpath("//img[@alt='Picture for category Software']"));
    }
}
