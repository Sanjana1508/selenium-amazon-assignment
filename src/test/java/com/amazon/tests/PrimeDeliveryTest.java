package com.amazon.tests;

import com.amazon.pages.NavBar;
import com.amazon.pages.PrimeDeliveryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PrimeDeliveryTest extends LoginTest{
    WebDriver driver;

    @Test
    public void getDeliveryDetails() throws InterruptedException {
        PrimeDeliveryTest primeDeliveryTest=new PrimeDeliveryTest();
        driver=primeDeliveryTest.getDriver();
        PrimeDeliveryPage primeDeliveryPage=new PrimeDeliveryPage(driver);
        WebDriverWait w=new WebDriverWait(driver,3);
        NavBar navBar=new NavBar(driver);
        navBar.getMobileTab().click();
        w.until(ExpectedConditions.visibilityOfElementLocated(primeDeliveryPage.getByPrimeCheckBox()));
        primeDeliveryPage.getPrimeChechBox().click();
        WebElement deliveryDate=primeDeliveryPage.getDeliveryDate();
        System.out.println(deliveryDate.getText());
        WebElement deliveryStatus= primeDeliveryPage.getDeliveryStatus();
        System.out.println(deliveryStatus.getText());

    }
}
