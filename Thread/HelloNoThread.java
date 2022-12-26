package in.co.rays.Thread;

public class HelloNoThread {

	String name = null;
	
	public HelloNoThread(String n){
		name= n;
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+name);
		}
		
		
	}
}
