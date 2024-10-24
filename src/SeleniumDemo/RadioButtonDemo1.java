package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radioButton = driver.findElement(By.xpath("//input[@name='tripType'][2]"));
		boolean actualradioButtonisDisplayed = radioButton.isDisplayed();
		boolean expectedradioButtonisDisplayed = true;
		if(actualradioButtonisDisplayed==expectedradioButtonisDisplayed)
		{
			System.out.println("radioButton is displayed");
		}
		else
		{
			System.out.println("radioButton is not  displayed");
		}

		boolean actualradioButtonisEnabled = radioButton.isEnabled();
		boolean expectedradioButtonisEnabled = true;
		if(actualradioButtonisEnabled==expectedradioButtonisEnabled)
		{
			System.out.println("radioButton is Enabled");
		}
		else
		{
			System.out.println("radioButton is not Enabled");
		}

		boolean actualradioButtonisSelected = radioButton.isSelected();
		boolean expectedradioButtonisSelected = true;
		if(actualradioButtonisSelected==expectedradioButtonisSelected)
		{
			System.out.println("radioButton is Selected");
		}
		else
		{
			System.out.println("radioButton is not Selected");
		}
		radioButton.click();

		boolean actualradioButtonforSelectforafterClick = radioButton.isSelected(); 
		boolean expectedradioButtonforSelectforafterClick = true;
		if(actualradioButtonforSelectforafterClick == expectedradioButtonforSelectforafterClick)
		{
			System.out.println("data is matching after click");
		}
		else
		{
			System.out.println("data is not matching after click");
		}
	}

}
