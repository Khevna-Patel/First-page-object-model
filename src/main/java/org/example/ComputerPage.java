package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    private By _software = By.xpath("//img[@alt='Picture for category Software']");

    public void clickOnSoftware(){

        sleep(2000);
        //click software
        clickOnElement(_software);
    }
}
