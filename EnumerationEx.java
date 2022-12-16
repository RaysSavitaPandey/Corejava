package in.co.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 20;
Vector v = new Vector(i);
v.add("Ram");
v.add("Shyam");

Enumeration e = v.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	if(i==2) {
		v.add("Raman");
		//v.remove(0);
	}
}
System.out.println(v);

	}
	



	}


