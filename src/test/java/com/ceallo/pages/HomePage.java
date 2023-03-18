package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(css = "a[id='nextcloud']")
    public WebElement cealloIcon;

    @FindBy(xpath = "//p[contains(@class, 'is-empty')]")
    public WebElement Input_AddNotes;

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement linkHome;

    @FindBy(xpath = "//*[@id='app-navigation-toggle']")
    public WebElement AppNavigationToggle;

    @FindBy(xpath = "//a[@aria-label='More apps']")
    public WebElement linkMoreApps;
    

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
