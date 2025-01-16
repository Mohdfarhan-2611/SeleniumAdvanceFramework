package org.example.test.OrangeHRMTest;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.base.CommonToAllTest;
import org.example.driver.DriverManager;
import org.example.pages.PageObjectModel.OrangeHR.LoginPage_OHR_POM;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestOrangeHRMLogin extends CommonToAllTest {


    @Owner("Farhan")
    @Description("Verify that invalid credentials give error")
    @Test
    public void testLoginNegativeOrangeHRM()
    {
        LoginPage_OHR_POM loginPageOhrPom = new LoginPage_OHR_POM(DriverManager.getDriver());
        String error = loginPageOhrPom.LoginInvalidOrangeHRM(PropertiesReader.readKey("invalidorangeusername"), PropertiesReader.readKey("invalidorangepassword"));

        assertThat(error).isNotNull().isNotEmpty().isNotBlank();
        Assert.assertEquals(error, PropertiesReader.readKey("error_message_ohr"));
    }
}
