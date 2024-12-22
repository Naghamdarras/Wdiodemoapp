package tests;

import base.BaseTest;
import pages.SignupPage;
import org.testng.annotations.Test;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SignupTest extends BaseTest {

    @Test
    public void testSignUp() throws Exception {
        setUp();

        Gson gson = new Gson();
        JsonObject testData = gson.fromJson(new String("src/main/resources/testData/data.json"), JsonObject.class);
        
        String email = testData.getAsJsonObject("signup").getAsJsonObject("validUser").get("email").getAsString();
        String password = testData.getAsJsonObject("signup").getAsJsonObject("validUser").get("password").getAsString();
        String confirmPassword = testData.getAsJsonObject("signup").getAsJsonObject("validUser").get("confirmPassword").getAsString();

        SignupPage signUpPage = new SignupPage(driver);
        signUpPage.signup(email, password, confirmPassword);

        // Add assertion for successful sign-up

        tearDown();
    }
}
