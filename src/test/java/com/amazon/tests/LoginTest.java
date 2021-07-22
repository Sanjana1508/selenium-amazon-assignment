package com.amazon.tests;

import com.amazon.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;

    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        LoginPage loginPage=new LoginPage(driver);
        driver.manage().window().maximize();
        loginPage.signIn().click();
        loginPage.email().sendKeys("<email-address>");
        loginPage.continueBtn().click();
        loginPage.password().sendKeys("<password>");
        loginPage.submit().click();


    }
    public WebDriver getDriver(){
        System.out.println(driver);
        return driver;
    }

}
