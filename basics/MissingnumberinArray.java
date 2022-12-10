package in.co.rays.basics;

public class MissingnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {3,4,5,1,6,7,8,9,10};
int n = arr.length+1;
int sum=(n*(n+1))/2;
for(int i=0;i<arr.length;i++) {
	sum=sum-arr[i];
}
System.out.println("Missing number is"+sum);
}
	}


