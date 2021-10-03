package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage extends LoginPage{
    WebDriver driver;

    public OrdersPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="orderFilter")
    WebElement orderFilter;

    public WebElement getOrderFilter(){
        return orderFilter;
    }
    public By getByOrderFilter(){
        return By.id("orderFilter");
    }
}
