package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    private WebElement usernameInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signBtn;

    @FindBy(partialLinkText = "Zero Bank")
    private WebElement linkText;

    @FindBy(id = "signin_button")
    private WebElement signingButton;

    public void pressSignInButton(){
        signingButton.click();
    }

    public void clickTo(String id){
        WebElement button = Driver.getDriver().findElement(By.id(id));
        System.out.println("I am clicking to = " + button.getText()+" button now");
        button.click();
    }

    public String getHreFAttribute(){
        return linkText.getAttribute("href");
    }

    public String getUrl(){
        return Driver.getDriver().getCurrentUrl();
    }

    public void goToLoginPage(){
        String website = ConfigurationReader.getProperty("website");

        Driver.getDriver().get(website);

    }

    public void loginToZeroBank(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        goToLoginPage();
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            signBtn.click();




    }

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    public boolean verifyTitle(String expectedTitle){
        return getTitle().equals(expectedTitle);
    }

    public String getLinkText(){
        return linkText.getText();
    }
}
