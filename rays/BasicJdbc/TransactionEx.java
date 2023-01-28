package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		try {

			con.setAutoCommit(false);
			Statement st = con.createStatement();
			String s1 = "insert into marksheet values(9,1198,'Monica',90,90,90)";
			String s2 = "update marksheet set fname='savita' where id=3";
			String s3 = "insert into marksheet values(10,2345,'Monica',90,90,90)";
			
			int i = st.executeUpdate(s1);
			i = st.executeUpdate(s2);
			i = st.executeUpdate(s3);
			
			System.out.println("success");
			con.commit();
		} catch (SQLException e) {

			con.rollback();
		System.out.println("Transaction fail");
		}
	}

}
