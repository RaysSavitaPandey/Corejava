package in.co.rays.ioStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLby1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader file = new FileReader("F:/read.txt");
BufferedReader in = new BufferedReader(file);
String line = in.readLine();
//System.out.println(line);
while(line!= null) {
	System.out.println(line);
	line = in.readLine();
}
in.close();
file.close();
	
}
	}


