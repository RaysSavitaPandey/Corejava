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
 * Servlet implementation class UserCtl
 */
@WebServlet(urlPatterns = "/UserCtl")
public class UserCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String e=request.getParameter("email");
		String password=request.getParameter("psw");
UserBean b=new UserBean();
UserCtl m=new UserCtl();

b.setFname(fname);
b.setLname(lname);
b.setEmail(e);
b.setPassword(password);

try {
	System.out.println("hi");
	m.add(b);
	
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
	rd.forward(request, response);
	System.out.print(b.getfname());
	System.out.println("data inserted");
}
catch(Exception e1)
{
	e1.getMessage();
}
}
	private void add(UserBean b) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
