package me.mysupercompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends ConciseAPI {
    static WebDriver driver;

    public  WebDriver getWebDriver() {
        return driver;
    }

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
