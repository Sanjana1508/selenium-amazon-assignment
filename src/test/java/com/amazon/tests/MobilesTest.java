package com.amazon.tests;

import com.amazon.pages.MobilesPage;
import com.amazon.pages.NavBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class MobilesTest extends LoginTest{
    WebDriver driver;

    @Test
    public void getLastMobile(){
        MobilesTest mobilesTest=new MobilesTest();
        driver=mobilesTest.getDriver();
        MobilesPage mobilesPage=new MobilesPage(driver);

        NavBar navBar=new NavBar(driver);
        navBar.getSearchBox().sendKeys("mobiles");
        navBar.getSearchBtn().click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,5000)");
        String mobileInfo=mobilesPage.getLastMobile().getText();
        System.out.println(mobileInfo);
    }
}
