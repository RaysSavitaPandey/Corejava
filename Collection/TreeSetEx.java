package in.co.rays.Collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//element are sorted & ordered in TreeSet()	
	TreeSet s = new TreeSet();
	s.add("f");
	s.add("a");
	s.add("b");
	//s.add(null);
	
	System.out.println(s);
	for(Object ele :s) {
		System.out.println(ele);
	}
	System.out.println(s.first());
	System.out.println(s.last());
	
	}
	}


