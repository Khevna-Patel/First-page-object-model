package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewOnlineStoreIsOpenPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();

    //new online store locators
    private By _Title =  By.cssSelector("input#AddNewComment_CommentTitle");
    private By _comments = By.cssSelector("textarea#AddNewComment_CommentText");
    private By _newCommentButton = By.xpath("//button[@name='add-comment']");
    private By _wait = By.xpath("//button[contains(@class,'button-1 news-item-add-comment-button')]");
    private By _commentSuccessMessage = By.xpath("//div[starts-with(@class,'result')]");
    private By _commentBox = By.xpath("//div[@class='comment news-comment']");

    //test data used
    String commentTitle = loadProperty.getProperty("title") + dateStamp();
    String commentText = loadProperty.getProperty("comment") + dateStamp();

    public void newOnlineStoreOpenComments(){

        waitForClickable(_wait,20);
        //type Title
        enterText(_Title,commentTitle);
        //type comment
        enterText(_comments,commentText);
        //click New comment
        clickOnElement(_newCommentButton);

    }

    public void verifyUserShouldSeeSuccessMessage(){
        //assert to print success message
        Assert.assertEquals(getTextFromElement(_commentSuccessMessage),"News comment is successfully added.","News comment is not successfully added");
        System.out.println(loadProperty.getProperty("CommentAddedMessage"));
    }

    public void verifyCommentIsPresentInTheCommentList(){
        //verify Comment Present In Comment List
        Assert.assertTrue(getTextFromElement(_comments).contains(commentText), "newly added comment is NOt present in comment list");
        System.out.println(loadProperty.getProperty("CommentPresent"));
    }

    public void verifyAddedCommentIsAtLastInTheList(){
        //finding total comments
        List<WebElement> commentList = driver.findElements(_commentBox);

        //total comments
        int numberOfComments = commentList.size();

        //finding last comment index
        int lastCommentIndex = numberOfComments-1;

        //get text of whole last comment
        String lastCommentActualText = commentList.get(lastCommentIndex).getText();

        //verifying last comments contains text of added comment
        Assert.assertTrue(lastCommentActualText.contains(commentText),"Added comment is NOT at last in comment list");
        System.out.println("NewlyAddedComment");
    }
}
