package test.Section1_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

        public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();

                driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

                Assert.assertFalse(
                                driver.findElement(
                                                By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

                driver.findElement(
                                By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

                Assert.assertTrue(
                                driver.findElement(
                                                By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

                System.out.println(
                                driver.findElements(
                                                By.cssSelector("input[type='checkbox']")).size());

                driver.findElement(By.id("divpaxinfo")).click();

                for (int i = 1; i < 5; i++) {
                        driver.findElement(By.id("hrefIncAdt")).click();
                }

                Assert.assertEquals(
                                driver.findElement(By.id("divpaxinfo")).getText(),
                                "5 Adult");

        }
}
