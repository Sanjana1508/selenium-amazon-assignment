package com.amazon.tests;

import com.amazon.pages.NavBar;
import com.amazon.pages.OrdersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrdersTest extends LoginTest{
    WebDriver driver;

    @Test
    public void orders(){
        OrdersTest ordersTest=new OrdersTest();
        driver=ordersTest.getDriver();
        WebDriverWait w=new WebDriverWait(driver,3);
        NavBar navBar=new NavBar(driver);
        navBar.getOrders().click();

        OrdersPage ordersPage=new OrdersPage(driver);
        w.until(ExpectedConditions.visibilityOfElementLocated(ordersPage.getByOrderFilter()));
        Select dropdown=new Select(ordersPage.getOrderFilter());
        dropdown.selectByValue("year-2020");

    }
}
