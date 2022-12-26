package in.co.rays.Thread;

public class PriorityThread extends Thread{
	
	public PriorityThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(getName()+" "+getPriority());
			
		}
	}

}
