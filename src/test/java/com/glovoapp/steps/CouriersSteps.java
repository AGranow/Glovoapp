package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import com.glovoapp.pages.ResultBasicPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CouriersSteps {


    RegistrationPage registrationPage = new RegistrationPage(Hooks.driver);
    ResultBasicPage resultPage = new ResultBasicPage(Hooks.driver);


    @Given("I am on the Registration page")
    public void iAmOnTheRegistrationPage() {
        registrationPage.openURL();
        registrationPage.closeCookiesPopup("Согласиться с использованием всех файлов cookie");
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
