package pack;
import java.io.*;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServer
 */
@WebServlet("/UserServer")
public class UserServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out=response.getWriter();
		   
		   String fname=request.getParameter("fname");
		   String lname=request.getParameter("lname");
		   String name=fname+" "+lname;
		   String email=request.getParameter("email");
		   String pass=request.getParameter("password");
		   long phone=Long.parseLong(request.getParameter("phone"));
		   String uname=request.getParameter("user_name");
		   //UserDAO obj =new UserDAO();
		   List<User> list=UserDAO.getRecords();
		   int flag=1;
		 
		   for(User s:list)
		   {
			   if(phone==s.getPhone())
			   {	flag=0;
			   out.print("<HTML>");
			   out.print("<HEAD><TITLE></TITLE></HEAD>");
			   out.print("<BODY>");		  
			
			   out.println("Already You Have An account!!!");
			   out.println("<a href='signin.html' >Sign IN!</a>");
			   out.print("</HTML>");
			//   out.print("<HEAD><TITLE></TITLE></HEAD>");
			   out.print("</BODY>");		  
			
				   break;
			   }
			   
		       
		   }
		   if(flag==1)
		   {	
			   UserDAO.setRecords(name,email,phone,uname,pass);
			   response.sendRedirect("wel.html");  
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
