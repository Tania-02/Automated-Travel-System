package pack;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Tour1DAO 
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
 public static List<Tour1> getRecords()
 {
	 List<Tour1> list=new ArrayList<Tour1>();
	 try{
		 Connection con=getConnection();
		  ps=con.prepareStatement("SELECT * FROM tour1");
	     	ResultSet rs=ps.executeQuery();
	     
         while(rs.next())
         {
        	 Tour1 s=new Tour1();
        	 s.setID(rs.getInt(1));
        	 s.setDestination(rs.getString(2));
        	 s.setOrigin(rs.getString(3));
        	 s.setSeat(rs.getInt(4));
        	 s.setMeal(rs.getInt(5));
        	 s.setTheme(rs.getString(6));
        	 s.setMonth(rs.getString(7));
        	 s.setPrice(rs.getDouble(8));
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
