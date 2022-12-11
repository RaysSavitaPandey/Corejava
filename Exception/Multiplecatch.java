package in.co.rays.Exception;

public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "vijay";//Null
try {
	System.out.println(name.length());
	System.out.println(name.charAt(6));
}catch(StringIndexOutOfBoundsException e) {
	System.out.println("String length is small");
e.printStackTrace();

}catch(NullPointerException e) {
	System.out.println("Null data or empty data");
	e.printStackTrace();
}finally {
	System.out.println("Pandit hu me");
}
}
}