package in.co.rays.basics;

import java.util.Date;

public class Encapsulation22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation2 en = new Encapsulation2();
en.setAccount_no("1234567890");
en.setBalance("10,000000");
en.setDateOfBirth(null);

String Account_no = en.getAccount_no();
System.out.println(Account_no);

String balance = en.getBalance();
System.out.println(balance);

Date DateOfBirth = en.getDateOfBirth();
System.out.println(DateOfBirth);
	}

}
