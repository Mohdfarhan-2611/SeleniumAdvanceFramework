package org.example.pages.PageObjectModel.APPVWO;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM extends CommonToAllPage {

    WebDriver driver;

    public DashboardPage_POM(WebDriver driver){
        this.driver= driver;
    }

    //Dashboard Locators
    private By Dashboardusername = By.xpath("//span[contains(text(),'MOHAMMAD FARHAN')]");



    //Dashboard Actions
    public String LoggedInuser()
    {
        presenceOfElement(Dashboardusername);
        return getElement(Dashboardusername).getText();


    }



}
