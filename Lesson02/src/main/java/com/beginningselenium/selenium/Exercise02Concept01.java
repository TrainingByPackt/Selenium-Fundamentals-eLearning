package com.beginningselenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise02Concept01 {

    public static void main(String[] args) {
        activityLesson02AutomationScript();
    }

    private static void activityLesson02AutomationScript(){

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

            if (driver.getTitle().equalsIgnoreCase("Google")) {
                System.out.println("Script worked, the title contains 'Google'");
            } else {
                System.out.println("Something went wrong with the script, 'Google' was not found");
            }

            driver.navigate().to("https://www.yahoo.com");
            if (driver.getTitle().equalsIgnoreCase("Yahoo")) {
                System.out.println("Script worked, the title contains 'Yahoo'");
            } else {
                System.out.println("Something went wrong with the script, 'Yahoo' was not found");
            }

            driver.navigate().back();

            if (driver.getTitle().equalsIgnoreCase("Google")) {
                System.out.println("Script worked, the title contains 'Google'");
            } else {
                System.out.println("Something went wrong with the script, 'Google' was not found");
            }
        } finally {
            driver.quit();
        }
    }

}
