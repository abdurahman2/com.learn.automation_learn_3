package bookdepository_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    private final WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//strong[text()='Sub-total']/../following-sibling::dd")
    WebElement subTotal;

    @FindBy(xpath = "//strong[text()='Total']/../following-sibling::dd")
    WebElement total;

    @FindBy(xpath = "//strong[normalize-space()='FREE']")
    WebElement delivery;

    @FindBy(xpath = "//dd[@class='text-right total-tax']")
    WebElement vat;

    @FindBy(xpath = "//*[@class='complete']")
    WebElement complete;

    public String getPageName() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(complete));
        return complete.getText();
    }

    public String getSubTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(subTotal));
        return subTotal.getText();
    }

    public String getDelivery() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(delivery));
        return delivery.getText();
    }

    public String getVat() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(vat));
        return vat.getText();
    }

    public String getTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(total));
        return total.getText();
    }
}
