package bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open your basket page")
    public void openYourBasketPage() {
        String pageName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPageFromList()
                .clickAddToBaskedButton()
                .clickOnBasketCheckoutButtonOnPopUp()
                .getTitlePage();
        Assertions.assertEquals("Your basket", pageName, "The basket page is not open");
    }

    @AfterEach
    public void browserClose() {
        driver.quit();
        driver = null;
    }
}
