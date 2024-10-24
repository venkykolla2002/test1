package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LableTest1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		WebElement labelText = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));

		String actualText =labelText.getText();
		String expectedText ="to continue to Gmail";

		System.out.println(expectedText);
		if(actualText.equals(expectedText))
		{
			System.out.println("data is matching");
		}
		else
		{
			System.out.println("data is not matching");
		}

	}
}
