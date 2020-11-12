package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        loginPage.goToLoginPage();
    }

    @And("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.loginToZeroBank();
    }
    @When("user looks at the title of page")
    public void user_looks_at_the_title_of_page() {
        System.out.println("Current title of the page = " + loginPage.getTitle());
    }
    @Then("user should see {string} as title")
    public void user_should_see_as_title(String string) {
        Assert.assertTrue(loginPage.verifyTitle(string));
    }
}
