package in.co.rays.basics;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int m = 3;
		Method obj = new Method(); // Creating object of Method class
		int value = obj.sum(n, m);// function/Method calling
		System.out.println(value);
	}

//Instance Method are methods which require an object of its class to be 
//created before it can be called	
	public int sum(int a, int b) {
		return a + b;
	}

}
