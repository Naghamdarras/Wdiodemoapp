package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws Exception {
        setUp();

        Gson gson = new Gson();
        JsonObject testData = gson.fromJson(new String("src/main/resources/testData/data.json"), JsonObject.class);

        String username = testData.getAsJsonObject("login").getAsJsonObject("validCredentials").get("username").getAsString();
        String password = testData.getAsJsonObject("login").getAsJsonObject("validCredentials").get("password").getAsString();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Add assertion for successful login

        tearDown();
    }
}
