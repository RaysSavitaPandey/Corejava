package in.co.rays.bean;

import in.co.rays.MarksheetModel.MarksheetModel;

public class MarksheetTest{
	public static void main(String[]args) {
		testAdd();
	}
	public static void testAdd() {
		MarksheetBean bean=new MarksheetBean();
		MarksheetModel md=new MarksheetModel();
		bean.setId(11);
		bean.setRoll_no(1241);
		bean.setname("Kia");
		
		bean.setPhysics(90);
		bean.setChemistry(80);
		bean.setMaths(90);
		
		try {
			MarksheetBean b=new MarksheetBean();
			b=md.add(bean);
			if(b!=null)
			{
				System.out.println("Success");
			}
		}
		catch(Exception e)
			{
			System.out.println(e.getMessage());
			
		
   
		
			
	}
	}


}
