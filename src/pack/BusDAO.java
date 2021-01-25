package pack;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class BusDAO 
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

	public static int setSeat(int x,int s)
	 {
		 try{
			 	Connection con=getConnection();
			 	ps=con.prepareStatement("SELECT * FROM dCar");
			 	int i=ps.executeUpdate("UPDATE dCar SET seats="+s+" where id ='"+x+"'");
			 	if(i!=0)
			 	{
			 		System.out.println("successfully updated");
			 	}
		 	}
			catch(Exception e)
			{
				System.out.println(e);
			}
		 return i;
	 }
 public static List<Bus> getRecords()
 {
	 List<Bus> list=new ArrayList<Bus>();
		 try{
			 Connection con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM Dbus");//
		     	ResultSet rs=ps.executeQuery();
	         while(rs.next())
	         {
	        	 Bus s=new Bus();
	        	 
	        	 s.setOrigin(rs.getString(1));
	        	 s.setDestination(rs.getString(2));
	        	 s.setType(rs.getString(2));
	        	 s.setRate(rs.getDouble(4));
	        	 s.setSeats(rs.getInt(5));
	        	 s.setDept(rs.getString(6));
	        	 s.setID(rs.getInt(7));
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


