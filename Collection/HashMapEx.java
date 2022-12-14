package in.co.rays.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap map = new HashMap();
map.put("1","One");
map.put(null,"Zero");
map.put("0",null);
map.put(null, null);
map.put("5","Three");
map.put("1","One");
map.put("3","Two");

System.out.println(map);
String val = (String)map.get("1");
System.out.println(val);

//map.remove("4");
Set keys = map.keySet();
for(Object k : keys) {
	System.out.println(k);
	Collection vals = map.values();
	for(Object v : vals) {
		System.out.println(v);
	}
	Set KeyValue = map.entrySet();
	for(Object ele : KeyValue) {
		Map.Entry pair = (Map.Entry)ele;
		System.out.println(pair.getKey()+ "-"+pair.getValue());
		//for(Object o : map.keySet()) {
			//System.out.println(map.get(o));
			//System.out.println(o+"="+map.get(o));
			
		
	}
}
}

}
