package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasicPage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public static String REG_URL = "https://couriers.glovoapp.com/by/";


    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputName;


    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(css = ".text-field__input .el-select__caret")
    private WebElement cityDropdown;



    @FindBy (xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement cookieButton;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement inputTel;

    @FindBy(xpath = "//button/span")
    private WebElement buttonNext;



    public void openURL() {
        driver.get(REG_URL);

    }

    public Boolean contentIsDisplayed(String text) {
        if (this.driver.findElements(By.xpath("//*[text = '" + text + "']")).size() > 0)
            return true;
        else return false;
    }


    public void closeCookiesPopup(String text) {
        if (contentIsDisplayed(text)) {
            cookieButton.click();
        }
    }

    public void insertUserData(String cityName) {
        Faker faker = new Faker();
        inputName.sendKeys(faker.name().fullName());
        inputEmail.sendKeys(faker.internet().emailAddress());
        cityDropdown.click();
        WebElement cityFromList = driver.findElement(By.xpath("//*[contains(text(), '" + cityName + "' )]"));
        cityFromList.click();
    }

    public void clickButtonNext() {
        buttonNext.click();
    }
}