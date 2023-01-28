package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
Statement stmt=con.createStatement();
int i=stmt.executeUpdate("insert into marksheet values(3,3456,'Disha',90,90,90)");
System.out.println(i+" "+"data inserted");
stmt.close();
con.close();
	}

}
