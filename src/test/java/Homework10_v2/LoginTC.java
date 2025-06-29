package Homework10_v2;

import Homework10.HomePage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC {
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
        HomePg homePage = new HomePg(driver);
        homePage.LogInAction("standard_user", "secret_sauce");
        homePage.SucLogin();
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }
}
