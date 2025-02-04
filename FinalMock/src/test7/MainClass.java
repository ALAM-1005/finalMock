package test7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		
		HashMap<Passport, String> map = new HashMap<Passport, String>();
		
		map.put(new Passport("Juned alam","CCA45FD"), "Male");
		map.put(new Passport("Afroj alam","CCA455FD"), "Male");
		map.put(new Passport("Juned alam","CCA45FD"), "Male");
		map.put(new Passport("Arifa Sba","JAA45FD"), "Female");
		
		Iterator<Map.Entry<Passport, String>> i = map.entrySet().iterator();
		
		while(i.hasNext()) {
			
			Map.Entry<Passport, String> entry = (Map.Entry<Passport, String>) i.next();
			
			System.out.println("Name :"+entry.getKey().name+"  Passport Id :"+entry.getKey().p_Id+" Gender :"+entry.getValue());
		}
	}

}
