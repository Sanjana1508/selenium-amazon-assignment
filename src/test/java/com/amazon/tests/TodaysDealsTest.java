package com.amazon.tests;

import com.amazon.pages.TodaysDealsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodaysDealsTest extends  LoginTest{
    WebDriver driver;
    String expected="2";
    String actual;

    @Test
    public void getDeal() throws InterruptedException {
        TodaysDealsTest todaysDealsTest=new TodaysDealsTest();
        driver=todaysDealsTest.getDriver();
        TodaysDealsPage todaysDealsPage=new TodaysDealsPage(driver);
        WebDriverWait w=new WebDriverWait(driver,3);
        todaysDealsPage.getDeals().click();
        w.until(ExpectedConditions.visibilityOfElementLocated(todaysDealsPage.getByThirdDeal()));
        todaysDealsPage.getThirdDeal().click();
        todaysDealsPage.getSubDeal().click();
        Select dropdown=new Select(todaysDealsPage.getDroppdown());
        dropdown.selectByValue("2");
        todaysDealsPage.getAddCartBtn().click();
        todaysDealsPage.getCart().click();
        actual=todaysDealsPage.getQuantity().getText();
        Assert.assertEquals(actual,expected);
    }
}
