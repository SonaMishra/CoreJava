package collection;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		HashMap<Integer,String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Kathy");
		map1.put(2, "Kate");
		map1.put(3, "John");
		map1.put(4, "Kathy");
		map1.put(5, "Matt");
		
		System.out.println(map1);
		
		for(Integer key: map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
			
			
		}
	}

}
