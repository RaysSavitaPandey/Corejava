package in.co.rays.oop;

public class Constructor {
private String Fname;//Riya
private String Lname;//Pandey
private int Id;

public String getFname() {
	return Fname;
}
public String getLname() {
	return Lname;
}
public int getId() {
	return Id;
}
//Parameterized Constructor
public Constructor(String Fname,String Lname,int Id) {
	this.Fname=Fname;//Riya
	this.Lname=Lname;
	this.Id=Id;
}
//Default Constructor
public Constructor() {
	super();
System.out.println("This is Default Constructor");
}
}