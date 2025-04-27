import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TEST {


public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
    //create chrome instance
    ChromeDriver driver = new ChromeDriver();
    //driver.get("http://www.facebook.com/");
    //WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
    //element.sendKeys("abc@gmail.com");
     //element = driver.findElement(By.xpath("//input[@name='pass']"));
    //element.sendKeys("abbaas");
    //WebElement button = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"));
    //button.click();

    driver.navigate().to("http://www.google.com/");
    driver.findElement(By.linkText("\u041F\u0440\u0438\u0435\u043C\u0430\u043D\u0435 \u043D\u0430 \u0432\u0441\u0438\u0447\u043A\u0438")).click();
    // Click on the search text box and send value
    driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");

    // Click on the search button
    driver.findElement(By.name("btnK")).click();
}
}
