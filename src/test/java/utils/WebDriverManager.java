package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    public WebDriver driver;

    public WebDriver getDriver(String browser, String url) {
        if (driver == null) {
            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\chris\\IdeaProjects\\CucumberTraining" +
                            "\\src\\test\\resources\\drivers\\chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless",
                            "--disable-gpu",
                            "--window-size=1920,1080",
                            "--ignore-certificate-errors",
                            "--disable-extensions",
                            "--no-sandbox",
                            "--disable-dev-shm-usage");
                    driver = new ChromeDriver(options);
            }
        }

        return driver;
    }
}
