package in.co.rays.Thread;

public class TestHelloThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloThread t1= new HelloThread("Ram"); 
HelloThread t2= new HelloThread("Shyam");

t1.start();
t2.start();
	}

}
