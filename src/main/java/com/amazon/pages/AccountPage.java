package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends LoginPage{
    WebDriver driver;

    public AccountPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@id='a-page']/div[2]/div/div[3]/div[2]/a")
    WebElement paymentOptions;

    @FindBy(xpath = "//div[@id='a-page']/div[2]/div/div[3]/div[1]/a")
    WebElement addresses;


    public WebElement getPaymentOptions(){
        return paymentOptions;
    }
    public  WebElement getAddresses(){
        return addresses;
    }
    public By getByAddresses(){
        return By.xpath("//div[@id='a-page']/div[2]/div/div[3]/div[1]/a");
    }
}
