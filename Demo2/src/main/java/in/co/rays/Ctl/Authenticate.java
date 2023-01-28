package in.co.rays.Ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import in.co.rays.Bean.UserBean;
import in.co.rays.model.UserModel;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authen")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s=request.getSession();
		String email = request.getParameter("email");
		String psw = request.getParameter("psw");
		
		
			UserBean b = new UserBean();
			UserModel m = new UserModel();

			
			b.setEmail(email)

;
			b.setPassword(psw);
			System.out.println("what happened S/F");
			UserBean b1;
			try {
				
				UserBean bean=m.authenticate(email,psw);
				if(bean!=null)
				{
					RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
					s.setAttribute("name",bean.getfname());
					rd.forward(request, response);
					
				}
				else {
					request.setAttribute("errr", "invalid ID & Password");
					RequestDispatcher rd1=request.getRequestDispatcher("LoginUser.jsp");
					
					rd1.forward(request, response);
					
				}
			} catch (Exception e1) {
				e1.getMessage();
			}
	}


	}


