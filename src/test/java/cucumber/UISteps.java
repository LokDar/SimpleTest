package cucumber;

import io.cucumber.java.en.When;
import model.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.BaseModel;

import javax.security.auth.login.Configuration;
import java.sql.Driver;

public class UISteps {

    private HomePage button;
    private HomePage checkText;

    @When("push button learn more")
    public void pushButton(){button.clickLearnMoreButton();
    }

    @When("^see text \"Built for care collaboration\"$")
    public void checkText(){checkText.checkText();
    }




}
