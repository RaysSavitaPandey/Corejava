package in.co.rays.Advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MarksheetModel {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static ArrayList meritList() throws ClassNotFoundException, SQLException {
			ArrayList list = new ArrayList();
			ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.Bundle.system");
			Class.forName(rd.getString("Driver"));
			String user = rd.getString("user");
			String psw = rd.getString("password");
			String url = rd.getString("url");
			Connection con = DriverManager.getConnection(url, user, psw);
			PreparedStatement ps = con.prepareStatement("Select id,Roll_no,fname,lname,physics,chemistry,(physics+chemistry)as total from marksheet1 where physics>=33 && chemistry>=33 order by total desc limit 0,5");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MarksheetBean mb = new MarksheetBean();
				mb.setId(rs.getInt(1));
				mb.setRoll_no(rs.getInt(2));
				mb.setFName(rs.getString(3));
				mb.setLname(rs.getString(4));
				mb.setPhysics(rs.getInt(5));
				mb.setChemistry(rs.getInt(6));
				mb.setMaths(rs.getInt(7));

				list.add(mb);
			}
			return list;
		}

	}


