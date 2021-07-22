package com.amazon.tests;

import com.amazon.pages.MenuPage;
import com.amazon.pages.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigationTest extends LoginTest{
    WebDriver driver;

    @Test
    public void navigation() throws InterruptedException {
        NavigationTest navigationTest=new NavigationTest();
        driver=navigationTest.getDriver();
        NavBar navBar=new NavBar(driver);
        WebDriverWait w=new WebDriverWait(driver,3);

        navBar.getMenu().click();

        MenuPage menuPage=new MenuPage(driver);
        menuPage.getMobileItem().click();

        w.until(ExpectedConditions.visibilityOfElementLocated(menuPage.getByAllMobileItems()));
        menuPage.getAllMobilesItems().click();

        navBar.getHome().click();
    }
}
