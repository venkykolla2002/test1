package CollectionsDemo;



import java.util.Hashtable;

import java.util.Map;
public class MapDemo3 {

	public static void main(String[] args) 
	{
		
		
		
		Map<String,String>map = new Hashtable<String,String>();
		map.put("Name","RBG technologies");
		System.out.println(map.get("Name"));
		map.put("Selenium","Java");
		
		map.put("API testing","Postman");
		System.out.println(map.get("API testing"));

		map.put("API testing","RestAssured" );
		System.out.println("API testing");
		
	}
}
