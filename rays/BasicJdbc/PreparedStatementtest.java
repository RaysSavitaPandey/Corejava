package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementtest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
PreparedStatement stmt=con.prepareStatement("Select *from marksheet");
ResultSet rs=stmt.executeQuery();
while(rs.next()) {
	System.out.print(rs.getInt(1)+"\t");
	System.out.print(rs.getInt(2)+"\t");
	System.out.print(rs.getString(3)+"\t");
	System.out.print(rs.getInt(4)+"\t");
	System.out.print(rs.getInt(5)+"\t");
	System.out.println(rs.getInt(6));

}
con.close();
rs.close();
	}

}
