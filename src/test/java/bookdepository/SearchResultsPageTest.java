package bookdepository;

import bookdepository_pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultsPageTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open the page of the necessary book")
    public void productPageIsOpened() {
        String bookTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage("Effective Java")
                .getBookName();
        System.out.println(bookTitle);
        Assertions.assertEquals("Effective Java", bookTitle,
                "The necessary page of the book is not open");
    }

    @Tag("draft")
    @Test
    @DisplayName("Open the page of the necessary book from list")
    public void productPageIsOpenedFromList() {
        String bookName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPageFromList()
                .getBookName();
        Assertions.assertEquals("Effective Java", bookName,
                "The necessary page of the book is not open from list");
    }

    @Tag("draft")
    @Test
    @DisplayName("Book is added to the basket")
    public void bookIsAddedToTheBasket() {
        String modalWindowTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .addBookEffectiveJavaToBasket()
                .getModalTitle();
        Assertions.assertEquals("Item added to your basket", modalWindowTitle, "The book is not added to your basket");
    }

    @AfterEach
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
