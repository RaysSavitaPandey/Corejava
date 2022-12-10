package in.co.rays.basics;

public final class ImmutableClass{
	 private int id;
	 private final String name;
	 
	 public int getId() {
		 return id;
	 }
public String getName() {
	return name;
}
public ImmutableClass(int i,String s) {
	this.id = i;
	this.name =s;
}
public static void main(String[]args) {
	ImmutableClass a = new ImmutableClass(1,"Ram");
	System.out.println(a.name=="Ram");
	System.out.println(a.id==1);
	a.id = 34;
	System.out.println(a.id);
}
		 
		 
	 }
	 
	 
	 