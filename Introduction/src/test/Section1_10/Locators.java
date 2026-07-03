package test.Section1_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

      public static void main(String[] args) throws InterruptedException {

            // Set the path to the ChromeDriver executable
            // System.setProperty("webdriver.chrome.driver","/Users/rahulshetty/Documents/chromedriver");

            // Launch a new Chrome browser instance
            WebDriver driver = new ChromeDriver();

            // Set a global implicit wait of 5 seconds
            // Selenium will wait up to 5 seconds when searching for elements
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            // Open the practice website
            driver.get("https://rahulshettyacademy.com/locatorspractice/");

            // Enter an incorrect username using the ID locator
            driver.findElement(By.id("inputUsername"))
                        .sendKeys("rahul");

            // Enter an incorrect password using the Name locator
            driver.findElement(By.name("inputPassword"))
                        .sendKeys("hello123");

            // Click the Sign In button using the Class Name locator
            driver.findElement(By.className("signInBtn"))
                        .click();

            // Capture and print the error message using a CSS Selector
            System.out.println(
                        driver.findElement(By.cssSelector("p.error"))
                                    .getText());

            // Click the "Forgot your password?" link using Link Text locator
            driver.findElement(By.linkText("Forgot your password?"))
                        .click();

            // Wait 1 second for the sliding transition to complete
            Thread.sleep(1000);

            // Enter the name using XPath based on the placeholder attribute
            driver.findElement(By.xpath("//input[@placeholder='Name']"))
                        .sendKeys("John");

            // Enter an email address using a customized CSS Selector
            driver.findElement(By.cssSelector("input[placeholder='Email']"))
                        .sendKeys("john@rsa.com");

            // Clear the second text input using XPath with indexing
            driver.findElement(By.xpath("//input[@type='text'][2]"))
                        .clear();

            // Enter a new email using CSS Selector with nth-child indexing
            driver.findElement(By.cssSelector("input[type='text']:nth-child(3)"))
                        .sendKeys("john@gmail.com");

            // Enter the phone number using XPath parent-to-child traversal
            driver.findElement(By.xpath("//form/input[3]"))
                        .sendKeys("9864353253");

            // Click the Reset Login button using CSS Class Selector
            driver.findElement(By.cssSelector(".reset-pwd-btn"))
                        .click();

            // Capture and print the message containing the temporary password
            System.out.println(
                        driver.findElement(By.cssSelector("form p"))
                                    .getText());

            // Click the "Go to Login" button using XPath with:
            // - attribute-based parent selection
            // - child traversal
            // - indexing
            driver.findElement(
                        By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

            // Wait 1 second for the page transition back to the login form
            Thread.sleep(1000);

            // Enter the username again using CSS Selector based on ID (#)
            driver.findElement(By.cssSelector("#inputUsername"))
                        .sendKeys("rahul");

            // Enter the correct password using CSS regular expression (*=)
            // Matches any input whose type contains the text "pass"
            driver.findElement(By.cssSelector("input[type*='pass']"))
                        .sendKeys("rahulshettyacademy");

            // Select the agreement checkbox using ID locator
            driver.findElement(By.id("chkboxOne"))
                        .click();

            // Click the Sign In button using XPath with contains()
            // Matches any button whose class contains the text "submit"
            driver.findElement(By.xpath("//button[contains(@class,'submit')]"))
                        .click();
      }
}