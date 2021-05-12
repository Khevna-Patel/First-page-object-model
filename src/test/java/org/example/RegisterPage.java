package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class RegisterPage extends Utils{
    //Timestamp for current time- to create unique email value each time we run the program
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void enterRegistrationDetails() {
        waitForClickable(By.id("register-button"),4000);
        //click female in gender
        clickOnElement(By.xpath("//input[@id='gender-female']"));
        //Type First name
        enterText(By.id("FirstName"), "Khevna");
        //Type Lst name
        enterText(By.id("LastName"),"Patel");
        //select Date of birthday from dropdown
        selectFromDropdownByVisibleText(By.name("DateOfBirthDay"), "14");
        //select Date of month from dropdown
        selectFromDropDownByValue(By.name("DateOfBirthMonth"), "9");
        //select Date of birth year from dropdown
        selectFromDropdownByIndex(By.name("DateOfBirthYear"), 86);
        //type email with timestamp
        enterText(By.xpath("//input[@id='Email']"),"testtest"+timestamp.getTime()+"@test.com");
        //Type company name
        enterText(By.id("Company"),"Patel pvt ltd");
        //untick newsletter check box
        clickOnElement(By.xpath("//input[@Type='checkbox']"));
        //Type password
        enterText(By.id("Password"),"testTest");
        //Type confirm password
        enterText(By.id("ConfirmPassword"),"testTest");
        //click on register - submit button
        clickOnElement(By.name("register-button"));


    }


}
