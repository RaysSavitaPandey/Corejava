package in.co.rays.Thread;

public class TestPriorityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityThread t1 = new PriorityThread("ThreadA");
PriorityThread t2 = new PriorityThread("ThreadB");
PriorityThread t3 = new PriorityThread("ThreadC");

t1.setPriority(5);
t2.setPriority(8);
t3.setPriority(3);

t1.start();
t2.start();
t3.start();
	}

}
