package in.co.rays.basics;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[] {20,80,90,60};
		int n;
		for(int i=0;i<arr.length;i++)
		{
	for(int j=i+1;j<arr.length;j++) 
	{
		if(arr[i]<arr[j]) 
		{
			 n =arr[i];
		arr[i]=arr[j];
		arr[j]=n;
		}
		}
		
System.out.println("Second Largest Element is"+arr[1]);
		}
	}
		}
	
	
	


