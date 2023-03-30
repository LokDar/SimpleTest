package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.BaseModel;

public class HomePage extends BaseModel {

    @FindBy (xpath = "//div[contains(text(),'Learn more ')]")
    private WebElement learnMoreButton;

    @FindBy(xpath = "//*[@id=\"block-yui_3_17_2_1_1611089974884_4958\"]/div/div/div/h1")
    private WebElement text;

    public HomePage(WebDriver driver) {super(driver);}

    public HomePage clickLearnMoreButton() {
        learnMoreButton.click();
        return new HomePage(getDriver());
    }

    public String checkText() {
        return text.getText();
    }

}
