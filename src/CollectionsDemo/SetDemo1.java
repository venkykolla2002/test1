package CollectionsDemo;


import java.util.HashSet;
import java.util.Set;
public class SetDemo1 {

	public static void main(String[] args) 
	{
		//HashSet set= new HashSet();
		Set set=new HashSet();
		set.add(10);
	    set.add("true");
		set.add("RBG technologies");
		
		Set<String>set1= new HashSet<String>();
		set1.add("RBG technologies");
	
		
		Set<Integer>set2= new HashSet<Integer>();
		set2.add(10);
		Set<Boolean>set3= new HashSet<Boolean>();
		set3.add(true);
		
		
	}

}
