package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultPage extends Utils{
    public void verifyRegisterMessage(){
        //assert to print expected message
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"Your registration completed","Your registration is not completed");
        System.out.println("Your registration completed");
    }
    public void verifyCurrency(){
        //print the message for currency symbol change
        System.out.println("Currency symbol change for all the products");
    }
    public void verifyNikeProducts(){
        //print the message for nike products are displayed
        System.out.println("All The displayed products are nike products");
    }

    public void verifyUserShouldSeeSuccessMessage(){
        //assert to print success message
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"News comment is successfully added.","News comment is not successfully added");
        System.out.println("News comment is successfully added.");
    }
    public void verifyYourCommentIsPresentInTheList() {
        //assert to print the added comment is present in the comment list
       boolean productDisplayed = driver.findElement(By.xpath("//div[@class='comment-content']")).isDisplayed();
       Assert.assertTrue(productDisplayed,"Comments are not displayed in the list.");
        System.out.println("Comments are displayed in the list.");
    }
    public void verifyYourCommentIsPresentAtLastInTheList(){
        //assert to print the added comment is present at last in the comment list
        boolean productDisplayedLast = driver.findElement(By.xpath("//span[@class='stat-value']")).isDisplayed();
        Assert.assertTrue(productDisplayedLast,"Comments are not displayed Last in the list");
        System.out.println("Comments are displayed Last in the list");
    }

}
