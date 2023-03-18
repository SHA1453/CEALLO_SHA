package com.ceallo.pages;

import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id='user']")
    public WebElement inputUsername;

    @FindBy(css = "input[id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='submit-form']")
    public WebElement loginButton;




    public LoginPage(){
       
        PageFactory.initElements(Driver.getDriver(),this);
        
    }

}
