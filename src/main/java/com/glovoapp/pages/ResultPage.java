package com.glovoapp.pages;

import org.openqa.selenium.By;

public class ResultPage extends Page {



    public boolean isElementPresent() {
        return Page.driver.findElements(By.cssSelector(".vehicle-field-icon")).size() > 0;
    }
}


