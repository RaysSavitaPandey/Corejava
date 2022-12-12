package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l = new ArrayList();
l.add("One");
l.add("Two");
l.add("Three");

l.add(6);
l.add(7);
System.out.println(l.get(3));
System.out.println(l.get(4));
//System.out.println(l.get(3)+l.get(4));//Not Possible

Integer i = (Integer)l.get(3);
Integer j = (Integer)l.get(4);

System.out.println(i+j);

ArrayList v = new ArrayList();
v.add("Ram");
v.add("Aman");
v.add(786);
v.add(5.85);
v.add("I am Indian");
v.add("Shyam");

System.out.println(v);

Iterator it = v.iterator();
while(it.hasNext()) {
	Object o = it.next();
	System.out.println(o);
	
}


}
}
