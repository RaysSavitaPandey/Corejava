package in.co.rays.MarksheetModel;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ResourceBundle;

import in.co.rays.Bean1.MarksheetBeanEx;
import in.co.rays.bean.MarksheetBean;
	public class MarksheetModel{
	public MarksheetBeanEx add(MarksheetBeanEx bean)throws ClassNotFoundException,SQLException{

	
			ResourceBundle rd=ResourceBundle.getBundle("in.co.rays.bundle.system");
			Class.forName(rd.getString("Driver"));
			String user=rd.getString("user");
			String psw=rd.getString("password");
			String url=rd.getString("url");
	Connection con=DriverManager.getConnection(url,user,psw);
	PreparedStatement ps=con.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
	ps.setInt(1, bean.getId());
	ps.setInt(2, bean.getRoll_no());
	ps.setString(3, bean.getFname());

	ps.setInt(4, bean.getPhysics());
	ps.setInt(5, bean.getChemistry());
	ps.setInt(6, bean.getMaths());
	int i=ps.executeUpdate();
	return bean;

		}
		


		
		

		


	}




