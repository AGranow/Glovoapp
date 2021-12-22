package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import com.glovoapp.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CouriersSteps {


    RegistrationPage registrationPage;
    ResultPage resultPage;

    @Given("I am on the Registration page")
    public void iAmOnTheRegistrationPage() {
        registrationPage.openURL();
    }

    @When("I insert registration user data")
    public void iInsertRegistrationUserData() {
        registrationPage.insertUserData("Minsk");
    }

    @And("I click on Register button")
    public void iClickOnRegisterButton() {
        registrationPage.clickButtonNext();
    }

    @Then("I see next page is opened")
    public void iSeeNextPageIsOpened() {
        Assert.assertTrue(resultPage.isElementPresent());
    }
}
