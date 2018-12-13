package com.beginningselenium.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise02Concept02 {

	public static void main(String[] args) {
		activityLesson02AutomationScript();
	}

	private static void activityLesson02AutomationScript() {

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.google.com");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

			driver.manage().window().setSize(new Dimension(300, 500));
			if (driver.manage().window().getSize().getHeight() >= 500
					&& driver.manage().window().getSize().getWidth() >= 300) {
				System.out.println("Load script worked, the window was resized");
			} else {
				System.out.println(
						"Something went wrong with the script, the window was not resized to the desired size");
			}

			driver.manage().window().maximize();
			if (driver.manage().window().getSize().getHeight() >= 500
					&& driver.manage().window().getSize().getWidth() >= 300) {
				System.out.println("Load script worked, the window was resized");
			} else {
				System.out.println("Something went wrong with the script, the window was not resized");
			}
			System.out.println(String.format("Current window size is %s height x %s width",
					driver.manage().window().getSize().getHeight(), driver.manage().window().getSize().getWidth()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
