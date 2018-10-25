package com.beginningselenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity02Lesson02 {

    public static void main(String[] args) {
        activityLesson02AutomationScript();
    }

    private static void activityLesson02AutomationScript(){

        /*
            This script assumes that ChromeDriver is already configured on your computer, as shown in Lesson 1.
            If not, check these lines to see how to do it in this script.
            https://github.com/TrainingByPackt/Beginning-Selenium/blob/master/docs/lesson_1/src/main/java/com/beginningselenium/selenium/BrowserCheck.java#L13
         */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        // the other script code will go here

        driver.quit();
    }

}
