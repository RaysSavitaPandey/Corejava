package in.co.rays.Advancejava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class MarksheetTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void testMeritList() throws ClassNotFoundException, SQLException {
			MarksheetBean mb = new MarksheetBean();
			MarksheetModel mm = new MarksheetModel();
			ArrayList list = new ArrayList();
			list = (ArrayList) mm.meritList();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				mb = (MarksheetBean) it.next();
				System.out.print(mb.getId() + "\t");
				System.out.print(mb.getRoll_no() + "\t");
				System.out.print(mb.getFname() + "\t");
				System.out.print(mb.getLname()+"\t");
				System.out.print(mb.getPhysics() + "\t");
				System.out.print(mb.getChemistry() + "\t");
				System.out.println(mb.getMaths()+"\t");

			}
		}

	}


