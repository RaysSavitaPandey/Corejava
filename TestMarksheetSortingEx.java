package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestMarksheetSortingEx {

	public static void main(String[] args) {
		
ArrayList marksheets = new ArrayList();

//Marksheet m = new Marksheet(rollNo,name,marks)

marksheets.add(new Marksheet("A4","Ram",89));//m1

marksheets.add(new Marksheet("A3","Shyam",90));//m2

marksheets.add(new Marksheet("A2","Mohan",80));//m3

//sorts element by comparable
Collections.sort(marksheets);

//print all element
for(Object o : marksheets) {
	System.out.println(o);
	
}
	}

}
