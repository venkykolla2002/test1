package CollectionsDemo;



import java.util.Hashtable;

import java.util.Map;
public class MapDemo1 {

	public static void main(String[] args) 
	{
		
		
		Map map= new Hashtable();
		map.put("Name","RBG technologies");
		map.put("PhoneNumber","96666666");
		map.put("1","true");
		
		Map<String,String>map2 = new Hashtable<String,String>();
		map2.put("Name","RBG technologies");
		Map<String,Integer>map3 = new Hashtable<String,Integer>();
		map3.put("PhoneNumber",96666666);
		Map<Integer,Boolean>map4 = new Hashtable<Integer,Boolean>();
		map4.put(1,true);
	
	}
}
