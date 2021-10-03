package com.amazon.tests;

import com.amazon.pages.AccountPage;
import com.amazon.pages.AddAddressPage;
import com.amazon.pages.AddressPage;
import com.amazon.pages.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTest extends LoginTest{
    WebDriver driver;
    NavBar navBar;
    AccountPage accountPage;
    AddressPage addressPage;
    AddAddressPage addAddressPage;
    AddressTest addressTest;

    @Test
    public void addAddress() throws InterruptedException {
        addressTest=new AddressTest();
        driver=addressTest.getDriver();

        navBar =new NavBar(driver);
        WebDriverWait w=new WebDriverWait(driver,3);
        navBar.getAccount().click();

        accountPage=new AccountPage(driver);
        w.until(ExpectedConditions.visibilityOfElementLocated(accountPage.getByAddresses()));
        accountPage.getAddresses().click();

        addressPage=new AddressPage(driver);
        addressPage.getAddAddress().click();

        addAddressPage=new AddAddressPage(driver);
        addAddressPage.getFullName().sendKeys("sanjana");
        addAddressPage.getPhoneNumber().sendKeys("9876543210");
        addAddressPage.getPostalCode().sendKeys("500029");
        addAddressPage.getAddressLine1().sendKeys("123/B");
        addAddressPage.getAddressLine2().sendKeys("Narayanaguda");
        addAddressPage.getLandmark().sendKeys("Near Apollo Hospitals");
        Select dropdown=new Select(addAddressPage.getAddressType());
        dropdown.selectByValue("OTH");
        addAddressPage.getSubmitBtn().click();
    }

    @Test(dependsOnMethods = {"addAddress"})
    public void addressVerify(){
        addressTest=new AddressTest();
        driver=addressTest.getDriver();
        addressPage=new AddressPage(driver);
        Assert.assertEquals(addressPage.getFullName().getText(),"sanjana");
        Assert.assertEquals(addressPage.getAddressLine1().getText(),"123/B");
        Assert.assertEquals(addressPage.getAddressLineTwo().getText(),"Narayanaguda");
        Assert.assertEquals(addressPage.getCityStatePostalCode().getText(),"HYDERABAD, TELANGANA 500029");
        Assert.assertEquals(addressPage.getCountry().getText(),"India");
        Assert.assertEquals(addressPage.getPhoneNumber().getText(),"Phone number: \u202A9876543210\u202C");
    }
}
