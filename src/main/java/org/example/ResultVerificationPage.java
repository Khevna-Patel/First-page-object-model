package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;

public class ResultVerificationPage extends Utils{

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    LoadProperty loadProperty = new LoadProperty();
    SoftAssert softAssert = new SoftAssert();

    private By _registerMessage = By.xpath("//div[@class='result']");



    public void verifyRegisterMessage(){
        //assert to print expected message
        Assert.assertEquals(getTextFromElement(_registerMessage),"Your registration completed","Your registration is not completed");
        System.out.println(loadProperty.getProperty("RegisterMessage"));
    }





}
