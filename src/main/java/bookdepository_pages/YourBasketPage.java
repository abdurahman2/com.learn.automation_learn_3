package bookdepository_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourBasketPage {
    private final WebDriver driver;

    public YourBasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    private WebElement pageName;

    @FindBy(xpath = "//*[@data-isbn='9780321356680']")
    private WebElement addBookToBasketButton;

    @FindBy(xpath = "//*[@data-default-localized-pattern='Basket / Checkout']")
    private WebElement basketCheckoutOnPopUpBasket;

    @FindBy(xpath = "//*[@class='checkout-btn btn original-bucket']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@class='item-total']")
    private WebElement itemTotal;

    public String pageName() {
        return pageName.getText();
    }

    public String getTitlePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(pageName));
        return pageName.getText();
    }

    public YourBasketPage clickOnBasketCheckoutButtonOnPopUp() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(basketCheckoutOnPopUpBasket));
        basketCheckoutOnPopUpBasket.click();
        return new YourBasketPage(driver);
    }

    public PaymentPage clickOnCheckoutButtonOnBaskedPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();
        return new PaymentPage(driver);
    }

    public String getItemTotal(){
        return itemTotal.getText();
    }
}
