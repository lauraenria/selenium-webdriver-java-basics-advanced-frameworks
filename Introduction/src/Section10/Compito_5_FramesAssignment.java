package Section10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 * =============================================================================
 * ASSIGNMENT: WORKING WITH NESTED FRAMES
 * =============================================================================
 * * Target URL:
 * https://the-internet.herokuapp.com/
 * * ASSIGNMENT REQUIREMENTS:
 * 1. Navigate to the main URL.
 * 2. Find and click on the "Nested Frames" link.
 * 3. Handle the nested frame structure ("a frame within a frame").
 * 4. Switch the WebDriver focus to the top frame, and then into the
 * nested middle frame.
 * 5. Extract the "MIDDLE" text from the target frame.
 * 6. Print the extracted text into the console output.
 * * HINTS & SUPPORT (From video):
 * - Focus on the <frameset> and <frame> tags to understand the nesting.
 * - A sequential driver switch is required to access the inner middle frame.
 * =============================================================================
 */

public class Compito_5_FramesAssignment {

    public static void main(String[] args) {

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the main URL of the assignment
        driver.get("https://the-internet.herokuapp.com/");

        // Maximize the browser window to ensure all elements are visible and accessible
        driver.manage().window().maximize();

        // Click on the "Nested Frames" link to navigate to the nested frames page
        driver.findElement(By.linkText("Nested Frames")).click();

        // Switch to the top frame
        driver.switchTo().frame("frame-top");

        // Switch to the middle frame within the top frame
        driver.switchTo().frame("frame-middle");

        // Extract the "MIDDLE" text from the target frame
        String middleText = driver.findElement(By.id("content")).getText();

        // Print the extracted text into the console output
        System.out.println(middleText);

        // Close the browser and end the WebDriver session
        driver.quit();
    }

}
