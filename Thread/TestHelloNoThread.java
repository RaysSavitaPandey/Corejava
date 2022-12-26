package in.co.rays.Thread;

public class TestHelloNoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloNoThread t1=new HelloNoThread("Ram");
HelloNoThread t2=new HelloNoThread("Shyam");

t1.run();
t2.run();

	}

}
