package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage extends LoginPage{
    WebDriver driver;

    public AddAddressPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="address-ui-widgets-enterAddressFullName")
    WebElement fullName;

    @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
    WebElement phoneNumber;

    @FindBy(id="address-ui-widgets-enterAddressPostalCode")
    WebElement postalCode;

    @FindBy(id="address-ui-widgets-enterAddressLine1")
    WebElement addressLine1;

    @FindBy(id="address-ui-widgets-enterAddressLine2")
    WebElement addressLine2;

    @FindBy(id="address-ui-widgets-landmark")
    WebElement landmark;

    @FindBy(name="address-ui-widgets-addr-details-address-type-and-business-hours")
    WebElement addressType;

    @FindBy(css="span[id*='form-submit-button'] input")
    WebElement submitBtn;

    public WebElement getFullName(){
        return fullName;
    }

    public  WebElement getPhoneNumber(){
        return phoneNumber;
    }

    public WebElement getPostalCode(){
        return postalCode;
    }
    public WebElement getAddressLine1(){
        return addressLine1;
    }
    public WebElement getAddressLine2(){
        return  addressLine2;
    }
    public WebElement getLandmark(){
        return landmark;
    }
    public WebElement getAddressType(){
        return addressType;
    }
    public  WebElement getSubmitBtn(){
        return submitBtn;
    }
}
