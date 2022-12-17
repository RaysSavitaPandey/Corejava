package in.co.rays.CollectionFramework;

public class HashCodeNEquals implements Comparable<HashCodeNEquals>{
	public String rollNo;
	public String name;
	public int marks;
	
	public HashCodeNEquals(String rollNo,String name,int marks) {
		this.rollNo =rollNo;
		this.name =name;
		this.marks=marks;
	}
	public boolean equals(Object o) {
		if(o==null)
			return false;
		if(!(o instanceof HashCodeNEquals))
			return false;
		HashCodeNEquals other =(HashCodeNEquals)o;
		return this.rollNo.equals(other.rollNo);
	}
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rollNo.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+" "+name+" "+marks;
	}
	@Override
	public int compareTo(HashCodeNEquals o) {
		// TODO Auto-generated method stub
		return rollNo.compareTo(o.rollNo);
	}

}
