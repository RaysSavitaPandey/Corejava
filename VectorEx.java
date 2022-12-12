package in.co.rays.Collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//size of the vector 
		int n = 5;
//Declaring the vector with
		//initial siz n
		Vector v = new Vector(n);
		
//Appending new element at the end of the vector
		for(int i = 1;i<=n;i++)
			v.add(i);
		//Printing element
		System.out.println(v);
		//Remove element at Index 3
		v.remove(3);
		//Displaying the vector after deletion
		System.out.println(v);
		//iterating over vector element using for loop
		for(int i =0;i<v.size();i++)
			//printing element one by one 
			System.out.println(v.get(i)+" ");
		
	}

}
