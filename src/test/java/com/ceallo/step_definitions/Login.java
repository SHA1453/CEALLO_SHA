package com.ceallo.step_definitions;

import com.ceallo.pages.LoginPage;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Login {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
    }

    @When("user enters username")
    public void userEntersUsername() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("login.username"));
    }

    @And("user enters  password")
    public void userEntersPassword() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("login.pw"));
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        loginPage.loginButton.click();
    }
}
