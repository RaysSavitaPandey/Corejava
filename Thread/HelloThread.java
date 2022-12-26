package in.co.rays.Thread;

public class HelloThread extends Thread {

	String name = null;
	
	public HelloThread(String n) {
		name=n;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(i+name);
			
		}
	}
}
