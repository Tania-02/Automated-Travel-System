package pack;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class HotelsDAO 
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
 
 public static List<TripH> getRecords(String str)
 {
	 List<TripH> list=new ArrayList<TripH>();
	 if("5-Star".equalsIgnoreCase(str))
	 {
	  try{
		 Connection con=getConnection(); 
		  ps=con.prepareStatement("SELECT * FROM 5Hotels");
	     	ResultSet rs=ps.executeQuery();
         while(rs.next())
         {
        	 TripH s=new TripH();
        	 s.setLocation(rs.getString(1));
        	 s.setName(rs.getString(2));
        	 s.setStar(rs.getString(3));
        	 s.setRooms(rs.getInt(4));
        	 s.setAddress(rs.getString(5));
        	 s.setPhone(rs.getInt(6));
        	 s.setPrice(rs.getInt(7));
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
	 else if("4-Star".equalsIgnoreCase(str))
	 {
		 try{
			 Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM 4Hotels");
		     	ResultSet rs=ps.executeQuery();
	         while(rs.next())
	         {
	        	 TripH s=new TripH();
	        	 s.setLocation(rs.getString(1));
	        	 s.setName(rs.getString(2));
	        	 s.setStar(rs.getString(3));
	        	 s.setRooms(rs.getInt(4));
	        	 s.setAddress(rs.getString(5));
	        	 s.setPhone(rs.getInt(6));
	        	 s.setPrice(rs.getInt(7));
        	 list.add(s);
	         }
			 con.close();
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex); 
		 }
		 return list;
	    }
	 else
	 {
		 try{
			 Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM 3Hotels");
		     	ResultSet rs=ps.executeQuery();
	         while(rs.next())
	         {
	        	 TripH s=new TripH();
	        	 s.setLocation(rs.getString(1));
	        	 s.setName(rs.getString(2));
	        	 s.setStar(rs.getString(3));
	        	 s.setRooms(rs.getInt(4));
	        	 s.setAddress(rs.getString(5));
	        	 s.setPhone(rs.getInt(6));
	        	 s.setPrice(rs.getInt(7));
        	 list.add(s);
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
public static void setRooms(int rooms,String star,String add)
 {
	 
	 try{
	       	 
			 Connection con=getConnection();
			if("5-Star".equalsIgnoreCase(star))
			{
			  ps=con.prepareStatement("SELECT * FROM 5HOTELS");
		     
		    rooms =200-rooms;
	          int i=ps.executeUpdate("UPDATE 5HOTELS SET Rooms_Available="+rooms+" where ADDRESS ='"+add+"'");	     	
	          if(i>0)
	      	    System.out.println("ROOMS UPDATED!!!");
			}
			else if("4-Star".equalsIgnoreCase(star))
			{
			  ps=con.prepareStatement("SELECT * FROM 4HOTELS");
		     
		    rooms =180-rooms;
	          int i=ps.executeUpdate("UPDATE 4HOTELS SET Rooms_Available="+rooms+" where ADDRESS ='"+add+"'");	     	
	          if(i>0)
	      	    System.out.println("ROOMS UPDATED!!!");
			}
			else
			{ps=con.prepareStatement("SELECT * FROM 3HOTELS");
		     
		    rooms =160-rooms;
	          int i=ps.executeUpdate("UPDATE 3HOTELS SET Rooms_Available="+rooms+" where ADDRESS ='"+add+"'");	     	
	          if(i>0)
	      	    System.out.println("SEATS UPDATED!!!");
			}
	   con.close();
	   
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex); 
		 }
  }
 }
