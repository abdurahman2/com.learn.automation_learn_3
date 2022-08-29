package allInOne;

import bookdepository_pages.BookdepositoryHomePage;
import bookdepository_pages.PaymentPage;
import bookdepository_pages.YourBasketPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Test with all checks")
    public void testAllSteps(){
        String total = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage("Effective Java")
                .clickAddToBaskedButton()
                .clickOnBasketCheckoutButtonOnPopUp()
                .getItemTotal();
                Assertions.assertEquals("34,98 €", total, "Price not correct");
        String subtotalFromBasketPage = new YourBasketPage(driver)
                .clickOnCheckoutButtonOnBaskedPage()
                .getSubTotal();
        Assertions.assertEquals("34,98 €", subtotalFromBasketPage, "Subtotal not correct on basket page");
        String deliveryFromBasketPage = new PaymentPage(driver)
                .getDelivery();
        Assertions.assertEquals("FREE", deliveryFromBasketPage, "Delivery not correct on basket page");
        String vatFromBasketPage = new PaymentPage(driver)
                .getVat();
        Assertions.assertEquals("0,00 €", vatFromBasketPage, "VAT not correct on basket page");
        String totalFromBasketPage = new PaymentPage(driver)
                .getTotal();
        Assertions.assertEquals("34,98 €", totalFromBasketPage, "Total not correct on basket page");
    }

    @AfterEach
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
