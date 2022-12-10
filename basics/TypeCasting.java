package in.co.rays.basics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //small to big data type conversion
	//implicit type casting
		int i = 5;
		System.out.println(i);
		double d = i;
		System.out.println(d);
		
		//big to small data type conversion 
		//explicit type casting
		double d1 = 5;
		System.out.println(d1);
		int i1 = (int)d1;
		System.out.println(i1);
	}

}
