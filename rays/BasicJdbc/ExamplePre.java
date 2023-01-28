package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExamplePre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
//PreparedStatement stmt =con.prepareStatement("insert into marksheet values(10,3456,'Disha',90,90,90)");
PreparedStatement stmt =con.prepareStatement("Delete from marksheet where id=1");
int i=stmt.executeUpdate();

System.out.println(i+" "+"data inserted");
con.close();
	}

}
