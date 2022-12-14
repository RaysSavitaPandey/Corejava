package in.co.rays.Collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap map = new TreeMap();

map.put("101","One");
map.put("103","Three");
map.put("105","Five");
map.put("102","Two");
map.put("104","Four");
//map.put(null,"Four");

for(Object o : map.keySet()) {
	//System.out.println(map.get(o));
	System.out.println(o+"="+map.get(o));
	
	
}
	}

}
