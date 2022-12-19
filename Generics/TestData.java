package in.co.rays.Generics;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data<Integer> i = new Data<Integer>(1000);
i.showType();//Show type
int v = i.getValue();//No tyecast
System.out.println("Value"+v);

Data<String> str = new Data<String>("Riya Pandey");
str.showType();//show type
String val = str.getValue();//No typeCast
System.out.println("Value"+val);
	}

}
