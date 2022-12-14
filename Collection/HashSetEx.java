package in.co.rays.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating a HashSet Object of Strinng type
		HashSet h = new HashSet();
		//Adding element to HashSet
		//using Add()Method
		h.add("Hey");
		h.add("Hello");
		h.add("Hii");
		h.add("Hola");
		h.add(2);
		h.add(1);
		
		h.add(null);
		//h.add(null);
		System.out.println(h);
		//Duplicate removed
		h.add("Hey");
		for(Object ele : h) {
			System.out.println(ele);
			
		}
	}

}
