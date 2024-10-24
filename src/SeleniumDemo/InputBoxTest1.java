package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest1
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		boolean actualinputBoxisdisplayed = driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
       System.out.println("actualinputBoxisdisplayed: " + actualinputBoxisdisplayed);
		if(actualinputBoxisdisplayed == true)
		{
			System.out.println("inputBox is displayed");
		}
		else
		{
			System.out.println("inputBox is not displayed");
		}


		boolean actualinputBoxisEnabled = driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();

	System.out.println(actualinputBoxisEnabled );
		if(actualinputBoxisEnabled == true)
		{
			System.out.println("inputBox is Enabled");
		}
		else
		{
			System.out.println("inputBox is not Enabled");
		}
		
		
       
		String actualWaterMarkValue = driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
        String expectedWaterMark = "Email or phone";
        System.out.println("actualWaterMarkValue :" + actualWaterMarkValue);
		if(actualWaterMarkValue.equals( expectedWaterMark) )
		{
			System.out.println("WaterMark is matching");
		}
		else
		{
			System.out.println("WaterMark is not matching");
		}
        
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("RBG technology");
        
		String actualValidateData = driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("data-initial-value");
        String expectedValidateData = "RBG technology";
        System.out.println("actualValidateData :" + actualValidateData);
       
        if (actualValidateData.equals(expectedValidateData))
        {
        	System.out.println("correct validate data");
        }
        else
        {
        	System.out.println("not correct validate data");
        }
	}

}


