package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class App {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/");

        Thread.sleep(4000); // wait for page load

        // Locate first "Add to cart" button
        WebElement addToCart = driver.findElement(By.xpath("(//a[contains(@class,'add-to-cart')])[1]"));

        // Click using JavaScript (more reliable for this site)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addToCart);

        System.out.println("First product added to cart");

        Thread.sleep(4000);

        driver.quit();
    }
}
