
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity5B {

    public static void main(String[] args) {
        explicitWaitExample();
    }

    private static void explicitWaitExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/activity_5_B-1.html");
        try {
            /* Search for a button named runTestButton and click on it to start the test*/
            driver.findElement(By.id("runTestButton")).click();

            // Set an explicit wait
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.titleContains("Explicit"));

            // Verify expected changes
            if (driver.getTitle().startsWith("Explicit")) {
                System.out.println("ExplicitWait worked, the element contains 'Explicit'");
            } else {
                System.out.println("Something went wrong with ExplicitWait, 'Explicit' was not found");
            }
        } finally {
            driver.quit();
        }
    }
}
