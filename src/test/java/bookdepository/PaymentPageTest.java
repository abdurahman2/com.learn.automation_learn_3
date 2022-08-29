package bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import bookdepository_pages.PaymentPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentPageTest {
    private WebDriver driver;
    private static final String SUBTOTAL = "34,98 €";
    private static final String DELIVERY = "FREE";
    private static final String VAT = "0,00 €";
    private static final String TOTAL = "34,98 €";

    @BeforeEach
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    @DisplayName("Move on the payment page")
    private PaymentPage moveToThePaymentPage() {
        return new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPageFromList()
                .clickAddToBaskedButton()
                .clickOnBasketCheckoutButtonOnPopUp()
                .clickOnCheckoutButtonOnBaskedPage();
    }

    @Test
    @DisplayName("Check subtotal")
    public void checkDataFromPaymentPage() {
        PaymentPage paymentPage = moveToThePaymentPage();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(paymentPage.getSubTotal()).as("Subtotal is not equal in softAssertions")
                .isEqualTo("32,15 €");
        softAssertions.assertThat(paymentPage.getDelivery()).as("Delivery is not equal in softAssertions")
                .isEqualTo("FREE");
        softAssertions.assertThat(paymentPage.getVat()).as("VAT is not equal in softAssertions")
                .isEqualTo("0,00 €");
        softAssertions.assertThat(paymentPage.getTotal()).as("Total is not equal in softAssertions")
                .isEqualTo("32,15 €");
        softAssertions.assertAll();

        softAssertions.assertThat(paymentPage.getSubTotal()).isEqualTo(SUBTOTAL);
        softAssertions.assertThat(paymentPage.getDelivery()).isEqualTo(DELIVERY);
        softAssertions.assertThat(paymentPage.getVat()).isEqualTo(VAT);
        softAssertions.assertThat(paymentPage.getTotal()).isEqualTo(DELIVERY);
    }

    @Test
    @DisplayName("Check subtotal")
    public void checkSubtotal(){
        PaymentPage paymentPage = moveToThePaymentPage();
        Assertions.assertEquals(paymentPage.getSubTotal(), SUBTOTAL, "Subtotal is not equal");
    }

    @Test
    @DisplayName("Check delivery")
    public void checkDeliveryPrice() {
        PaymentPage paymentPage = moveToThePaymentPage();
        Assertions.assertEquals(paymentPage.getDelivery(), DELIVERY, "Delivery is not equal");
    }

    @Test
    @DisplayName("Check VAT")
    public void checkVAT() {
        PaymentPage paymentPage = moveToThePaymentPage();
        Assertions.assertEquals(paymentPage.getVat(), VAT, "VAT is not equal");
    }

    @Test
    @DisplayName("Check total")
    public void checkTotalPrice() {
        PaymentPage paymentPage = moveToThePaymentPage();
        Assertions.assertEquals(paymentPage.getTotal(), TOTAL, "Total is not equal");
    }

    @AfterEach
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
