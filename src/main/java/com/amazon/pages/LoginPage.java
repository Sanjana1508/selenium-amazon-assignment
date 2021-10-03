package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="nav-link-accountList")
    WebElement signIn;

    @FindBy(id="ap_email")
    WebElement email;

    @FindBy(id="continue")
    WebElement continueBtn;

    @FindBy(name="password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement submit;

    public WebElement signIn(){
        return signIn;
    }

    public WebElement email(){
        return email;
    }

    public WebElement continueBtn(){
        return continueBtn;
    }

    public WebElement password(){
        return password;
    }

    public WebElement submit(){
        return submit;
    }

}
