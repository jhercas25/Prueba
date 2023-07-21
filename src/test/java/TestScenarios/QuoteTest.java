package TestScenarios;

import com.pages.HomePage;
import com.pages.ProductDetail;
import com.pages.ThankYouPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuoteTest extends BaseTest {
    @Test
    public void QuoteTest() {
        HomePage home = new HomePage();
        home.checkTestingOption();
        home.checkFemaleThreadsOption();
        home.getProduct("Connector TW17V for testing of components with female thread, pneumatic actuation via valve button, vacuum up to max. 350 bar - Product family");
        ProductDetail productPage = new ProductDetail();
        productPage.selectConnectorOption("M10x1.0 Female thread");
        productPage.selectOperationOption("50 bar");
        productPage.clickOnRequestQuoteButton();
        productPage.sendQuote();
        ThankYouPage thankYouPage = new ThankYouPage();
         Assert.assertEquals(thankYouPage.getThankYouMessage(),"Thank you");
    }

}
