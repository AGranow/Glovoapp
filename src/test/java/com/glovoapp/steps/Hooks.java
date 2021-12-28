package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    RegistrationPage registrationPage = new RegistrationPage(driver);

    @BeforeAll
    public static void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}

