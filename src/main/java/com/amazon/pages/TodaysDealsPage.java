package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDealsPage extends LoginPage{
    WebDriver driver;

    public TodaysDealsPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@id,'deals-shoveler')]/div[1]/span/a")
    WebElement deals;

    @FindBy(xpath = "//div[contains(@class,'ShovelerList')]/div[3] //a")
    WebElement thirdDeal;

    @FindBy(css="div[id='octopus-dlp-asin-stream'] > ul >li:nth-child(3) >span > div > div > a")
    WebElement subDeal;

    @FindBy(xpath="//select[@id='quantity']")
    WebElement dropdown;

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']/span[@class='a-dropdown-prompt']")
    WebElement quantity;

    @FindBy(id="add-to-cart-button")
    WebElement addCartBtn;

    @FindBy(id="nav-cart")
    WebElement cart;

    public WebElement getDeals(){
        return deals;
    }
    public WebElement getThirdDeal(){
        return thirdDeal;
    }
    public WebElement getSubDeal(){
        return subDeal;
    }
    public WebElement getDroppdown(){
        return dropdown;
    }
    public WebElement getQuantity(){
        return quantity;
    }
    public WebElement getAddCartBtn(){
        return addCartBtn;
    }
    public WebElement getCart(){
        return cart;
    }
    public By getByThirdDeal(){
        return By.xpath("//div[contains(@class,'ShovelerList')]/div[3] //a");
    }
    public By getByAddCartBtn(){
        return By.id("add-to-cart-button");
    }
    public By getByCart(){
        return By.id("nav-cart");
    }
}
