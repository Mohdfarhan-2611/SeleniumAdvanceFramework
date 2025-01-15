package org.example.pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {

    WebDriver driver;

    public LoginPage_POM(WebDriver driver)
    {
          this.driver = driver;
    }


    //Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");



    //Page Actions

    public String loginToVWOInvalidCreds(String user, String pass)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signButton).click();

        try {
            Thread.sleep(3000);}
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       String error_message_text = driver.findElement(error_message).getText();
        return  error_message_text;
    }


    public void loginToVWOValidCreds(String user, String pass)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(signButton).click();
    }



}
