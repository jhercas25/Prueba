package com.pages;

import drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends BasePage {

    @FindBy(xpath="//span[contains(text(),'Thank you')]")
    private WebElement thankyouMessage;

    public ThankYouPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public String getThankYouMessage(){
        return getText(thankyouMessage);
    }

}
