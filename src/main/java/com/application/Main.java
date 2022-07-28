package com.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\chris\\IdeaProjects\\CucumberTraining\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.linkText("Top Deals")).click();

    }
}
