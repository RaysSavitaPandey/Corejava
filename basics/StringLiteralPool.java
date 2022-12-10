package in.co.rays.basics;

public class StringLiteralPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1 = "Ram";//String Literal Pool
   String s2 = "Ram";
   
   boolean result1 = (s1==s2);//Check Reference
   System.out.println(result1);
   boolean result2 = (s1.equals(s2));//Check Value
   System.out.println(result2);
	}

}
