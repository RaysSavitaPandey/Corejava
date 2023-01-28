package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleCallable2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheetex", "root", "root");
		CallableStatement cs = con.prepareCall("{call Demo(?,?)}");
		cs.setInt(1, 10);
		cs.registerOutParameter(2, Types.VARCHAR);
		System.out.println("hi");
//ResultSet rs =cs.getResultSet();
		cs.execute();
		String name = cs.getString(2);
		System.out.println("hi");
		System.out.println(name);
//System.out.println(rs.getInt(2));
	}

}
