package com.glovoapp.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {

    public static WebDriver driver;
    @Before
    public void setupBrowser(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}

