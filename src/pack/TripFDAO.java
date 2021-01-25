package pack;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TripFDAO 
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
 
 public static List<TripF> getRecords(String str)
 {
	 List<TripF> list=new ArrayList<TripF>();
	 if("Domestic".equals(str))
	 {
	  try{
		 Connection con=getConnection(); 
		  ps=con.prepareStatement("SELECT * FROM DFlights");
	     	ResultSet rs=ps.executeQuery();
         while(rs.next())
         {
        	 TripF s=new TripF();
    
        	 s.setDate(rs.getString(1));
        	 s.setOrigin(rs.getString(2));
        	 s.setDestination(rs.getString(3));
        	 s.setFlight(rs.getString(4));
        	 s.setPrice(rs.getDouble(5));
        	 s.setSeats(rs.getInt(6));
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
	 else
	 {
		 try{
			 Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM IFlights");
		     	ResultSet rs=ps.executeQuery();
	         while(rs.next())
	         {
	        	 TripF s=new TripF();
	        	 s.setId(rs.getInt(1));
	        	 s.setDate(rs.getString(2));
	        	 s.setOrigin(rs.getString(3));
	        	 s.setDestination(rs.getString(4));
	        	 s.setFlight(rs.getString(5));
	        	 s.setPrice(rs.getDouble(6));
	        	 s.setSeats(rs.getInt(7));
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
public static void setSeats(int seats,String str,String origin,String destination)
 {
	 
	 //List<TripF> list=new ArrayList<TripF>();
	 try{
	 if("Domestic".equals(str))
	 {
		 
			 Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM DFlights");
		     //	ResultSet rs=ps.executeQuery();
		seats =180-seats;
	  int i=ps.executeUpdate("UPDATE DFlights SET Seats_Availabilty="+seats+" where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");	     	
	  if(i>0)
	    System.out.println("SEATS UPDATED!!!");
	 }	 
	 else
	 {   Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM IFlights");
		     	//ResultSet rs=ps.executeQuery();
		 seats=230-seats;
		 int i=ps.executeUpdate("UPDATE IFlights SET Seats_Availabilty="+seats+" where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");	
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
