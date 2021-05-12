package org.example;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
      HomePage homePage = new HomePage();
      RegisterPage registerPage = new RegisterPage();
      ResultPage resultPage = new ResultPage();
      SearchNikeProducts searchNikeProducts = new SearchNikeProducts();
      ComputerPage computerPage = new ComputerPage();
      SoftwareCategoryPage softwareCategoryPage = new SoftwareCategoryPage();
      NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage = new NewOnlineStoreIsOpenPage();
    @Test
    public void userShouldBeAbleToLogInSuccessfully(){
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
        homePage.changeCurrencySymbolEuro();
        //enter dollar currency
        homePage.changeCurrencySymbolDollar();
        //verify Currency display in message
        resultPage.verifyCurrency();
    }

    @Test
    public void userShouldAbleToSearchNikeProductsSuccessfully(){
        //search nike
        homePage.searchNike();
        searchNikeProducts.nikeProducts();
        //verify the products with nike name
        resultPage.verifyNikeProducts();
    }

    @Test
    public void userShouldAbleToSeeAddToCartButtonPresentForAllTheProducts(){
        //
        homePage.clickOnComputers();
        computerPage.clickOnSoftware();
        softwareCategoryPage.addToCartButtonCheck();

    }

    @Test
    public void userShouldAbleToCommentInNewOnlineStore(){
        homePage.NewOnlineStoreIsOpen();
        newOnlineStoreIsOpenPage.newOnlineStoreOpenComments();
        resultPage.verifyUserShouldSeeSuccessMessage();
        resultPage.verifyYourCommentIsPresentInTheList();
        resultPage.verifyYourCommentIsPresentAtLastInTheList();


    }
}
