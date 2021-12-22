package com.glovoapp.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {

    public static WebDriver driver;
    @BeforeAll
    public void setupBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterAll
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

