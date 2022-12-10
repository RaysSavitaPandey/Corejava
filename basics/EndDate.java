package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EndDate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
Date date1=sdf.parse("30/11/2022");
Date date2=sdf.parse("29/11/2022");
if(date1.compareTo(date2)>0) {
	System.out.println("Date2 is less than date1");
}else if(date1.compareTo(date2)<0) {
	System.out.println("date2 is greater than date1");
	
}
}
 }

