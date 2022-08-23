package Bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouBasketPageTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open payment page")
    public void openPaymentPage() {
        String pageName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .openYourBasketPage()
                .openYourBasketPage2()
                .goToPaymentPage()
                .getPageName();
        Assertions.assertEquals("Payment details", pageName);
    }

    @AfterEach
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
