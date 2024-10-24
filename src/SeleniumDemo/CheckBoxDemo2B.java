package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2B 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		WebElement checkboxselect = driver.findElement(By.xpath("//input[@id='caddoptional']"));
		boolean actualcheckboxisdisplayed=checkbox.isDisplayed();
		System.out.println("actualcheckboxisdisplayed :"+actualcheckboxisdisplayed);
		boolean expectedcheckboxisdisplayed=true;
		if(actualcheckboxisdisplayed==expectedcheckboxisdisplayed)
		{
			System.out.println("chickbox is displayed");

		}
		else
		{
			System.out.println("chickbox is not displayed");
		}
		boolean actualcheckboxisenabled=checkbox.isEnabled();
		System.out.println("actualcheckboxisenabled :"+actualcheckboxisenabled);
		boolean expectedcheckboxisenabled=true;
		if(actualcheckboxisenabled==expectedcheckboxisenabled)
		{
			System.out.println("chickbox is enabled");
		}
		else
		{
			System.out.println("chickbox is not enabled");
		}
		boolean actualcheckboxisselected=checkboxselect.isSelected();
		System.out.println("actualcheckboxisselected :"+actualcheckboxisselected);
		boolean expectedcheckboxisselected=true;
		if(actualcheckboxisselected==expectedcheckboxisselected)
		{
			System.out.println("chickbox is selected");
		}
		else
		{
			System.out.println("chickbox is not selected");
		}
		checkbox .click();
		boolean actualcheckboxisselectedforafterclick=checkboxselect.isSelected();
		System.out.println("actualcheckboxisselectedforafterclick :"+actualcheckboxisselectedforafterclick);
		boolean expectedcheckboxisselectedforafterclick=true;
		if(actualcheckboxisselectedforafterclick==expectedcheckboxisselectedforafterclick)
		{
			System.out.println("chickbox is selectedforafterclick");
		}
		else
		{
			System.out.println("chickbox is not selectedforafterclick");
		}

	}

}
