package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    private final WebDriver driver;
    private final By search = By.xpath("//input[@type='search']");
    private final By productName = By.cssSelector("tr td:nth-child(1)");

    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToOffersPage(String url) {
        driver.get(url);
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
}
