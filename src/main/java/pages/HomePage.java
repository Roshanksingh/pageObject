package pages;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Logger;

public class HomePage extends BasePage {

    private static final Logger logger = Logger.getLogger(HomePage.class.getName());

    @FindBy(css = "div.card-body")
    public List<WebElement> tileList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTile(int index) throws InterruptedException {
        wait.forPage();
        js.scrollDown();
        wait.forElementToBeClickable(tileList.get(index - 1));
        click(tileList.get(index - 1));
    }
}
