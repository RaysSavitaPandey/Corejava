package in.co.rays.basics;

public class ExerciseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= new int[]{30,20,40,80};
int max =arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max)
		max=arr[i];
	
}
System.out.println("Largest element is present in given array:"+max);
}
	}


