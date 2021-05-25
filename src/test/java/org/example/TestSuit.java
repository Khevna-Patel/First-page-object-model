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
      FaceBookPage faceBookPage = new FaceBookPage();

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
        //fill comment details
        newOnlineStoreIsOpenPage.newOnlineStoreOpenComments();
        //verify comment added successfully
        newOnlineStoreIsOpenPage.verifyUserShouldSeeSuccessMessage();
        //verify comment present in comment list
       // newOnlineStoreIsOpenPage.verifyCommentIsPresentInTheCommentList();
        //verify added comment is at last in comment list
        newOnlineStoreIsOpenPage.verifyAddedCommentIsAtLastInTheList();
    }

    @Test
    public void userShouldAbleToGetTheAlertMessage(){
        //get Alert message
        homePage.alertHandelingForSearch();
    }

    @Test
    public void userShouldAbleToHandelFacebookPopWindow(){
        //click on facebook
        homePage.popUpWindowHandelingForFacebook();
        //get text from facebook page
        faceBookPage.windowHandle_Facebook();

    }


}
