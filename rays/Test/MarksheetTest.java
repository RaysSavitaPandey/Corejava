package in.co.rays.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.Bean1.MarksheetBeanEx;
import in.co.rays.MarksheetModel.MarksheetModel;

public class MarksheetTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		testAdd();
//		testMeritList();

	}
public static void testAdd()
{
	MarksheetBeanEx bean= new MarksheetBeanEx();
	MarksheetModel md= new MarksheetModel();
	
	bean.setRoll_no(199);
	bean.setFname("Dheeraj");
	bean.setLname("kumar");
	bean.setPhysics(100);
	bean.setChemistry(90);
	bean.setMaths(80);
	try {
		MarksheetBeanEx b=new MarksheetBeanEx();
		b=md.add(bean);
		if(b!=null)
		{
			System.out.println("sucess");
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
public static void testMeritList() throws ClassNotFoundException, SQLException
{MarksheetBeanEx mb = new MarksheetBeanEx();
MarksheetModel mm = new MarksheetModel();
ArrayList list= new ArrayList();
//list= (ArrayList) mm.meritList();
Iterator it = list.iterator();
while (it.hasNext()) {
	mb = (MarksheetBeanEx) it.next();
	System.out.print(mb.getId()+"\t");
	System.out.print(mb.getRoll_no()+"\t");
	System.out.print(mb.getFname()+"\t");
	System.out.print(mb.getLname()+"\t");
	System.out.print(mb.getPhysics()+"\t");
	System.out.print(mb.getChemistry()+"\t");
	System.out.println(mb.getMaths());
}
}
}




