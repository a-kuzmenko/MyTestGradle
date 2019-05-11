package New;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test(description = "My first test")
    public void testName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        System.out.println("-------test1-------");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");
        Assert.assertEquals("https://mvnrepository.com/", driver.getCurrentUrl());

        Thread.sleep(5000);
        driver.quit();
    }
}
