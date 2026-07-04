package test.Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/*
Exercise requirements:
- Select any checkbox.
- Grab the label of the selected checkbox and store it in a variable.
- Select an option from the dropdown. The option to select should come from the label grabbed in step 2.
- Do not hard-code the dropdown text. Drive it dynamically from the value captured in step 2.
- Enter the label text grabbed in step 2 into the Edit Box / text input field.
- Click the Alert button.
- Verify that the text grabbed from step 2 is present in the alert pop-up message.
- Do not hard-code the label part.

*/

public class Compito_6_PracticeExerciseAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        String checkboxId = "checkBoxOption1";

        WebElement checkbox = driver.findElement(By.id(checkboxId));
        checkbox.click();

        WebElement label = driver.findElement(By.xpath("//*[@id='" + checkboxId + "']/parent::label"));

        String checkboxValue = label.getText().trim();
        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));

        Select dropdownOption = new Select(dropdownElement);

        dropdownOption.selectByVisibleText(checkboxValue);

        WebElement inputField = driver.findElement(By.cssSelector("input#name.inputs"));

        inputField.sendKeys(checkboxValue);

        WebElement alertButton = driver.findElement(By.id("alertbtn"));

        alertButton.click();

        String alertText = driver.switchTo().alert().getText();

        driver.switchTo().alert().accept();

        Assert.assertTrue(alertText.contains(checkboxValue), "Alert text does not contain the expected value.");

        driver.quit();
    }
}
