package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.PageObjectManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestContext {
    public WebDriver driver;
    public String productNameLandingPage;
    public PageObjectManager pageObjectManager;
    public WebDriverManager webDriverManager;

    private String browser;
    private String url;

    public TestContext() {
        try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            browser = prop.getProperty("browser");
            url = prop.getProperty("url");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver(browser, url);
        this.pageObjectManager = new PageObjectManager(driver);
    }

    public String getUrl() {
        return url;
    }
}
