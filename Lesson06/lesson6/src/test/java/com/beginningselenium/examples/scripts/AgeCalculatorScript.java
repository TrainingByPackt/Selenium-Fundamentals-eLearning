package com.beginningselenium.examples.scripts;

import com.beginningselenium.examples.pageobjects.AgeCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculatorScript {

    public static void main(String[] args) throws Exception {
        checkAgeCalculator();
    }

    private static void checkAgeCalculator() throws Exception {
        WebDriver driver = new ChromeDriver();
        // Create an instance of AgeCalculatorPage class and open it
        AgeCalculatorPage ageCalculatorPage = new AgeCalculatorPage(driver);
        ageCalculatorPage.open();

        // Start the test by means of the calculate method
        ageCalculatorPage.calculate("11", "February", "1982");
        
        // Verify results
        if (ageCalculatorPage.getAge().equals("36")) {
            System.out.println("Age was calculated correctly!");
        } else {
            System.out.println("There was an error in the age calculation");
        }

        if (ageCalculatorPage.getZodiacSign().equals("Aquarius")) {
            System.out.println("Zodiac sign was calculated correctly!");
        } else {
            System.out.println("There was an error in the zodiac sign calculation");
        }

        ageCalculatorPage.close();
    }
}
