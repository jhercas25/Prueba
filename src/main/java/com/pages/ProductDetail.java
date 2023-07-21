package com.pages;

import com.pages.components.QuoteForm;
import drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDetail extends BasePage {
    @FindBy(id="VariantSelector_VARGRP62")
    private WebElement connectorSelect;

    @FindBy(id="VariantSelector_VARGRP65")
    private WebElement operationSelect;

    @FindBy(css="#Block__RequestInformationButton a")
    private WebElement requestQuoteButton;

    public ProductDetail() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void selectConnectorOption(String name){
        doClick(this.connectorSelect);
        Select connectorSelect = new Select(this.connectorSelect);
        connectorSelect.selectByVisibleText(name);
    }

    public void selectOperationOption(String name){
        Select operationSelect = new Select(this.operationSelect);
        operationSelect.selectByVisibleText(name);
    }

    public void clickOnRequestQuoteButton(){
        doClick(requestQuoteButton);
    }

    public void sendQuote(){
        QuoteForm form = new QuoteForm();
        form.fillform();
        form.checkPermissions();
        form.sendQuote();
    }

}
