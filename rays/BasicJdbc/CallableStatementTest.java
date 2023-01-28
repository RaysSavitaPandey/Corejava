package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet1", "root", "root");
		CallableStatement cs = con.prepareCall("{call getdata(?)}");
		System.out.println("hi");
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.execute();
		System.out.println("hi");
		System.out.println(cs.getString(1));

		
	}

}
