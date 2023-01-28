package in.co.rays.Ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.UserBean;
import in.co.rays.model.UserModel;

/**
 * Servlet implementation class ClrlUser
 */
@WebServlet("/ClrlUser")
public class ClrlUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClrlUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
	    //String d1 = request.getParameter("dob");
//		HttpSession s = request.getSession();
		UserBean bean = new UserBean();
		UserModel md = new UserModel();
		
		//Date dob = Date.valueOf(d1);
		
//		bean.setFname(fname);
//		bean.setLname(lname);
//		bean.setEmail(email)

//		bean.setPassword(password);
//		try {
//			//bean.setDob(dob);
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		String op = request.getParameter("Operation");
		System.out.println(op);
		try {
			if(op.equals("insert")) {
				bean.setFname(fname);
				bean.setLname(lname);
				bean.setEmail(email)
;
				bean.setPassword(password);
				md.add(bean);
				RequestDispatcher rs = request.getRequestDispatcher("Registration.jsp");
				request.setAttribute("OK", "Data Enter Successfully");
				rs.forward(request, response);
				System.out.println("Data inserted");	
			}else if(op.equals("delete")) {
				bean.setFname(fname);
				bean.setLname(lname);
				//md.delete(bean);
				RequestDispatcher rs = request.getRequestDispatcher("Registration.jsp");
				request.setAttribute("OK", "Data deleted Successfully");
				rs.forward(request, response);
			}else if(op.equals("update")) {
				bean.setFname(fname);
				bean.setLname(lname);
				md.update(bean);
				RequestDispatcher rs = request.getRequestDispatcher("Registration.jsp");
				request.setAttribute("OK", "Data Updated Successfully");
				rs.forward(request, response);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}					}


	

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
