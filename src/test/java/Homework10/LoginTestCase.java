package Homework10;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginTestCase {
    public static ChromeDriver driver;


    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void loginPage() {
        HomePage homePg = new HomePage(driver);
        //HomePage homePg = PageFactory.initElements(driver, HomePage.class);
        homePg.LogInAction("standard_user", "secret_sauce");
        homePg.SucLogin();
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }
}