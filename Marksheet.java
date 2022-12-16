package in.co.rays.Collection;

public class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet(String rollno,String name,int marks) {
		super();
		this.rollNo=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Marksheet[rollNo="+rollNo+",name="+name+",marks="+marks+"]";
		
		
	}

	
   @Override
	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);
	}
	

}
