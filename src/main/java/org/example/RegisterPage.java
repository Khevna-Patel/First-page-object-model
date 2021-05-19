package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils{
    private By _registerButton = By.name("register-button");
    private By _gender = By.xpath("//input[@id='gender-female']");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthday = By.name("DateOfBirthDay");
    private By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _emailId = By.xpath("//input[@id='Email']");
    private By _company = By.id("Company");
    private By _newsLetterBox = By.xpath("//input[@Type='checkbox']");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegister = By.name("register-button");

    LoadProperty loadProperty = new LoadProperty();
    //Timestamp for current time- to create unique email value each time we run the program
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void enterRegistrationDetails() {
        waitForClickable(_registerButton,4000);
        //click female in gender
        clickOnElement(_gender);
        //Type First name
        enterText(_firstName, loadProperty.getProperty("FirstName"));
        //Type Lst name
        enterText(_lastName, loadProperty.getProperty("LastName"));
        //select Date of birthday from dropdown
        selectFromDropdownByVisibleText(_dateOfBirthday, loadProperty.getProperty("DateOfBirthday"));
        //select Date of month from dropdown
        selectFromDropDownByValue(_dateOfBirthMonth, loadProperty.getProperty("DateOfBirthMonth"));
        //select Date of birth year from dropdown
        selectFromDropDownByValue(_dateOfBirthYear, loadProperty.getProperty("DateOfBirthYear"));
        //type email with timestamp
        enterText(_emailId,loadProperty.getProperty("email")+ timestamp.getTime() +"@gmail.com");
        //Type company name
        enterText(_company, loadProperty.getProperty("Company"));
        //untick newsletter check box
        clickOnElement(_newsLetterBox);
        //Type password
        enterText(_password, loadProperty.getProperty("Password"));
        //Type confirm password
        enterText(_confirmPassword, loadProperty.getProperty("ConfirmPassword"));
        //click on register - submit button
        clickOnElement(_clickOnRegister);


    }

}
