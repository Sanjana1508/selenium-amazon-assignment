package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends LoginPage{
    WebDriver driver;

    public MenuPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@id='hmenu-content']/ul/li[15]/a")
    WebElement mobileItem;

    @FindBy(linkText="All Mobile Phones")
    WebElement allMobilesItem;

    public WebElement getMobileItem(){
        return mobileItem;
    }

    public WebElement getAllMobilesItems(){
        return allMobilesItem;
    }

    public By getByAllMobileItems(){
        return By.linkText("All Mobile Phones");
    }
}
