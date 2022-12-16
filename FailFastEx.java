package in.co.rays.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class FailFastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l = new LinkedList();
l.add("Neha");
l.add("Shreya");
l.add("Riya");
l.add("Farhan");
l.add("Javed");
Iterator it = l.iterator();
while(it.hasNext()) {
	Object o = it.next();
	System.out.println(o);
	l.add("Mantesh");
	//l.remove("Neha");
}

}

}
