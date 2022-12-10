package in.co.rays.basics;

public class IfElseExLogicalOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 0;
    int b = 10;
    if(a>0 && b>0) {
    	System.out.println("Logical AND");
    } else {
    	System.out.println("Default block");
    	
    	if (a>0 || b>0) {
    		System.out.println("Logical AND");
    	}else {
    		System.out.println("Default block");
    	}
    }
	}

}
