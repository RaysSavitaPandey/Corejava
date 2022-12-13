package in.co.rays.Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack stack = new Stack();
stack.push("One");
stack.push("Two");
stack.push("Three");
System.out.println(stack);

Iterator it = stack.iterator();
while(it.hasNext()) {
System.out.println(it.next());
}	
//System.out.println(l.size());
//return top & dose not remove it
	Object objTop = stack.peek();
	System.out.println(objTop);
	System.out.println(stack);

//return top & remove it from stack
	Object obj3 = stack.pop();
	System.out.println(obj3);
	System.out.println(stack);
	
	Object obj2 = stack.pop();
	System.out.println(obj2);
	System.out.println(stack);
	
	
	Object obj1 = stack.pop();
	System.out.println(obj1);
	System.out.println(stack);
	
	System.out.println(stack.isEmpty());
	}
	
}
