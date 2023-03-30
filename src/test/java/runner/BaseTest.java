package runner;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    protected void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://pager.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    protected void afterClass() {
        driver.quit();
    }




}
