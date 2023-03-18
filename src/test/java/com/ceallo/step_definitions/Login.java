package com.ceallo.step_definitions;

import com.ceallo.pages.HomePage;
import com.ceallo.pages.LoginPage;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class Login {

    HomePage homePage = new HomePage();
    @Given("user is on the home page")
    public void userIsOnTheLoginPage() {

    }

    @When("user clicks on the ceallo icon")
    public void user_clicks_on_the_ceallo_icon() {
        homePage.cealloIcon.click();
    }
    @Then("user should see files")
    public void user_should_see_files() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));
    }
}
