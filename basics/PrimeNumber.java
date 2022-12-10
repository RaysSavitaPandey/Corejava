package in.co.rays.basics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 7;
 int b =0;
 for(int i=2;i<=a-1;i++) {
	 if(a%i==0) {
	 b=b+i;
 }
 }if(b==0) {
	 System.out.println(a+"is prime no");
 }else {
	 System.out.println(a+"is not prime no");
 }
 }
 
  
	}


