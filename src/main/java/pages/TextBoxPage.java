package pages;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class TextBoxPage extends BasePage {

    private static final Logger logger = Logger.getLogger(TextBoxPage.class.getName());

    @FindBy(id = "userName")
    public WebElement username;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(css = "textarea#permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(css = "div>div.element-group:nth-of-type(1)")
    public WebElement elementGroup;

    @FindBy(css = "div>div.element-group:nth-of-type(1) ul>li:nth-of-type(1)")
    public WebElement textBoxButton;

    @FindBy(css = "div#output p")
    public WebElement output;

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTextBoxPanel() {
        wait.forElementToBeVisible(elementGroup);
        click(textBoxButton);
        wait.forElementToBeVisible(username);
    }

    public void fillForm(String fullName, String emailAddress, String currentLocation, String permanentLocation) {
        username.sendKeys(fullName);
        email.sendKeys(emailAddress);
        currentAddress.sendKeys(currentLocation);
        permanentAddress.sendKeys(permanentLocation);
        click(submitButton);
    }

}
