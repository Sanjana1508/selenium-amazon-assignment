package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar extends LoginPage{
    WebDriver driver;

    public NavBar(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="nav-hamburger-menu")
    WebElement menu;

    @FindBy(id="nav-logo-sprites")
    WebElement home;

    @FindBy(id="nav-orders")
    WebElement orders;

    @FindBy(xpath = "//div[@id='nav-tools']/a[2]")
    WebElement account;

    @FindBy(id="twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id="nav-search-submit-button")
    WebElement searchBtn;

    @FindBy(css="a[data-csa-c-content-id*='mobiles']")
    WebElement mobileTab;

    public WebElement getMenu(){
        return menu;
    }

    public WebElement getHome(){
        return home;
    }
    public WebElement getOrders(){
        return orders;
    }
    public WebElement getAccount(){
        return  account;
    }
    public WebElement getSearchBox(){
        return searchBox;
    }
    public WebElement getSearchBtn(){
        return  searchBtn;
    }
    public WebElement getMobileTab(){
        return  mobileTab;
    }
}
