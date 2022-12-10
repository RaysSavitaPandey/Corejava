package in.co.rays.basics;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int no=0,sum=0;
  double avg=0,avg1=0,avg2=0;
  for(int i=1;i<=10;i++) {
if(i%2!=0) {
	sum=sum+i;
	avg=sum/10;
}else {
	sum=sum=i;
	avg1=sum/10;
}
  }
System.out.println("avg of N odd number is"+avg);
System.out.println("avg of N even number is"+avg1);
avg2=(avg1+avg)/10;
System.out.println("Total avg:"+avg2);

}
		  
  
  
  
	}


