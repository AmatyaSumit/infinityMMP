package practise;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap<String,Double> hMap = new HashMap<String,Double>();
		hMap.put("TCS", 28.0);
		System.out.println(hMap.get("TCS"));
		Set<String> keys = hMap.keySet();
		System.out.println("Printing the values from HashMap");
		for(String s: keys)
		{
			
			System.out.println("key:::" + s); 
			System.out.println("value:" + hMap.get(s));
		}
	}

}
