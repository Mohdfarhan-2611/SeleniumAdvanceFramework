package org.example.test.vwoLogin;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.base.CommonToAllTest;
import org.example.driver.DriverManager;
import org.example.pages.PageObjectModel.APPVWO.DashboardPage_POM;
import org.example.pages.PageObjectModel.APPVWO.LoginPage_POM;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM extends CommonToAllTest {

    @Owner("Farhan")
    @Description("Verify that invalid credentials give error")
    @Test
    public void testLoginNegativeVWO()
    {
        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
        String errormessage = loginPagePom.loginToVWOInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(errormessage).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(errormessage, PropertiesReader.readKey("error_message"));

    }


    @Owner("Farhan")
    @Description("Verify that valid credentials give error")
    @Test
    public void testLoginPositiveVWO()
    {
        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
        loginPagePom.loginToVWOValidCreds(PropertiesReader.readKey("validusername"),PropertiesReader.readKey("validpassword"));

        DashboardPage_POM dashboardPagePom = new DashboardPage_POM(DriverManager.getDriver());
        String expecteduser = dashboardPagePom.LoggedInuser();
        assertThat(expecteduser).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(expecteduser, PropertiesReader.readKey("expected_username"));




    }
}
