package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {

    ChromeDriver driver = new ChromeDriver();

    @When("^site is opened \"([^\"]*)\"$")
    public void openURL (String URL) {
        driver.manage().window().maximize();
        openURL(URL);
    }

    @When("^field \"([^\"]*)\" type \"([^\"]*)\"$")
    public void input(String fieldName, String fieldValue) {
        String name;
        if(fieldName.equals("Login")) name = "uid";
        else name = "password";
        driver.findElement(By.name(name)).sendKeys(fieldName);
    }

    @When("^sand push the button \"([^\"]*)\"$")
    public void click (String btnName) {
        driver.findElement(By.name(btnName)).click();
    }
    @When("^site address \"([^\"]*)\"$")
    public void checkUrl (String url) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,url);
    }
}
