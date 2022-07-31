package collection;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("John");
		list1.add("leeana");
		list1.add("Priyanka");
		list1.add("Seeta");
		list1.add("Preeti");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size();i++) {
			if(list1.get(i).equals("Priyanka")) {
				System.out.println(i);
				break;
			}
		}
	}

}
