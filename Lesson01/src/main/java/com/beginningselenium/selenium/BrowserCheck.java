package com.beginningselenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCheck {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * Place here the path where ChromeDriver is on your computer E.g.
		 * c:\\browserdrivers\\chromedriver.exe
		 */
		String chromeDriverPath = "G:\\kuldeep freelancing\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver webDriver = new ChromeDriver();

		// This Thread.sleep for 10 seconds is only meant to allow you some seconds to
		// double check that
		// the Chrome browser opened
		Thread.sleep(10000);

		webDriver.quit();
	}
}
