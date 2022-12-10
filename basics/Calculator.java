package in.co.rays.basics;

public class Calculator {
	
	public static void main(String[] args) {
		
		boolean c = true;
		
		String s = "-";
		
		int a = 20;
		int b = 20;
		
		if(s=="+") {
			
			System.out.println(a+b);
		}else if(s=="-") {
			
			System.out.println(a-b);
		}else if(s=="*") {
			
			System.out.println(a*b);
		}else if(s=="/") {
			
			System.out.println(a/b);
		}
		
		
	}

}
