package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2 {

	public static void main(String[] args)
	{
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/button/");
	WebElement button = driver.findElement(By.xpath("//input[@value='A submit button' and  @class='ui-button ui-widget ui-corner-all']"));
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
		String expectedText = "A submit button";
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
