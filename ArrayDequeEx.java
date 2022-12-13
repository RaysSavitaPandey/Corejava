package in.co.rays.Collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque q = new ArrayDeque();
q.add("One");
q.add("Two");
q.add("Three");
q.addFirst("First");
q.addLast("Last");

System.out.println(q);

Object ele = q.element();
ele = q.remove();//remove top element
System.out.println(ele);
System.out.println(q);

ele = q.removeFirst();//remove top element 
System.out.println(ele);
System.out.println(q);

ele = q.removeLast();
System.out.println(ele);
System.out.println(q);
	}



	

	
	}


