package pack;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class UserDAO 
{   static 	int i;
	static Connection con=null;
	static PreparedStatement ps=null;
	public static Connection getConnection()
	{
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/YOLO","tania","tania");
		}
    catch(Exception e){System.out.println(e);
    }
	return con;
   }
 public static void setRecords(String name, String email, long phone,String uname, String pass)
 {
	 try{
		 	Connection con=getConnection();
		 	ps=con.prepareStatement("SELECT * FROM user");
		 	int i=ps.executeUpdate("INSERT INTO user VALUES('"+name+"','"+email+"',"+phone+",'"+uname+"','"+pass+"','null')");
		 	if(i!=0)
		 	{
		 		System.out.println("successfully updated");
		 	}
	 	}
		catch(Exception e)
		{
			System.out.println(e);
		}
 }
 public static List<User> getRecords()
 {
	 List<User> list=new ArrayList<User>();
	 try{
		 Connection con=getConnection();
		  ps=con.prepareStatement("SELECT * FROM user");//
	     	ResultSet rs=ps.executeQuery();
	     //	System.out.println("hgfy");
         while(rs.next())
         {
        	// System.out.println("hgfy");
        	 User s=new User();
        	 s.setName(rs.getString(1));
        	 s.setEmail(rs.getString(2));
        	 s.setPhone(rs.getInt(3));
        	 s.setUsername(rs.getString(4));
        	 s.setPassword(rs.getString(5));
        	 s.setBookingid(rs.getString(6));
        	 
        	 list.add(s);
        	 System.out.println(s);
         }
		 con.close();
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex); 
	 }
	 return list;
 }
}