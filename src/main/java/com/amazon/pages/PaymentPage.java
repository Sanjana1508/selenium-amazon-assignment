package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends LoginPage{

    WebDriver driver;

    public PaymentPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="span[id*='pp'] > span>input")
    WebElement addPaymentBtn;

    @FindBy(xpath = "//*[@id='cpefront-mpo-widget']/div/form/div/div/div[2]/div[2]/div/a")
    WebElement cardExpand;

    @FindBy(xpath = "//*[@id='cpefront-mpo-widget']/div/form/div/div/div[2]/div[2]/div/a/span/div/div/div[2]/div/div/div[1]/span[2]/span[2]")
    WebElement endingNumber;

    @FindBy(xpath ="//*[@id='cpefront-mpo-widget']/div/form/div/div/div[2]/div[2]/div/a/span/div/div/div[2]/div/div/div[2]/div/span")
    WebElement expiryDate;

    @FindBy(xpath = "//*[@id='cpefront-mpo-widget']/div/form/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div")
    WebElement nameOnCard;

    public WebElement getAddPaymentBtn(){
        return addPaymentBtn;
    }
    public WebElement getCardExpand(){
        return cardExpand;
    }
    public WebElement getEndingNumber(){
        return endingNumber;
    }

    public WebElement getExpiryDate(){
        return  expiryDate;
    }
    public WebElement getNameOnCard(){
        return nameOnCard;
    }
}
