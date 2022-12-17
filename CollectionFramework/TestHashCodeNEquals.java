package in.co.rays.CollectionFramework;

public class TestHashCodeNEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashCodeNEquals h1 = new HashCodeNEquals("A1","Shreya",95);
HashCodeNEquals h2 = new HashCodeNEquals("A2","Sayna",91);

System.out.println(h1.hashCode());
System.out.println(h2.hashCode());

if(h1.hashCode()==h2.hashCode()) {
	
	if(h1.equals(h2)) {
		System.out.println("both are same");
	}
}else {
	System.out.println("both are not same");
	}
	
}
	}


