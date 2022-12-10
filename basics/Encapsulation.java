package in.co.rays.basics;
//Bean  class-private attributes & public getter/setter method
public class Encapsulation {
private String fname;//ram
private String lname;
private int id;

public String getFname() {//Getter  method-return type
	return fname;//ram
}
public void setFname(String Fname) {//Setter method-parameter data
	this.fname=Fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname=lname;
}
public int getId() {
	return id;//1
}
public void setId(int Id) {
	this.id=Id;
}


}

