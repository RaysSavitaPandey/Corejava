package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import in.co.rays.Bean.UserBean;

public class UserModel {
	public int nextPK() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.Systemm");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String psw = rb.getString("password");
		
		Connection con=DriverManager.getConnection(url,user,psw);
		
		int pk =0;
		PreparedStatement ps=con.prepareStatement("select max(id) from user1");
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			pk=rs.getInt(1);
		}
		ps.close();
		rs.close();
		con.close();
		return pk+1;
	}	
	
public void add(UserBean bean) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User1","root","root");
try {
	PreparedStatement ps=con.prepareStatement("insert into user1 values(?,?,?,?,?)");
	
	UserModel m=new UserModel();
		
ps.setInt(1,4);		
ps.setString(2,bean.getfname());
ps.setString(3, bean.getLname());
ps.setString(4,bean.getEmail());
ps.setString(5, bean.getPassword());

int i=ps.executeUpdate();
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
		con.close();
	}
	
}
public  static List getList() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User1","root","root");
	PreparedStatement ps=con.prepareStatement("select*from User1");
	
	ArrayList list=new ArrayList<UserBean>();
	//Iterator it=list.iterator();
ResultSet rs=ps.executeQuery();
UserBean bean = null;
while(rs.next()){
	 bean=new UserBean();
bean.setId(rs.getInt(1));
bean.setFname(rs.getString(2));
bean.setLname(rs.getString(3));
bean.setEmail(rs.getString(4));
bean.setPassword(rs.getString(5));
list.add(bean);
}

	return list;
}
public UserBean authenticate(String login,String pass) throws SQLException, ClassNotFoundException {
	ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.System");
	Class.forName(rb.getString("Driver"));
	String user = rb.getString("user");
	String psw = rb.getString("password");
	String url = rb.getString("url");

	Connection con = DriverManager.getConnection(url, user, psw);
	PreparedStatement ps = con.prepareStatement("select *from user1  where email=? and password=?");

	ps.setString(1,login);
	ps.setString(2,pass);
	UserBean b1=null;

	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		b1 = new UserBean();
	b1.setId(rs.getInt(1));
	b1.setFname(rs.getString(2));
	b1.setLname(rs.getString(3));
	b1.setEmail(rs.getString(4));
	b1.setPassword(rs.getString(5));
	}

	return b1;
}

public void update(UserBean bean) throws ClassNotFoundException, SQLException {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.System");
	Class.forName(rs.getString("Driver"));
	String url = rs.getString("url");
	String user = rs.getString("user");
	String pass = rs.getString("password");
	Connection con = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = con.prepareStatement("update user1 set fname = ? where lname = ?");
	ps.setString(1, bean.getfname());
	ps.setString(2, bean.getLname());
	int i = ps.executeUpdate();
}
}



