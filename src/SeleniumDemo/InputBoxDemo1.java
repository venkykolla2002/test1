package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo1
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement inputBox = driver.findElement(By.xpath("//input[@name='userName']"));
		
		boolean actualInputBoxisDisplayed = inputBox.isDisplayed(); 
		boolean expectedInputBoxisDisplayed = true;
		if(actualInputBoxisDisplayed== expectedInputBoxisDisplayed)
		{
			System.out.println("inputBox is matching");
		}
		else
		{
			System.out.println("InputBox is not matching");
		}
		
		
		boolean actualInputBoxisEnabled = inputBox.isEnabled() ;
		boolean expectedInputBoxisEnabled = true;
		if(actualInputBoxisEnabled==expectedInputBoxisEnabled)
		{
			System.out.println("inputBox is enabled");
		}
		else
		{
			System.out.println("InputBox is not enabled");
		}
		
		String actualVerifyButton = inputBox.getAttribute("name");
		String expectedVerifyButton = "userName";
		if( actualVerifyButton.equals(expectedVerifyButton))
		{
		System.out.println("verify button is correct");	
		}
		else
		{
			System.out.println("verify button is incorrect");
		}
		Thread.sleep(3000);
		inputBox.click();
		
	}
	
	
}

