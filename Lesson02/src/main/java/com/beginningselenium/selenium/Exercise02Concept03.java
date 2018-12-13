package com.beginningselenium.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise02Concept03 {

    public static void main(String[] args) {
        alertsChecks();
    }

    private static void alertsChecks(){

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_03.html");

            // Accepting the first alert
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println("Alert text contents: " + simpleAlert.getText());
            if (simpleAlert.getText().equalsIgnoreCase("Welcome! This is a simple alert. Press 'Accept' to continue")) {
                System.out.println("It worked, the expected simple alert was shown");
            }
            else {
                System.out.println("Something went wrong, the expected simple alert was NOT shown");
            }
            simpleAlert.accept();

            // Accepting the confirmation or cancellation alert
            Alert confirmAlert = driver.switchTo().alert();
            if (confirmAlert.getText().equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?")) {
                System.out.println("It worked, the expected confirmation alert was shown");
            }
            else {
                System.out.println("Something went wrong, the expected confirmation alert was NOT shown");
            }
            confirmAlert.accept();

            // Handling the alert with input
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys("Java");
            promptAlert.accept();

            if (driver.getTitle().contains("Java")) {
                System.out.println("It worked, the expected prompt alert was shown and the text was included in the title.");
            } else {
                System.out.println("Something went wrong, the expected prompt alert did not work");
            }
        } finally {
            driver.quit();
        }
    }

}