package pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static configuration.common.GlobalReUsableMethods.*;
import static pageelements.SearchBoxElements.*;

public class SearchBox extends WebTestBase {
    public SearchBox() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = enterValidProductInSearchBoxWebElement)
    public WebElement enterValidProductInSearchBox;

    @FindBy(xpath = clickOnSearchButtonWebElement)
    public WebElement clickOnSearchButton;
    @FindBy(xpath = verifySearchedProductWebElement)
    public WebElement verifySearchedProduct;

    public void enteringProDuctINSearchBox() {
        enterValueOnElement(enterValidProductInSearchBox, "t-shirt");
    }

    public void clickingSearchButton() {
        clickOnElement(clickOnSearchButton);
    }

    //  Assertion Method
    public void searchResultDisplayed(String expectedKeyWord) {
        String actualSearchKeyword = verifySearchedProduct.getText();
        System.out.println("Actual Text: " + actualSearchKeyword);
        Assert.assertEquals(actualSearchKeyword, expectedKeyWord, "Search keyword not match");
    }




    @FindBy(xpath = clickOnFreeShippingByAmazonCheckBoxWebElement)
    public WebElement clickOnFreeShippingByAmazonCheckBox;
    @FindBy(xpath = enterMinimumPriceInPriceEditFieldWebElement)
    public WebElement enterMinimumPriceInPriceEditField;
    @FindBy(xpath = enterMaximumPriceInPriceEditFieldWebElement)
    public WebElement  enterMaximumPriceInPriceEditField;
    @FindBy(xpath = clickOnGoButtonWebElement)
    public WebElement clickOnGoButton;
    @FindBy(xpath = verifyAllProductsWebElement)
    public  WebElement verifyEligibleForFreeShippingProducts;

    public void enteringProDuctINSearchBox1(String productName) {
        enterValueOnElement(enterValidProductInSearchBox,productName);
    }
    public void clickingFreeShipping(){
        clickOnElement(clickOnFreeShippingByAmazonCheckBox);
    }
     public void enteringMinimumPrice(){
        enterValueOnElement(enterMinimumPriceInPriceEditField,"100");
     }
     public void enteringMaximumPrice(){
        enterValueOnElement(enterMaximumPriceInPriceEditField,"200");
     }
     public void clickingButton(){
         clickOnElement(clickOnGoButton);
     }


}

//    @FindBy(xpath = searchBoxWebElement)
//    public WebElement searchBox;
//    @FindBy(xpath = searchButtonWebElement)
//    public WebElement searchButton;
//    @FindBy(xpath = verifySearchedProductWebElement)
//    public WebElement verifySearchedProduct;
//
//    @FindBy(xpath = purellAdvancedHandSanitizerWebElement)
//    public WebElement purellAdvancedHandSanitizer;
//    @FindBy(xpath = oneTimePurchaseWebElement)
//    public WebElement oneTimePurchase;
//    @FindBy(xpath = selectQtyWebElement)
//    public WebElement selectQty;
//    @FindBy(xpath = setQtyWebElement)
//    public WebElement setQty;
//    @FindBy(xpath = addToShoppingCartWebElement)
//    public WebElement addToShoppingCart;
//    @FindBy(xpath = proceedToRetailCheckoutWebElement)
//    public WebElement proceedToRetailCheckout;
//
//
//    // Search Product
//    public void searchValidProduct(String productName) {
//        //  searchBox.sendKeys("");
//        enterValueOnElement(searchBox, productName);
//        clickOnElement(searchButton);
//    }
//
//    public void enterProductName(String productName) {
//        enterValueOnElement(searchBox, productName);
//    }
//
//    public void clickOnSearchButton() {
//        clickOnElement(searchButton);
//    }
//

//    public void selectPurellAdvancedHandSanitizer() throws InterruptedException {
//        scrollDownToElement(purellAdvancedHandSanitizer);
//        clickOnElement(purellAdvancedHandSanitizer);
//        waitFor(5);
//        clickOnElement(oneTimePurchase);
//        clickOnElement(selectQty);
//        clickOnElement(setQty);
//        clickOnElement(addToShoppingCart);
//        clickOnElement(proceedToRetailCheckout);
//        waitFor(10);
//    }



