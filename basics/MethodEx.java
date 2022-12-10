package in.co.rays.basics;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 12;
int m = 30;
//Method obj = new method();
//creating object of Method class
int value = MethodEx.sum(n,m);
 System.out.println(value);
	}
//Instance Method are methods which require an object of its class  to be created before it can be called.	
	public static int sum(int a,int b) {
		return a+b;



}
}

