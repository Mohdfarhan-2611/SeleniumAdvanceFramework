package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public CommonToAllPage()
    {
      //If you want to call something before every page Object Class call,
        // put your code here

        //Open file, Open Data base connection You can write code here
    }


    public void clickElement(By by)
    {
        getDriver().findElement(by).click();
    }

    public void sendKeys(By by, String key)
    {
        getDriver().findElement(by).sendKeys(key);
    }

    public void getText(By by)
    {
        getDriver().findElement(by).getText();
    }


    public WebElement presenceOfElement(By elementlocation)
    {
       return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementlocation));

    }

    public WebElement visibleOfElement(By elementlocation)
    {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementlocation));
    }

    public WebElement getElement(By key)
    {
        return getDriver().findElement(key);
    }






}
