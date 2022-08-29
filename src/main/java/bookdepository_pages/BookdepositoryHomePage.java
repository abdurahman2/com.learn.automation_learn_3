package bookdepository_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookdepositoryHomePage {
    private static final String HOMEPAGE_URL = "https://www.bookdepository.com/";
    private final WebDriver driver;

    public BookdepositoryHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BookdepositoryHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    @FindBy(xpath = "//img[@alt='Bookdepository.com']")
    private WebElement logo;

    @FindBy(xpath = "//*[@class='icon-user']")
    private WebElement signInRegisterButton;

    @FindBy(xpath = "//*[@class='home-icon-link']")
    private WebElement icon;

    @FindBy(xpath = "//*[@name='searchTerm']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='page-links mobile-nav-content']")
    private WebElement navigationMenu;

    @FindBy(xpath = "//img[@alt='Image of Best Books of 2022 so far']")
    private WebElement banner;

    @FindBy(xpath = "//span[@class='text']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchButtonMob;

    public Boolean presentLogo() {
        return logo.isDisplayed();
    }

    public Boolean presentSignInRegister() {
        return signInRegisterButton.isDisplayed();
    }

    public Boolean presentIcon() {
        return icon.isDisplayed();
    }

    public Boolean presentSearchField() {
        return searchField.isDisplayed();
    }

    public Boolean presentNavigationMenu() {
        return navigationMenu.isDisplayed();
    }

    public Boolean presentBanner() {
        return banner.isDisplayed();
    }

    public Boolean presentSearchButton() {
        return searchButton.isDisplayed();
    }

    public SearchResultsPage searchBook(String name) {
        searchField.click();
        searchField.sendKeys(name);
        searchButton.click();
        return new SearchResultsPage(driver);
    }

    public String getLogoName() {
        openPage();
        return logo.getAccessibleName();
    }
}
