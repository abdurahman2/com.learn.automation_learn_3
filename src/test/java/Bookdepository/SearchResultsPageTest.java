package Bookdepository;

import bookdepository_pages.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultsPageTest {
    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open the page of the necessary book")
    public void productPageIsOpened() {
        String bookTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .getBookName();
        System.out.println(bookTitle);
        Assertions.assertEquals("Effective Java", bookTitle,
                "The necessary page of the book is not open");
    }

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
