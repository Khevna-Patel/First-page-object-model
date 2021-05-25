package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    private By _software = By.cssSelector(".active.last .sublist .inactive:nth-of-type(3)>a");

    public void clickOnSoftware(){

        sleep(2000);
        //click software
        clickOnElement(_software);
    }
}
