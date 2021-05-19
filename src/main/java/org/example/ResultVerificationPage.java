package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;

public class ResultVerificationPage extends Utils{
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    SoftAssert softAssert = new SoftAssert();

    private By _registerMessage = By.xpath("//div[@class='result']");
    private By _verifyActualComment = By.xpath("//div[@class='result']");
    private By _actualTitle = By.xpath("//div[@class='comment-content']");
    private By _actualComment = By.xpath("//strong[@class='comment-text']");
    private By _addedComment = By.xpath("//p[@class='comment-text']");
    private By _comment = By.xpath("//span[@class='state-value']");


    public void verifyRegisterMessage(){
        //assert to print expected message
        Assert.assertEquals(getTextFromElement(_registerMessage),"Your registration completed","Your registration is not completed");
        System.out.println("Your registration completed");
    }


    public void verifyUserShouldSeeSuccessMessage(){
        //assert to print success message
        Assert.assertEquals(getTextFromElement(_verifyActualComment),"News comment is successfully added.","News comment is not successfully added");
        System.out.println("News comment is successfully added.");
    }
    public void verifyTitleIsPresentInTheList () {
        //assert to print the added title is present in the comment list
        List<WebElement> commentList1 = driver.findElements(_comment);

        String expectedComment = "Test";
        for (WebElement element : commentList1)
        {
         softAssert.assertEquals(driver.findElement(_actualComment).getText(),expectedComment,"Title do not match");
        }
        System.out.println("Title matched");
    }

    public void verifyYourCommentIsPresentInTheList(){
     //assert to print added comment is present in the list
     List<WebElement> commentList2 = driver.findElements(_addedComment);
     String expectedComment = "very nice collection";
     for (WebElement element : commentList2)
     {
         softAssert.assertEquals(driver.findElement(_addedComment).getText(),expectedComment,"Comment do not match");
     }
        System.out.println("Comment matched");
    }


}
