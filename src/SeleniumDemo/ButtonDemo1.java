package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1 
{

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	boolean actualbuttonisdisplayed = button.isDisplayed();
    boolean expectedbuttonisdisplayed = true;
     
    System.out.println("actualbuttonisdisplayed :"+ actualbuttonisdisplayed);
    
    if(actualbuttonisdisplayed ==expectedbuttonisdisplayed)
    {
    	System.out.println("button is displayed");
    }
    else
    {
    	System.out.println("button is not displayed");
    }
    
    boolean actualbuttonisenabled = button.isEnabled();
    boolean expectedbuttonisenabled = true;
    System.out.println("actualbuttonisenabled :"+ actualbuttonisenabled);
    
    if(actualbuttonisenabled ==expectedbuttonisenabled)
    {
    	System.out.println(" button is enabled"); 
    }
    else
    {
    	System.out.println("button is not enabled");
    }	
		String actualText = button.getText();
		String expectedText = "Log In";
		System.out.println("actualText :" + actualText);
		
		if(actualText.equals(expectedText))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("data is not matching");
		}
		button.click();

	}

}
