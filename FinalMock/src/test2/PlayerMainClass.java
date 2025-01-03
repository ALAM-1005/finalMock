package test2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMainClass {

	
	public static void main(String[] args) {
		 
		TreeMap<Player,String> map = new TreeMap<Player, String>();
		
		map.put(new Player(01, "Kohli"), "India");
		map.put(new Player(02, "MS Dhoni"), "India");
		map.put(new Player(04, "MD Shami"), "India");
		map.put(new Player(03, "MD Seraj"), "India");
		
		Iterator<Map.Entry<Player, String>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Player, String> entry = (Map.Entry<Player, String>) iterator
					.next();
			
			Player player = entry.getKey();
			
			
			//System.out.println("PlayerId:"+player.playedId+" , PlayerNAme: "+player.playerName);
			
			System.out.println(player);
		

			
			
		}
		
	}
}
