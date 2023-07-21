package com.pages;

import drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {
        this.driver = Driver.get();
    }

    public void waitForVisibility(int time, WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForInvisibility(int time, WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));
    };
    public void waitForClickable(int time,WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void doClick(WebElement element){
        this.waitForClickable(2,element);
        element.click();
    }
    public String getText(WebElement element){
        this.waitForVisibility(2,element);
        return element.getText();
    }

    public void sendKeys(WebElement element,String keys){
        this.waitForVisibility(2,element);
        element.sendKeys(keys);
    }
}
