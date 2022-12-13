package in.co.rays.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we can not add will value in a Queue
		//it gives runtime exception - nullpointerException
		Queue q  = new LinkedList();
		//q.add(null);
		//Add element{0,1,2,3,4} to the queue
		for(int i = 0;i<5;i++) {
			q.add(i);
		}
		//Display content of the queue
			System.out.println("Element of queue"+q);
		//To Remove the head of queue
			int removedEle = (int)q.remove();
			System.out.println("removed element-"+removedEle);
			System.out.println(q);
		//To view the head of queue 
         int head =(int)q.peek();
			System.out.println("head of queue" + head);
		//Read all method of collection
			//interface like size & collection
			//can be used with this Implementation
			int size = q.size();
			System.out.println("size of queue-"+size);
			
			Iterator iterator = q.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next()+" ");
			}
			}
			
			
		}
		
	


