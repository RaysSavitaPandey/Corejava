package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) throws Exception  {
		//Gives current Date in java's format
		Date d=new Date();
		System.out.println(d);
//Date Formatting into our format
SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
String str = sdf.format(d);
//Parsing date into java's format
String a = "28/11/22";
System.out.println(a);
Date d1 = sdf.parse(a);
System.out.println(d1);
		

	}

}
