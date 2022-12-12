package in.co.rays.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l = new LinkedList();
l.add("one");
l.add("two");
l.add("three");

for (Object o : l) {
	System.out.println(o);
}
Iterator it = l.iterator();
while(it.hasNext()) {
	Object o = it.next();
	System.out.println(o);
}
	
System.out.println(l.isEmpty());
	}
}
	



	


