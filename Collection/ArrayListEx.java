package in.co.rays.Collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a = new ArrayList();
a.add("one");
a.add("two");
a.add("three");
a.add("four");

int size = a.size();
System.out.println("size:"+size);

for(int i = 0; i<a.size();i++) {
System.out.println(i+":"+a.get(i));
}
for(Object Obj :a) {
	System.out.println(Obj);
}
Integer i = new Integer(4);
a.add(i);
System.out.println(a);

ArrayList Sublist = new ArrayList(a.subList(0,2));
System.out.println(Sublist);
}
}