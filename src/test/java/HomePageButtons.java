import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class HomePageButtons extends BaseTest {

    @Test
    public void clickButton() {
        String actualResult = new HomePage(getDriver())
                .clickLearnMoreButton()
                .checkText();

        Assert.assertEquals(actualResult,"Built for care collaboration");
    }
}
