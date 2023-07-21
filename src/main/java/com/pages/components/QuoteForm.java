package com.pages.components;

import com.pages.BasePage;
import drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteForm extends BasePage {

    @FindBy(id="FirstName")
    private WebElement firstNameInput;

    @FindBy(id="LastName")
    private WebElement lastNameInput;

    @FindBy(id="Company")
    private WebElement companyInput;

    @FindBy(id="Address")
    private WebElement addressInput;

    @FindBy(id="City")
    private WebElement cityInput;

    @FindBy(id="Zip")
    private WebElement zipInput;

    @FindBy(id="Country")
    private WebElement countryInput;

    @FindBy(id="Email")
    private WebElement emailInput;

    @FindBy(css="#ConsentGDPR + label")
    private WebElement permissionCheckbox;

    @FindBy(id="Send")
    private WebElement sendButton;

    public QuoteForm() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void fillform(){
        firstNameInput.sendKeys("aaa");
        lastNameInput.sendKeys("aaa");
        companyInput.sendKeys("aaa");
        addressInput.sendKeys("aaa");
        cityInput.sendKeys("aaa");
        zipInput.sendKeys("aaa");
        countryInput.sendKeys("aaa");
        emailInput.sendKeys("aa@aa.com");
    };

    public void checkPermissions(){
        doClick(permissionCheckbox);
    };

    public void sendQuote(){
        doClick(sendButton);
    };
}
