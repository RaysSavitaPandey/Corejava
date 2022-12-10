package in.co.rays.Exception;

public class TestArithmetic {
public static void main(String[]args) {
	 int i=0;
	 int j=10;
	 try {
		 int Value = j/i;
		 System.out.println(Value);
	 }catch(Exception e) {
		 //todo; handle exception
		 //System.out.println("Divided by Zero");
		 e.printStackTrace();
		 //System.out.println());
		 
	 }finally {
		 System.out.println("finally block");
	 }
}
}
