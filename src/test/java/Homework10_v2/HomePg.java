package Homework10_v2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePg {
    WebDriver driver;

    public HomePg(WebDriver driver) {

        this.driver = driver;
    }

    By userName = By.id("user-name");
    By password = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");
    By successfulLogin = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");

    public void LogInAction(String user, String pass) {
        driver.findElement(userName).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public void SucLogin() {
        Assert.assertNotNull(successfulLogin);
    }
}




