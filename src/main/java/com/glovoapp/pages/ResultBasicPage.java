package com.glovoapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultBasicPage extends BasicPage {


    public ResultBasicPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean isElementPresent() {
        return driver.findElements(By.cssSelector(".vehicle-field-icon")).size() > 0;
    }


}


