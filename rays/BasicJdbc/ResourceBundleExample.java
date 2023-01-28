package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
ResourceBundle rs=ResourceBundle.getBundle("in.co.rays.bundle.system");
Class.forName(rs.getString("Driver"));
String user = rs.getString("user");
String psw = rs.getString("password");
String url= rs.getString("url");

Connection con = DriverManager.getConnection(url,user,psw);
Statement st = con.createStatement();

int i=st.executeUpdate("insert into marksheet values(9,9876,'Shanu',80,90,90)");
System.out.println(i+"done");

con.close();

	}

}
