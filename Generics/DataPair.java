package in.co.rays.Generics;

public class DataPair<K,V> {

	K key;//declares a key Object of type K
	V value;//declares a value object of type V
	public DataPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	void showType() {
		System.out.println("Type of K is"+key.getClass().getName());
		System.out.println("Type of V is"+value.getClass().getName());
	}
	
	
}
