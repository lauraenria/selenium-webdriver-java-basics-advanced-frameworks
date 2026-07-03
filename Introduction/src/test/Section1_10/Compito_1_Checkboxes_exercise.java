package test.Section1_10;

import java.util.List;
import java.time.Duration;

// Selenium imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// TestNG import for assertions
import org.testng.Assert;

public class Compito_1_Checkboxes_exercise {

	public static void main(String[] args) {

		// 1. Initialize the WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// --- RIGA DI INIZIO TEST ---
		System.out.println("========================================");
		System.out.println("STARTING TEST: Checkbox Functionality");
		System.out.println("========================================");

		// 2. Configure timeouts and window settings BEFORE loading the page (Best
		// Practice)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); // Maximize the window to ensure all elements are visible

		// 3. Navigate to the target URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 4. Locate the first checkbox using a robust CSS ID selector (#)
		WebElement firstCheckbox = driver.findElement(By.cssSelector("input#checkBoxOption1"));

		// Click the first checkbox and verify that it is selected
		firstCheckbox.click();
		Assert.assertTrue(firstCheckbox.isSelected(), "The checkbox should NOT be selected!");

		// Click it again to deselect it and verify that it is NOT selected anymore
		firstCheckbox.click();
		Assert.assertFalse(firstCheckbox.isSelected(), "The checkbox should BE selected!");

		// 5. Count all the checkboxes present on the page
		// Using the '^=' prefix selector to match any ID that starts with
		// 'checkBoxOption'
		List<WebElement> checkboxList = driver.findElements(By.cssSelector("input[id^='checkBoxOption']"));

		int totalCheckboxes = checkboxList.size();

		// Verify the final count of checkboxes
		Assert.assertEquals(totalCheckboxes, 3, "The number of checkboxes is incorrect!");

		// 6. Close the browser and terminate the WebDriver session
		driver.quit();
	}
}
