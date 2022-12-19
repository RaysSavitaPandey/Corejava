package in.co.rays.Generics;

public class TestDataPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DataPair<String,Integer>i =new DataPair<String,Integer>("Riya",1000);
i.showType();//ShowType
System.out.println(i.getKey());
System.out.println(i.getValue());

	}

}
