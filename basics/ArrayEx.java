package in.co.rays.basics;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []arr = new int[4];
   arr[0]=1;
   arr[1]=2;
   arr[2]=3;
   arr[3]=4;
   
   int []arr1 = {1,2,3,4};
   int element = arr[1];
   System.out.println("element at 1st index is"+element);
   
   int size = arr.length;
   System.out.println("size of the defined array is"+size);
	

char[]CopyFrom= {'S','U','N','R','A','Y','S'};
char[]CopyTo= new char[4];
System.arraycopy(CopyFrom, 3, CopyTo,0,4);
System.out.println(CopyFrom);
System.out.println(CopyTo);

for(int i=0;i<4;i++) {
	System.out.println(arr[i]);
}
for(char c:CopyTo) {
	System.out.println(c);
}
}
}