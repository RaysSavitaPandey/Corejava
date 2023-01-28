package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableWithPram {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysqljdbc.Drive");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
	CallableStatement cs = con.prepareCall("{call getNameof(??)}");
Scanner sc=new Scanner(System.in);
System.out.println("Enter id to get name");
int id=sc.nextInt();
cs.setInt(1,id);//set the id to get name
cs.registerOutParameter(2,Types.VARCHAR);
cs.execute();
String nm=cs.getString(2);
System.out.println("Name"+" "+nm);
cs.close();
con.close();


	}

}
