package com.companyname.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutForm {
    public static void main(String[] args) {

        //Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // Go to activity 4-C-1 url
        driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_4/activity_4_C-1.html");

        // Locate all the writable fields, and write on them appropriate values

        // First name
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("John");

        // Last name
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Doe");

        // Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("john@doe.com");

        // Address
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Road Drive 200");

        // Country
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Australia");

        // ZIP
        WebElement zip = driver.findElement(By.id("zip"));
        zip.sendKeys("10117");

        // Save this information for next time
        WebElement saveInfo = driver.findElement(By.id("save-info"));
        saveInfo.click();

        // Select debit card
        WebElement debitCard = driver.findElement(By.cssSelector("input[data-payment$='debit']"));
        debitCard.click();

        // Name on Card
        WebElement nameOnCard = driver.findElement(By.id("cc-name"));
        nameOnCard.sendKeys("John Doe");

        // Card number
        WebElement cardNumber = driver.findElement(By.id("cc-number"));
        cardNumber.sendKeys("4444555566667777");

        // Expiration
        WebElement expiration = driver.findElement(By.id("cc-expiration"));
        expiration.sendKeys("10/18");

        // CVV
        WebElement cvv = driver.findElement(By.id("cc-cvv"));
        cvv.sendKeys("345");

        // Click on Pay (nothing will happen, it is not a real app :)
        WebElement pay = driver.findElement(By.id("pay"));
        pay.click();

        driver.quit();
    }
}
