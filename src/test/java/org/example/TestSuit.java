package org.example;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
      HomePage homePage = new HomePage();
      RegisterPage registerPage = new RegisterPage();
      ResultVerificationPage resultPage = new ResultVerificationPage();
      SearchNikeProducts searchNikeProducts = new SearchNikeProducts();
      ComputerPage computerPage = new ComputerPage();
      SoftwareCategoryPage softwareCategoryPage = new SoftwareCategoryPage();
      NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage = new NewOnlineStoreIsOpenPage();

    @Test
    public void userShouldBeAbleRegisterInSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify registration success message
        resultPage.verifyRegisterMessage();
    }
    @Test
    public void userShouldAbleToChangeCurrencySuccessfully(){
        //enter currency
        homePage.selectUSDollarCurrency();
        //verify Currency display in message
        homePage.verifyChangeOfCurrencySymbolInEachProductPrice();
        //enter  currency
        homePage.selectEuroCurrency();
        //verify Currency display in message
        homePage.verifyChangeOfCurrencySymbolInEachProductPrice();

    }

    @Test
    public void userShouldAbleToSearchNikeProductsSuccessfully(){
        //search nike
        homePage.searchNike();
        searchNikeProducts.nikeProducts();

    }

    @Test
    public void userShouldAbleToSeeAddToCartButtonPresentForAllTheProducts(){
        //click computer
        homePage.clickOnComputers();
        //click software
        computerPage.clickOnSoftware();
        //verify all the products have add to cart button
        softwareCategoryPage.addToCartButtonCheck();

    }

    @Test
    public void userShouldAbleToCommentInNewOnlineStore(){
        //click on new on line store is open
        homePage.NewOnlineStoreIsOpen();
        newOnlineStoreIsOpenPage.newOnlineStoreOpenComments();
        //check new message is added
        resultPage.verifyUserShouldSeeSuccessMessage();
        //check title is added
        resultPage.verifyTitleIsPresentInTheList();
        //check comment is added
        resultPage.verifyYourCommentIsPresentInTheList();

    }
}
