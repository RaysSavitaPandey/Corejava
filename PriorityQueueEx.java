package in.co.rays.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new PriorityQueue();
		//Add element 
		q.add("One");
		q.add("Two");
		q.add("Three");
		
		//Examine top element
		Object ele = q.element();
		
		//Remove Top element
		ele = q.remove();
		System.out.println(ele);
		System.out.println(q);
		
		Iterator it = q.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

	}


