package com.ceallo.step_definitions;

import com.ceallo.pages.HomePage;
import com.ceallo.utilities.BrowserUtils;
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

    HomePage homePage = new HomePage();
    String beforeClickingToggleViewButton = "";

    @Given("user is on the home page")
    public void userIsOnTheLoginPage() {

        homePage.cealloIcon.click();
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Files"));

    }


    @When("User clicks on the Name button")
    public void userClicksOnTheNameButton() {

        homePage.linkName.click();
    }

    @Then("User should see the folder view order by Name")
    public void userShouldSeeTheFolderViewOrderByName() {
        List<String> names = new ArrayList<>();
        for (WebElement name : homePage.names) {
            names.add(name.getText());
        }
        List<String> sortedNames = new ArrayList<>(names);

        Collections.sort(sortedNames);
        System.out.println(sortedNames);
        System.out.println(names);
        System.out.println(names.size());
        Assert.assertEquals(sortedNames, names);
    }

    @When("User clicks on the Size button")
    public void userClicksOnTheSizeButton() {

        homePage.linkSize.click();
    }

    @Then("User should see folder view order by Size")
    public void userShouldSeeFolderViewOrderBySize() {
        List<Integer> sizes = new ArrayList<>();
        for (WebElement size : homePage.sizes) {
            String str = size.getText();
            String ints ="";
            char[] chars = str.toCharArray();
            for (char aChar : chars) {
                if (aChar>=48 && aChar<=57){
                    ints+=aChar;

                }
            }
            if (str.contains("MB")){
                ints+="000";
            }
            sizes.add(Integer.parseInt(ints));
        }
        List<Integer> sortedSizes = new ArrayList<>(sizes);

        Collections.sort(sortedSizes);
        Collections.reverse(sortedSizes);
        System.out.println(sortedSizes);
        System.out.println(sizes);
        System.out.println(sizes.size());
        Assert.assertEquals(sortedSizes, sizes);
    }

    @When("User clicks on the Modified button")
    public void userClicksOnTheModifiedButton() {
        homePage.linkMDate.click();
    }

    @Then("User should see folder view order by Modified")
    public void userShouldSeeFolderViewOrderByModified() {
        List<String> mDates = new ArrayList<>();
        for (WebElement mDate : homePage.mDates) {
            mDates.add(mDate.getAttribute("data-original-title"));
        }

        List<String> sortedMDates = new ArrayList<>(mDates);

        System.out.println(sortedMDates);
        System.out.println(mDates);
        System.out.println(mDates.size());
        Assert.assertEquals(sortedMDates, mDates);

    }

    @When("user clicks on the toggle-view button")
    public void userClicksOnTheToggleViewButton() {
        beforeClickingToggleViewButton = homePage.toggleGridButton.getAttribute("class");
        homePage.toggleGridButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should change the folder view")
    public void userShouldChangeTheFolderView() {
        String afterClickingToggleViewButton = homePage.toggleGridButton.getAttribute("class");
        Assert.assertNotEquals(beforeClickingToggleViewButton,afterClickingToggleViewButton);
        BrowserUtils.sleep(2);

        // to change again the view
        beforeClickingToggleViewButton=homePage.toggleGridButton.getAttribute("class");

        homePage.toggleGridButton.click();
        BrowserUtils.sleep(2);
        afterClickingToggleViewButton= homePage.toggleGridButton.getAttribute("class");
        Assert.assertNotEquals(beforeClickingToggleViewButton,afterClickingToggleViewButton);


    }


    @When("user clicks on select all checkbox")
    public void userClicksOnSelectAllCheckbox() {
        homePage.selectAllFilesCheckBox.click();
    }

    @Then("user see total values of all files on first line")
    public void userSeeTotalValuesOfAllFilesOnFirstLine() {
        String actualFilesSelected = homePage.FoldersAndFiles.getText();
        Assert.assertTrue(actualFilesSelected.contains("files")&&actualFilesSelected.contains("folders"));
    }
}
