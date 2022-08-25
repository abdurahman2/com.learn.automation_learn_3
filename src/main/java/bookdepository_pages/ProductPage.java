package bookdepository_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@itemprop='name']")
    WebElement bookName;

    @FindBy(xpath = "//span[@class='sale-price']")
    WebElement bookPrice;

    @FindBy(xpath = "//a[@class='btn btn-primary add-to-basket']")
    private WebElement addBookToBasketButton;

    public void moveToYourBasketPage() {
        addBookToBasketButton.click();
    }

    public YourBasketPage clickAddToBaskedButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(addBookToBasketButton));
        addBookToBasketButton.click();
        return new YourBasketPage(driver);
    }

    public String getBookName() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(bookName));
        return bookName.getText();
    }
}
