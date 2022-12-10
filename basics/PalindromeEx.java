package in.co.rays.basics;

public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m= 545;
		int n = m;
		int rev = 0,Z;
		while(n>0) {
			Z=n%10;
			rev=rev*10+Z;
			n=n/10;
		}if(m==rev) {
			System.out.println(m+"is palindrome number");
		}else {
			System.out.println(m+"is not a palindrome number");
		
		}

	}

}
