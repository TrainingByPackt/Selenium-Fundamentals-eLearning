package com.beginningselenium.examples.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beginningselenium.examples.pageobjects.AgeCalculatorPage;

public class AgeCalculatorTestThirdPartyService {

    private WebDriver driver;

    @BeforeMethod
    public void setUpWebDriver() throws MalformedURLException {
        String username = "yourUserName";
        String key = "yourAccessKey";
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities(new ChromeOptions());
        driver = new RemoteWebDriver(new URL("http://" + username + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"), desiredCapabilities);
    	
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
