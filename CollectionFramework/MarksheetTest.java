package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import in.co.rays.Collection.Marksheet;

public class MarksheetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList marksheets = new ArrayList();
//Marksheet m =new Marksheet(rollNo,name,marks)
		marksheets.add(new Marksheet("A4","Ram",89));//m1
		marksheets.add(new Marksheet("A2","Shyam",90));//m2
		marksheets.add(new Marksheet("A3","Mohan",80));//m3
		
		//Sort element by name
		OrderByName cName = new OrderByName();
		Collections.sort(marksheets,cName);
		
		//print element
		for(Object o:marksheets) {
			System.out.println(o);
		}
			//sort element by marks
			OrderByMarks cMarks = new OrderByMarks();
			Collections.sort(marksheets,cMarks);
			System.out.println("_______");
			
			//print
			for(Object o : marksheets) {
				System.out.println(o);
			}
			
			
		}
		
	}


