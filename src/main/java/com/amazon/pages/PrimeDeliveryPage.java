package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PrimeDeliveryPage extends LoginPage{

    WebDriver driver;

    public PrimeDeliveryPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='s-refinements']/div[3]//i")
    WebElement primeChechBox;

    @FindBy(xpath="//div[@data-component-type='s-search-result'][4] //span[@class='a-text-bold']")
    WebElement deliveryDate;

    @FindBy(css="div[data-component-type='s-search-result']:nth-child(4) div[class*='top-micro']:nth-child(4) span[aria-label*='Delivery']")
    WebElement deliveryStatus;

    public WebElement getPrimeChechBox(){
        return primeChechBox;
    }
    public  WebElement getDeliveryDate(){
        return deliveryDate;
    }
    public WebElement getDeliveryStatus(){
        return deliveryStatus;
    }
    public By getByPrimeCheckBox(){
        return By.xpath("//div[@id='s-refinements']/div[3]//i");
    }
}
