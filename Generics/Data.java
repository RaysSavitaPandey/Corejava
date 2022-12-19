package in.co.rays.Generics;
//T is a type variable that will br replaced by a type class when Object of this class is Created
public class Data<T> {
	T value;//Declare an Object of T type
	public Data(T val) {//passes parameter of typ T
		value = val;
	}
	T getValue() {
		return value;
	}
	void showType() {//shows dataTypes of stored Object
		System.out.println("Type of T is"+value.getClass().getName());
		
	}

}
