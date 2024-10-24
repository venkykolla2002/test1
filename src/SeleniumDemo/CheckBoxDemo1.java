package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement checkBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		
		WebElement checkBoxforSelect = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		
		boolean actualcheckBoxisDisplayed = checkBox.isDisplayed();
		boolean expectedcheckBoxisDisplayed = true;
		if(actualcheckBoxisDisplayed==expectedcheckBoxisDisplayed)
		{
			System.out.println("checkBox is displayed");
		}
		else
		{
			System.out.println("checkBox is not  displayed");
		}
		
		boolean actualcheckBoxisEnabled = checkBox.isEnabled();
		boolean expectedcheckBoxisEnabled = true;
		if(actualcheckBoxisEnabled==expectedcheckBoxisEnabled)
		{
			System.out.println("checkBox is Enabled");
		}
		else
		{
			System.out.println("checkBox is not Enabled");
		}
		
		boolean actualcheckBoxisSelected = checkBox.isSelected();
		boolean expectedcheckBoxisSelected = true;
		if(actualcheckBoxisSelected==expectedcheckBoxisSelected)
		{
			System.out.println("checkBox is Selected");
		}
		else
		{
			System.out.println("checkBox is not Selected");
		}
		checkBox.click();
		
		boolean actualcheckBoxforSelectforafterClick = checkBoxforSelect.isSelected(); 
		boolean expectedcheckBoxforSelectforafterClick = true;
		if(actualcheckBoxforSelectforafterClick == expectedcheckBoxforSelectforafterClick)
		{
			System.out.println("data is matching after click");
		}
		else
		{
			System.out.println("data is not  matching after click");
		}
	}

}
