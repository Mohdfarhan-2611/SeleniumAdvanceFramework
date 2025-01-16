package org.example.pages.PageObjectModel.OrangeHR;

import org.example.base.CommonToAllPage;
import org.example.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_OHR_POM extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_OHR_POM(WebDriver driver){
        this.driver = driver;
    }

    //locators
    private By o_hr_username = By.xpath("//input[@name='username']");
    private By o_hr_password = By.xpath("//input[@name='password']");
    private By login_button = By.xpath("//button[@type='submit']");
    private By o_hr_error_message = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']//p");

    //Actions
    public String LoginInvalidOrangeHRM(String user, String pwd){

        driver.get(PropertiesReader.readKey("orangehrm_url"));
        presenceOfElement(o_hr_username);
        sendKeys(o_hr_username,user);
        presenceOfElement(o_hr_password);
        sendKeys(o_hr_password,pwd);
        presenceOfElement(login_button);
        clickElement(login_button);

        presenceOfElement(o_hr_error_message);

        String error_message_text = driver.findElement(o_hr_error_message).getText();
        return  error_message_text;

    }





}
