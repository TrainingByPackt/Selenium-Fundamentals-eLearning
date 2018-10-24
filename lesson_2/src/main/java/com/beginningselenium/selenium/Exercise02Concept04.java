package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise02Concept04 {

    public static void main(String[] args) {
        checkFrames();
        checkIFrames();
    }

    private static void checkFrames(){

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_04.html");

            driver.switchTo().frame("info");
            if (driver.getPageSource().contains("Frame Info")) {
                System.out.println("The script worked, the focus was changed to Frame Info");
            } else {
                System.out.println("Something went wrong with the script, the focus was not changed to Frame Info");
            }

            driver.switchTo().defaultContent();

            driver.switchTo().frame("title");
            if (driver.getPageSource().contains("Frame Title")) {
                System.out.println("The script worked, the focus was changed to Frame Title");
            }
            else {
                System.out.println("Something went wrong with the script, the focus was not changed to Frame Title");
            }

        } finally {
            driver.quit();
        }
    }

    private static void checkIFrames(){

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_04.html");

            driver.switchTo().frame("twitter");
            if (driver.getPageSource().contains("Frame Twitter")) {
                System.out.println("The script worked, the focus was changed to iFrame Twitter");
            } else {
                System.out.println("Something went wrong with the script, the focus was not changed to Frame Info");
            }

            WebElement twitterFrame = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(twitterFrame);
            WebElement followButton = driver.findElement(By.id("follow-button"));
            followButton.click();

            driver.switchTo().defaultContent();

        } finally {
            driver.quit();
        }
    }
}