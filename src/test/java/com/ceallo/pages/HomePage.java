package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//a[@class='icon-home']")
    public WebElement linkHome;
    
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[2]/div/a")
    public WebElement linkName;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[3]/a")
    public WebElement linkSize;

    

    @FindBy(xpath = "//*[@id='select_all_files']")
    public WebElement inputSelectAllFiles;

    @FindBy(xpath = "//*[@id='view-toggle']")
    public WebElement labelToggleGridView;

    @FindBy(xpath = "//*[@id='nextcloud']")
    public WebElement cealloIcon;

    @FindBy(xpath = "//*[@id='fileList']/tr/td/a/span[1]/span[1]")
    public List<WebElement> names;

    @FindBy(xpath = "//*[@id='fileList']/tr/td[3]")
    public List<WebElement> sizes;

    //*[@id='fileList']/tr/td/span
    @FindBy(xpath = "//*[@id='fileList']/tr/td[4]")
    public List<WebElement> mDates;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[4]/a")
    public WebElement linkMDate;



    
    

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
