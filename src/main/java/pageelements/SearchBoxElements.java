package pageelements;

public class SearchBoxElements {
    public static final String enterValidProductInSearchBoxWebElement="//input[@id='twotabsearchtextbox']";
    public static final String clickOnSearchButtonWebElement="//input[@value='Go']";
    public static final String verifySearchedProductWebElement="//span[normalize-space()='Eligible for Free Shipping']";

   // --------------------------------------------------------------------------------------------------------------------------
    public static final String clickOnFreeShippingByAmazonCheckBoxWebElement="//li[@aria-label='Free Shipping by Amazon']//i";

    public static final String enterMinimumPriceInPriceEditFieldWebElement="//input[@placeholder='Min']";
    public static final String enterMaximumPriceInPriceEditFieldWebElement="//input[@placeholder='Max']";
    public static final String clickOnGoButtonWebElement="//form[@method='get']//span//span//input[@type='submit']";
    public static final String verifyAllProductsWebElement="//span[@class='a-color-state a-text-bold']";
}
