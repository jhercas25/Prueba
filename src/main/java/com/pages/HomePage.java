package com.pages;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy (css = ".preloader-overlay")
    private  WebElement overlay;

    @FindBy(css = "#UseCaseQC_facetMKT10512 + label")
    private WebElement useCaseCheckbox;

    @FindBy(css = "#ConnectionType_facetMKT10520 + label")
    private WebElement connectionCheckbox;

    @FindBy(id = "ProductsContainer")
    private WebElement products;

    public HomePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void checkTestingOption(){
        waitForInvisibility(2,overlay);
        doClick(useCaseCheckbox);
    }

    public void checkFemaleThreadsOption(){
        waitForInvisibility(2,overlay);
        doClick(connectionCheckbox);
    }

    public void getProduct(String name){
        waitForInvisibility(5, overlay);
        waitForClickable(5,products);
        WebElement product = products.findElement(By.xpath("//*[contains(text(),'"+name+"')]"));
        waitForClickable(5,product);
        doClick(product);
    }




}
