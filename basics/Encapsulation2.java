package in.co.rays.basics;

import java.util.Date;

public class Encapsulation2 {
private String Account_no;
private String Balance;
private Date dateOfBirth;
public String getAccount_no() {
	return Account_no;
}
public void setAccount_no(String account_no) {
	Account_no = account_no;
}
public String getBalance() {
	return Balance;
}
public void setBalance(String Balance) {
	this.Balance = Balance;
}
public Date getDateOfBirth() {
	return dateOfBirth;//24/2/2022
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
}