package Bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open detail product page")
    public void openDetailProductPage() {
        String bookName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .getBookName();
        Assertions.assertEquals("Effective Java", bookName, "The page of another book is opened");
    }

    @Test
    @DisplayName("Open your basket page")
    public void openYourBasketPage() {
        String pageName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
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
