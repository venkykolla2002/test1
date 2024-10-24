package CollectionsDemo;



import java.util.Hashtable;

import java.util.Map;
public class MapDemo2 {

	public static void main(String[] args) 
	{
		
		
		
		Map<String,String>map = new Hashtable<String,String>();
		Map map1= new Hashtable();
		map1.put("Name","RBG technologies");
		map1.put("Selenium","Java");
		map1.put("API testing","Postman");
		int size= map1.size();
		System.out.println("size :"+size);
		
		map1.put("Name","RBG technologies");
		map1.put("Selenium","Java");
		map1.put("API testing","Postman");
		map1.put("API testing","RestAssured" );
	    size= map1.size();
		System.out.println("size :"+size);
		
	}
}
