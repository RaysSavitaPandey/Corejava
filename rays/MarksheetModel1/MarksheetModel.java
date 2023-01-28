package in.co.rays.MarksheetModel1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import in.co.rays.Bean1.MarksheetBeanEx;


public class MarksheetModel {
	public Integer nextPK() throws ClassNotFoundException, SQLException{
		// log.debug("Model nextPK Started");
		ResourceBundle rd=ResourceBundle.getBundle("in.co.rays.bundle.system");
		Class.forName(rd.getString("Driver"));
		String user=rd.getString("user");
		String psw=rd.getString("password");
		String url=rd.getString("url");
Connection con=DriverManager.getConnection(url,user,psw);
		int pk = 0;

		try {
			
			PreparedStatement pstmt = con.prepareStatement("SELECT MAX(ID) FROM marksheet");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();

		} catch (Exception e) {
			System.out.println("exception of getting pk");
		} 
		// log.debug("Model nextPK End");
		return pk + 1;
	}
	public MarksheetBeanEx add( MarksheetBeanEx bean) throws Exception
	{
		ResourceBundle rd=ResourceBundle.getBundle("in.co.rays.bundle.system");
		Class.forName(rd.getString("Driver"));
		String user=rd.getString("user");
		String psw=rd.getString("password");
		String url=rd.getString("url");
Connection con=DriverManager.getConnection(url,user,psw);
PreparedStatement ps=con.prepareStatement("insert into marksheet001 values(?,?,?,?,?,?,?)");
ps.setInt(1,nextPK());
ps.setInt(2, bean.getRoll_no());
ps.setString(3, bean.getFname());
ps.setString(4, bean.getLname());
ps.setInt(5, bean.getPhysics());
ps.setInt(6, bean.getChemistry());
ps.setInt(7, bean.getMaths());
int i=ps.executeUpdate();
return bean;

	}
	
public static ArrayList meritList() throws ClassNotFoundException, SQLException
{
	ArrayList list=new ArrayList();
	ResourceBundle rd=ResourceBundle.getBundle("in.co.rays.bundle.system");
	Class.forName(rd.getString("Driver"));
	String user=rd.getString("user");
	String psw=rd.getString("password");
	String url=rd.getString("url");
Connection con=DriverManager.getConnection(url,user,psw);
PreparedStatement ps=con.prepareStatement("Select *from marksheet001 ");
ResultSet rs=ps.executeQuery();
while (rs.next()) {
		MarksheetBeanEx mb = new MarksheetBeanEx();
		mb.setId(rs.getInt(1));
		mb.setRoll_no(rs.getInt(2));
		mb.setFname(rs.getString(3));
		mb.setLname(rs.getString(4));
		mb.setPhysics(rs.getInt(5));
		mb.setChemistry(rs.getInt(6));
		mb.setMaths(rs.getInt(7));
		list.add(mb);
}
return list;
}

	
	

	

}






