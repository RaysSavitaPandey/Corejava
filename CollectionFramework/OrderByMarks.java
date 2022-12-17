package in.co.rays.CollectionFramework;

import java.util.Comparator;

import in.co.rays.Collection.Marksheet;

public class OrderByMarks implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		if(m1.marks>m2.marks) {
		return -1;
		}else if (m1.marks == m2.marks) {
			return 0;
		}else {
			return 1;
			
		}
	}
	

}
