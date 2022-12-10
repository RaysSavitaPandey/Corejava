package in.co.rays.basics;
import java.time.*;
import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate dob = LocalDate.of(1988, 12, 13);
LocalDate curDate = LocalDate.now();
Period period = Period.between(dob,curDate);
System.out.printf("Your age os %d years %d months and %d days.",period.getYears(),period.getMonths(),period.getDays());
	}

}
