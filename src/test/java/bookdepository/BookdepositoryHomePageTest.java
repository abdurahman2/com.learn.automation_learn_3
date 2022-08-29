package bookdepository;

import bookdepository_pages.BookdepositoryHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BookdepositoryHomePageTest {

    private WebDriver driver;

    @BeforeEach
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Sign in register button is present")
    @RepeatedTest(2)
    void signInRegisterButtonIsVisible() {
        boolean signInRegisterButtonIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentSignInRegister();
        Assertions.assertTrue(signInRegisterButtonIsVisible, "The sign in register button is absent");
    }

    @Tag("training")
    @Test
    @DisplayName("The icon is visible")
    void iconIsVisible() {
        boolean iconIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentIcon();
        Assertions.assertTrue(iconIsVisible, "The icon is absent");
    }

    @Tag("work")
    @Test
    @DisplayName("Search field is visible")
    void searchFieldIsVisible() {
        boolean searchFieldIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentSearchField();
        Assertions.assertTrue(searchFieldIsVisible, "Search field is absent ");
    }

    @Test
    @DisplayName("Navigation menu is visible")
    void navigationMenuIsVisible() {
        boolean navigationMenuIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentNavigationMenu();
        Assertions.assertTrue(navigationMenuIsVisible, "Navigation menu is absent");
    }

    @Test
    @DisplayName("Banner is visible")
    void bannerIsVisible() {
        boolean bannerIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentBanner();
        Assertions.assertTrue(bannerIsVisible, "Banner is absent");
    }

    @Test
    @DisplayName("The search button is visible")
    void searchButtonIsVisible() {
        boolean searchButtonIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentSearchButton();
        Assertions.assertTrue(searchButtonIsVisible, "The search button is absent");
    }

    @Test
    @DisplayName("Search book")
    void searchBook() {
        int expectedSearchResultNumber = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .countGeneralSearchResult();
        Assertions.assertTrue(expectedSearchResultNumber > 0, "No books on search query");
    }

    @Test
    @DisplayName("Logo is displayed")
    void logoIsDisplayed() {
        Boolean logoIsDisplayed = new BookdepositoryHomePage(driver)
                .openPage()
                .presentLogo();
        Assertions.assertTrue(logoIsDisplayed, "Logo is not displayed");
    }

    @Test
    @DisplayName("Logo name - get data")
    void checkLogoName() {
        String logoName = new BookdepositoryHomePage(driver)
                .openPage()
                .getLogoName();
        Assertions.assertEquals("Bookdepository.com", logoName, "Logo name without data");
    }

    @AfterEach
    public void browserClose() {
        driver.quit();
        driver = null;
    }
}