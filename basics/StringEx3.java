package in.co.rays.basics;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
	int totalcount = s.length();
	int totalcount_afterRemove=s.replace("o","").length();
	int count=totalcount-totalcount_afterRemove;
	System.out.println("Number occurance of a is:"+count);
	}
		
		}


