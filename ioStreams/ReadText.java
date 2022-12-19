package in.co.rays.ioStreams;

import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader in = new FileReader("F:/read.txt");
int ch = in.read();
while(ch!=-1) {
	
	System.out.println((char)ch);
	ch = in.read();
}
in.close();
	
}
	}


