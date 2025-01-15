package org.example.test.vwoLogin;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM {

    @Owner("Farhan")
    @Description("Verify that invalid credentials give error")
    @Test
    public void testLoginNegativeVWO()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");



        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String errormessage = loginPagePom.loginToVWOInvalidCreds("adb@gmail.com","123");



        assertThat(errormessage).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(errormessage,"Your email, password, IP address or location did not match");


        driver.quit();

    }
}
