package com.beginningselenium.examples.scripts;

import com.beginningselenium.examples.pageobjects.AgeCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgeCalculatorTestLocal {

    private WebDriver driver;

    @BeforeMethod
    public void setUpWebDriver() {
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void teardownWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void checkAgeCalculatorLocal() {
        AgeCalculatorPage ageCalculatorPage = new AgeCalculatorPage(driver);
        ageCalculatorPage.open();

        // Start the test by means of the calculate method
        ageCalculatorPage.calculate("11", "February", "1982");

        // Verify results
        Assert.assertEquals(ageCalculatorPage.getAge(), "36", "There was an error in the age calculation");

        Assert.assertEquals(ageCalculatorPage.getZodiacSign(), "Aquarius", "There was an error in the zodiac sign calculation");
        ageCalculatorPage.close();
    }
}
