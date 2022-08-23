package Bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import bookdepository_pages.PaymentPage;
import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentPageTest {
    private WebDriver driver;
    private static final String SUBTOTAL = "31,91 €";
    private static final String DELIVERY = "FREE";
    private static final String VAT = "00,00 €";
    private static final String TOTAL = "31,91 €";

    @BeforeEach
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    @DisplayName("Move on the payment page")
    private PaymentPage moveToThePaymentPage() {
        return new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .openYourBasketPage()
                .openYourBasketPage2()
                .goToPaymentPage();
    }

    @Test
    @DisplayName("Check mandatory data")
    public void checkDataFromPaymentPage() {
        PaymentPage paymentPage = moveToThePaymentPage();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(paymentPage.getSubTotal()).isEqualTo("54.12 €");
        Assertions.assertEquals(paymentPage.getSubTotal(), SUBTOTAL);


        softAssertions.assertThat(paymentPage.getSubTotal()).isEqualTo(SUBTOTAL);
        softAssertions.assertThat(paymentPage.getDelivery()).isEqualTo(DELIVERY);
        softAssertions.assertThat(paymentPage.getVat()).isEqualTo(VAT);
        softAssertions.assertThat(paymentPage.getTotal()).isEqualTo(DELIVERY);

        System.out.println(paymentPage.getSubTotal());
        System.out.println(paymentPage.getDelivery());
        System.out.println(paymentPage.getVat());
        System.out.println(paymentPage.getTotal());
    }

    @AfterEach
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
