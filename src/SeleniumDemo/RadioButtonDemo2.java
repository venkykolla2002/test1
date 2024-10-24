package SeleniumDemo;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo2 {

	public static void main(String[] args)
	{
		List<WebElement>list= new ArrayList<WebElement>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radoio2 = driver.findElement(By.xpath("//input[@type='radio'and@value='roundtrip']"));
		WebElement radoio1 = driver.findElement(By.xpath("//input[@type='radio'and@value='oneway']"));
		WebElement radoio3 = driver.findElement(By.xpath("//input[@type='radio'and@value='Coach']"));
		WebElement radoio4 = driver.findElement(By.xpath("//input[@type='radio'and@value='Business']"));
		WebElement radoio5 = driver.findElement(By.xpath("//input[@type='radio'and@value='First']"));
		
		list.add(radoio1);
		list.add(radoio2);
		list.add(radoio3);
		list.add(radoio4);
		list.add(radoio5);
		list.get(3);
	    list.get(3).click();
	    WebElement listRdio3 = list.get(3);
	    listRdio3.click();
		System.out.println("click action performed");
		
	}
}
