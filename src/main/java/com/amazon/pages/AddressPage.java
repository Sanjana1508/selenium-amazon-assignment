package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends LoginPage{
    WebDriver driver;

    public AddressPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="ya-myab-address-add-link")
    WebElement addAddress;

    @FindBy(css="div[id=ya-myab-display-address-block-1] h5[id='address-ui-widgets-FullName']")
    WebElement fullName;

    @FindBy(css="div[id=ya-myab-display-address-block-1] span[id='address-ui-widgets-AddressLineOne']")
    WebElement addressLine1;

    @FindBy(css="div[id=ya-myab-display-address-block-1] span[id='address-ui-widgets-AddressLineTwo']")
    WebElement addressLineTwo;

    @FindBy(css="div[id=ya-myab-display-address-block-1] span[id='address-ui-widgets-CityStatePostalCode']")
    WebElement cityStatePostalCode;

    @FindBy(css="div[id=ya-myab-display-address-block-1] span[id='address-ui-widgets-Country']")
    WebElement country;

    @FindBy(css="div[id=ya-myab-display-address-block-1] span[id='address-ui-widgets-PhoneNumber']")
    WebElement phoneNumber;

    public WebElement getAddAddress(){
        return addAddress;
    }
    public WebElement getFullName(){
        return fullName;
    }
    public WebElement getAddressLine1(){
        return  addressLine1;
    }
    public  WebElement getAddressLineTwo(){
        return addressLineTwo;
    }
    public WebElement getCityStatePostalCode(){
        return cityStatePostalCode;
    }
    public WebElement getCountry(){
        return  country;
    }
    public  WebElement getPhoneNumber(){
        return phoneNumber;
    }
}
