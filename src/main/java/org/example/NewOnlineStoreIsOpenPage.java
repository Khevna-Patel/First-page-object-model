package org.example;

import org.openqa.selenium.By;

public class NewOnlineStoreIsOpenPage extends Utils {

    private By _Title =  By.xpath("//input[@class='enter-comment-title']");
    private By _comments = By.xpath("//textarea[@class='enter-comment-text']");
    private By _newComment = By.xpath("//button[@name='add-comment']");
    private By _wait = By.xpath("//button[@name='add-comment']");

    LoadProperty loadProperty = new LoadProperty();

    public void newOnlineStoreOpenComments(){

        waitForClickable(_wait,18000);
        //type Title
        enterText(_Title,loadProperty.getProperty("Title"));
        //type comment
        enterText(_comments,loadProperty.getProperty("Comment"));
        //click New comment
        clickOnElement(_newComment);

    }
}
