package in.co.rays.basics;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 123;
int remainder,revNumber=0;
while(number>0) {
	remainder= number %10;
	number = number/10;
	revNumber = (revNumber*10)+remainder;
}
System.out.printf("RevNumber is %d",revNumber);

	}

}
