package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Page {

    protected WebDriverWait webDriverWait;
    protected static WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();

    public Page(WebDriver driver) {
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


}
