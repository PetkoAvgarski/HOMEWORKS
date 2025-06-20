package Homework10;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    WebElement successfulLogin;

    public void LogInAction(String user, String pass) {
        userName.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
    public void SucLogin(){
        Assert.assertNotNull(successfulLogin);
    }

}
