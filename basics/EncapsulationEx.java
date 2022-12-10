package in.co.rays.basics;

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation en = new Encapsulation();
en.setFname("Ram");
en.setLname("XYZ");
en.setId(1);

String Fname = en.getFname();
System.out.println(Fname);

String Lname = en.getLname();
System.out.println(Lname);

int id = en.getId();
System.out.println(id);




	}

}
