package org.example;

import org.openqa.selenium.By;

public class NewOnlineStoreIsOpenPage extends Utils{
    public void newOnlineStoreOpenComments(){

        waitForClickable(By.xpath("//button[@name='add-comment']"),18000);
        //type Title
        enterText(By.xpath("//input[@class='enter-comment-title']"),"Test");
        //type comment
        enterText(By.xpath("//textarea[@class='enter-comment-text']"),"Nice Experience using online store.");
        //click New comment
        clickOnElement(By.xpath("//button[@name='add-comment']"));

    }
}
