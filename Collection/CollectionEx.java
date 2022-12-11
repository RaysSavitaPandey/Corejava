package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection c = new ArrayList();

//Add element into collection 
c.add("Bura mat dekho");
c.add("Bura mat Suno");
c.add("Bura mat bolo");
System.out.println("length of collection :"+c.size());

//print all element of a collection 
for(Object ele:c) {
	System.out.println(ele);
}
//Convert collection to array
Object[]arr = c.toArray();
//print all element of Array 
for(Object ele:arr) {
	String s = ele.toString();
	System.out.println(s);
	
}
}

}
