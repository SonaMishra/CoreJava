package collection;

import java.util.HashMap;

public class WordOccurnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Clean world Green world Love world";
        
        String[] words = str.split(" ");
        
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(map1.get(word)== null) {
				map1.put(word, 1);
			}else {
				map1.put(word,map1.get(word)+1);
			}
		}
		System.out.println(map1);
		
String str1 = "Clean World Green World Love World";
		
		String [] words1 = str1.split(" ");
		
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		
		for(String word: words1) {
			
			if(map2.get(word) == null) {
				
				map2.put(word, 1);
			}else {
				
				int oldOccu = map2.get(word);
				
				map2.put(word, oldOccu+1);
			}
				
		}
		
		System.out.println(map2);

	}

}
