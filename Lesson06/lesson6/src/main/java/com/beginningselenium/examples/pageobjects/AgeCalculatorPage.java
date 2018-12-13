package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgeCalculatorPage {
    //WebElements
    private WebElement dayOfBirth = null;
    private WebElement monthOfBirth = null;
    private WebElement yearOfBirth = null;
    private WebElement age = null;
    private WebElement zodiacSign = null;
    private WebElement calculate = null;

    ///WebDriver
    private WebDriver driver;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html";

    //Class Constructor
    public AgeCalculatorPage(WebDriver webDriver) {
        driver = webDriver;
    }

    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }
    public void close() {
        this.driver.quit();
    }

    //Method to execute the test
    public void calculate(String day, String month, String year) {
        getDayOfBirth().sendKeys(day);
        getMonthOfBirth().sendKeys(month);
        getYearOfBirth().sendKeys(year);
        getCalculate().click();
    }

    //Methods to read values from required WebElements
    public String getAge() {
        age = driver.findElement(By.id("age"));
        return age.getText();
    }

    public String getZodiacSign() {
        zodiacSign = driver.findElement(By.id("zodiacSign"));
        return zodiacSign.getText();
    }

    public WebElement getDayOfBirth() {
        dayOfBirth = driver.findElement(By.id("dayOfBirth"));
        return dayOfBirth;
    }

    public WebElement getMonthOfBirth() {
        monthOfBirth = driver.findElement(By.id("monthOfBirth"));
        return monthOfBirth;
    }

    public WebElement getYearOfBirth() {
        yearOfBirth = driver.findElement(By.id("yearOfBirth"));
        return yearOfBirth;
    }

    public WebElement getCalculate() {
        calculate = driver.findElement(By.id("calculate"));
        return calculate;
    }
}
