package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils{
    private By _register = By.cssSelector("li > a.ico-register");
    private By _selectCurrency = By.cssSelector("select#customerCurrency");
    private By _priceList = By.xpath("//span[contains(@class, 'price actual-price')]");
    private By _searchStore = By.xpath("//input[@type='text']");
    private By _search = By.cssSelector("button[type='submit'");
    private By _clickComputer = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    private By _clickNewOnlineStoreIsOpen = By.cssSelector(".news-head:first-of-type>a");
    private By _USDollar = By.cssSelector("select#customerCurrency");
    private By _Euro = By.cssSelector("select#customerCurrency");
    private By _facebookButton = By.cssSelector("li.facebook");

    LoadProperty loadProperty = new LoadProperty();
    SoftAssert softAssert = new SoftAssert();
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_register);
    }

    public void selectUSDollarCurrency(){
        //click on currency
        selectFromDropdownByIndex(_USDollar,0);
    }
    public void selectEuroCurrency(){
        //click on currency
        selectFromDropdownByIndex(_Euro,1);
    }

    public static String getCurrencySymbol(String currencyName)
    {
        String currencySymbol = null;
        switch (currencyName){
            case "US Dollar" :
                currencySymbol = "$";
                break;
            case "Euro" :
                currencySymbol = "€";
                break;
            default:
                System.out.println(" Currency is not available ");
        }
        return currencySymbol;
    }

    public void verifyChangeOfCurrencySymbolInEachProductPrice() {
        String currencyNameSelected = getSelectedTextFromDropDown(_selectCurrency);
        String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);

        List<WebElement> priceList = driver.findElements(_priceList);
        for (WebElement element : priceList) {

            String priceSymbolActual = element.getText().substring(0, 1);
            softAssert.assertEquals(priceSymbolActual, expectedCurrencySymbol,"Currency symbol does not match");
        }
        softAssert.assertAll();
        System.out.println(loadProperty.getProperty("EachCurrencyVerify"));
    }

    public void searchNike(){
        //type nike in search bar
        enterText(_searchStore, loadProperty.getProperty("SearchStore"));
        //click search
        clickOnElement(_search);
    }

    public void clickOnComputers(){
        //click computers
        clickOnElement(_clickComputer);

    }
    public void NewOnlineStoreIsOpen(){
        //click New online store is open!
        clickOnElement(_clickNewOnlineStoreIsOpen);
    }

    public void alertHandelingForSearch(){
        //click on search button
        clickOnElement(_search);
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //capture alert message
        String alertMessage = driver.switchTo().alert().getText();
        //verify the message
        Assert.assertEquals(alertMessage,"Please enter some search keyword","Entered text does not found");
        //print alert message
        System.out.println(alertMessage);
        //accept alert
        alert.accept();
    }

    public void popUpWindowHandelingForFacebook(){
        //click on facebook
        clickOnElement(_facebookButton);
    }
}


