package in.co.rays.basics;

public class HeapMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3 = new String("Ram");//Heap Memory
		String s4 = new String ("Ram");
		
		boolean result1 =(s3==s4);//Check Reference
		System.out.println(result1);
		boolean result2 =(s3.contentEquals(s4));
		System.out.println(result2);

	}

}
