package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo1 
{

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	
	driver.findElement(By.id("identifierID")).sendKeys("RBG technologies");
	WebElement element1 = driver.findElement(By.id("identifierID"));
	element1.sendKeys("RBG technologies");
	 
    By locaterType1 = By.id("identifierID");
    WebElement element2 = driver.findElement(locaterType1);
    element2.sendKeys("RBG technologies");
    String locaterValue = "identifierID";
    By locaterType2 = By.id("identifierID");
	}

}
