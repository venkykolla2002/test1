package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean actualinputBoxisdisplayed = inputBox.isDisplayed();
	    boolean expectedinputBoxisdisplayed = true;
	     
	    System.out.println("actualinputBoxisdisplayed :"+ actualinputBoxisdisplayed);
	    
	    if(actualinputBoxisdisplayed ==expectedinputBoxisdisplayed)
	    {
	    	System.out.println("inputBox is displayed");
	    }
	    else
	    {
	    	System.out.println("inputBox is not displayed");
	    }
	    
	    boolean actualinputBoxisenabled = inputBox.isEnabled();
	    boolean expectedinputBoxisenabled = true;
	    System.out.println("actualbuttonisenabled :"+ actualinputBoxisenabled);
	    
	    if(actualinputBoxisenabled ==expectedinputBoxisenabled)
	    {
	    	System.out.println(" inputBox is enabled"); 
	    }
	    else
	    {
	    	System.out.println("inputBox is not enabled");
	    }	
	    String actualWaterMark = inputBox.getAttribute("aria-label");
		String expectedWaterMark = "Email address or phone number";
		if(actualWaterMark.equals(expectedWaterMark))
		{
			System.out.println("WaterMark is matching");
		}
		else
		{
			System.out.println("WaterMark is  not matching");
		}
		inputBox.sendKeys("RBG");
		 String actualWaterMark1 = inputBox.getAttribute("value");
			String expectedWaterMark1 = "RBG";
			if(actualWaterMark.equals(expectedWaterMark))
			{
				System.out.println("WaterMark1 is matching");
			}
			else
			{
				System.out.println("WaterMark1 is  not matching");
			}
	}
	}
		  
		