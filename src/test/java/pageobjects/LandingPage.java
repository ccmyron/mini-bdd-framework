package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLandingPage(String url) {
        driver.get(url);
    }

    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getProductName() {
        return driver.findElement(productName)
                .getText()
                .split("-")[0]
                .trim();
    }

    public String getTitleLandingPage() {
        return driver.getTitle();
    }
}
