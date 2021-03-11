import commons.TestBase;
import org.junit.jupiter.api.*;
import pages.HomePage;
import pages.TextBoxPage;

import static commons.Configuration.url;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TextBoxTest extends TestBase {

    @BeforeEach
    public void openPage() {
        driver.get(url.asString());
    }

    @Test
    public void registerUser() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        TextBoxPage textBoxPage = new TextBoxPage(driver);

        homePage.clickOnTile(1);
        textBoxPage.clickOnTextBoxPanel();
        textBoxPage.fillForm("Roshan Kumar Singh", "abc@gmail.com",
                "varanasi", "varanasi");

        Assertions.assertTrue(textBoxPage.output.isDisplayed());
    }

}
