package in.co.rays.basics;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date today = new Date();
Calendar cal = Calendar.getInstance();
//Set to current time
cal.setTime(today);
//Get year of the date
int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
//Get yesterday's date
cal.add(Calendar.DATE, -1);
Date yesterday = cal.getTime();
//Getdate after 30 days
cal.add(Calendar.DATE,30);
Date nextEvent = cal.getTime();

	}

}
