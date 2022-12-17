package in.co.rays.CollectionFramework;

import java.util.Comparator;

import in.co.rays.Collection.Marksheet;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.name.compareTo(m2.name);
	}
	

}
