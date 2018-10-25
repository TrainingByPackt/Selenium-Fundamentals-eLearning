package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActivityDLesson03 {

  public static void main(String[] args) {
    locatingElements();
  }

  private static void locatingElements() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_D-1.html");

      // Using id
      WebElement lastName = driver.findElement(By.id("lastName"));
      if (lastName.isDisplayed()) {
        System.out.println("Automation script worked, lastName element is visible");
      } else {
        System.out.println("Something went wrong with the test, lastName element is not visible");
      }

      // Using name
      WebElement hobbies = driver.findElement(By.name("hobbies"));
      if (hobbies.isDisplayed()) {
        System.out.println("Automation script worked, hobbies element is visible");
      } else {
        System.out.println("Something went wrong with the test, hobbies element is not visible");
      }

      // Using class name (in this case, coincidentally the first name is the first element of this kind
      WebElement firstName = driver.findElement(By.className("form-control"));
      if (firstName.isDisplayed()) {
        System.out.println("Automation script worked, hobbies element is visible");
      } else {
        System.out.println("Something went wrong with the test, hobbies element is not visible");
      }

      // Using HTML tag
      List<WebElement> div = driver.findElements(By.tagName("div"));
      if (div.size() > 0) {
        System.out.println("Automation script worked, there are more than zero divs on the page");
      } else {
        System.out.println("Something went wrong with the test, divs could not be located");
      }

      // Using link
      WebElement spanishLink = driver.findElement(By.linkText("Spanish"));
      String link = spanishLink.getAttribute("href");
      if (!"".equals(link)) {
        System.out.println("Automation script worked, the link was found");
      } else {
        System.out.println("Something went wrong with the test, link was not found");
      }

      // Using xpath (try to avoid it as much as possible, CSS is a better option)
      Select dayOfBirth = new Select(driver.findElement(By.xpath("//select")));
      if (dayOfBirth.getOptions().size() > 0) {
        System.out.println("Automation script worked, the element was found");
      } else {
        System.out.println("Something went wrong with the test, the element was not found");
      }

      // Using CSS
      WebElement firstNameWithCss = driver.findElement(By.cssSelector("#firstName"));
      if (firstNameWithCss.isDisplayed()) {
        System.out.println("Automation script worked, firstName with CSS element is visible");
      } else {
        System.out.println("Something went wrong with the test, firstName with CSS element is not visible");
      }

    } finally {
      driver.quit();
    }
  }

}

