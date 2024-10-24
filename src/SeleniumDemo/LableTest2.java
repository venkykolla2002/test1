package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LableTest2
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.findElement(By.xpath("")).sendKeys("");
		WebElement label1= driver.findElement(By.xpath(""));
		label1.sendKeys("");
	}

}