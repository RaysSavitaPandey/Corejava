package in.co.rays.basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=153;
 int m=n;
 int p,sum=0;
 while(n>0) 
 {
	p=n%10;
     n=n/10;
     sum=sum+p*p*p;
 }
 if(m==sum)
  System.out.println("Its an Armstrong Number");
	else
		System.out.println("Not an Armstrong Number");
		
		
	 
 }
	}

	
	
	
	 
