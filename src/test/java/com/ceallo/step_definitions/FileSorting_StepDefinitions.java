package com.ceallo.step_definitions;

import com.ceallo.pages.HomePage;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorting_StepDefinitions {

    List<String> sortedNames = new ArrayList<>();
    List<String> sortedSizes = new ArrayList<>();
    List<String> sortedMDates = new ArrayList<>();

    HomePage homePage = new HomePage();

    @Given("user is on the home page")
    public void userIsOnTheLoginPage() {

        homePage.cealloIcon.click();
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Files"));

    }


    @When("User clicks on the Name button")
    public void userClicksOnTheNameButton() {
        for (WebElement fileListName : homePage.names) {
            sortedNames.add(fileListName.getText());
        }
        homePage.linkName.click();
    }

    @Then("User should see the folder view order by Name")
    public void userShouldSeeTheFolderViewOrderByName() {
        List<String> names = new ArrayList<>();
        for (WebElement name : homePage.names) {
            names.add(name.getText());
        }

        Collections.sort(sortedNames);
        System.out.println(sortedNames);
        System.out.println(names);
        System.out.println(names.size());
        Assert.assertTrue(sortedNames.equals(names));
    }

    @When("User clicks on the Size button")
    public void userClicksOnTheSizeButton() {
        for (WebElement size : homePage.sizes) {
            sortedSizes.add(size.getText());
        }
        homePage.linkSize.click();
    }

    @Then("User should see folder view order by Size")
    public void userShouldSeeFolderViewOrderBySize() {
        List<String> sizes = new ArrayList<>();
        for (WebElement size : homePage.sizes) {
            sizes.add(size.getText());
        }

        Collections.sort(sortedSizes);
        System.out.println(sortedSizes);
        System.out.println(sizes);
        System.out.println(sizes.size());
        Assert.assertTrue(sortedSizes.equals(sizes));
    }

    @When("User clicks on the Modified button")
    public void userClicksOnTheModifiedButton() {
        for (WebElement mDate : homePage.mDates) {
            sortedMDates.add(mDate.getText());
        }

        homePage.linkMDate.click();
    }

    @Then("User should see folder view order by Modified")
    public void userShouldSeeFolderViewOrderByModified() {
        List<String> mDates = new ArrayList<>();
        for (WebElement mDate : homePage.mDates) {
            sortedMDates.add(mDate.getAttribute("data-original-title"));
        }


        System.out.println(sortedNames);
        System.out.println(mDates);
        System.out.println(mDates.size());
        Assert.assertTrue(sortedMDates.equals(mDates));

    }
}
