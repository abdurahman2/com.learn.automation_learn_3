package bookdepository_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {
    private final WebDriver driver;
    private String targetBook = "Effective Java";

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-isbn='9780134685991']")
    private WebElement addToBasketButtonEffectiveJava;

    @FindBy(xpath = " descendant-or-self::*[contains(@content,'java')]")
    private List<WebElement> generalSearchResult;

    @FindBy(xpath = "//img[@alt='Effective Java']")
    private WebElement goToBookDetailPage;

    @FindBy(xpath = "//span[@data-item-count]")
    private WebElement itemCountInBasket;

    @FindBy(xpath = "//div[@class='modal-header']//h3")
    private WebElement modalWindowTitle;

    @FindBy(xpath = "//h1")
    private WebElement bookName;

    @FindBy(xpath = "//div[@class='item-img']")
    private WebElement booksImages;

    @FindBy(xpath = "//h3[@class='title']")
    private WebElement allBookFromSerchResult;

    public int countGeneralSearchResult() {
        return generalSearchResult.size();
    }

    public ProductPage navigateToBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(addToBasketButtonEffectiveJava));
        addToBasketButtonEffectiveJava.click();
        return new ProductPage(driver);
    }

    public ProductPage openDetailBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(goToBookDetailPage));
        goToBookDetailPage.click();
        return new ProductPage(driver);
    }

    public ProductPage openDetailBookPageFromList() {
        List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='title']"));
        System.out.println("нашли елементов - " + elements.size());
        for (WebElement name : elements) {
            if (name.getText().equals(targetBook)) {
                name.click();
            }
            WebElement element = driver.findElement(By.xpath("//h1[@itemprop='name']"));
            String text = element.getText();
            System.out.println("My text " +text);
        }
        return new ProductPage(driver);
    }

    public SearchResultsPage addBookEffectiveJavaToBasket() {
        new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .addToBasketButtonEffectiveJava.click();
        return this;
    }

    public String getModalTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalWindowTitle));
        return modalWindowTitle.getText();
    }
}
