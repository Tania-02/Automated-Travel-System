package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/LoginServer")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text");
		   PrintWriter out=response.getWriter();
		   
		   
		   String pass=request.getParameter("password");
		   long phone=Long.parseLong(request.getParameter("ph"));
		   List<User> list=UserDAO.getRecords();
		   int flag=0;
		 
		   for(User s:list)
		   {
			   if(phone==s.getPhone()&&pass.equals(s.getPassword()))
			   {	flag=1;
				   response.sendRedirect("wel.html");		
				   break;
			   }
			   
		       
		   }
		   if(flag==0)
		   {	out.println("Wrong password or phone number entered!!!");
		   out.println("<a href='signin.html' >Please try again!</a>");
		   }
		   out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
