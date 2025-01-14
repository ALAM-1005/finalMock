package test5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		
		// without override toString method
		
		TreeMap<person, Double> map = new TreeMap<person, Double>();
		
		map.put(new person(21, "juned"), 25.56);
		map.put(new person(24, "jued"), 26.56);
		map.put(new person(22, "jund"), 25.56);
		
		
		// map using keyset 
		Set<person> keys = map.keySet();
		
		
		//using for loop in keyset
		for(person p : keys) {
			
			System.out.println(p.age+"->"+map.get(p));
		}
		
		//using iterator in keyset
		
		Iterator<person> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			
			person p = it.next();
			
			System.out.println(p.age+"->"+map.get(p));
		}
		
		
		//using for loop in Entryset
		for(Map.Entry<person, Double>  s : map.entrySet()) {
			
			System.out.println(s.getKey().age+"->  "+s.getValue());
		}
		
		
		//using iterator in entrySet
		Iterator<Map.Entry<person, Double>> entry =  map.entrySet().iterator();
		
		while(entry.hasNext()) {
			
			Map.Entry<person, Double> Entry = (Map.Entry<person,Double>)entry.next();
			
			if(Entry.getValue()>25)
			System.out.println(Entry.getKey().age+" ->"+Entry.getValue()+"->"+Entry.getKey().name);
		}
		
	}

}
