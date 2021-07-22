package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobilesPage extends LoginPage {
    WebDriver driver;

    public MobilesPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@data-component-type='s-search-result']")
    List<WebElement> mobiles;

    public WebElement getLastMobile(){
        String size=String.valueOf(mobiles.size()-1);
        return driver.findElement(By.cssSelector("div[data-component-type='s-search-result']:nth-child("+size+") h2"));
    }
}
