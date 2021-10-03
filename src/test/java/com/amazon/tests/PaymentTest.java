package com.amazon.tests;

import com.amazon.pages.AccountPage;
import com.amazon.pages.NavBar;
import com.amazon.pages.PaymentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PaymentTest extends LoginTest{
    WebDriver driver;

    @Test
    public void paymentDetails() {
        PaymentTest paymentTest=new PaymentTest();
        driver=paymentTest.getDriver();
        NavBar navBar=new NavBar(driver);
        navBar.getAccount().click();

        AccountPage accountPage=new AccountPage(driver);
        accountPage.getPaymentOptions().click();

        PaymentPage paymentPage=new PaymentPage(driver);

        paymentPage.getCardExpand().click();
        Assert.assertEquals(paymentPage.getEndingNumber().getText(),"ending in <last-digits>");
        Assert.assertEquals(paymentPage.getExpiryDate().getText(),"<expiry-date>");
        Assert.assertEquals(paymentPage.getNameOnCard().getText(),"Name on card\n<name>>");


    }
}
