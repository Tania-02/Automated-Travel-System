package pack;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CarsDAO 
{   static 	int i;
	static Connection con=null;
	static PreparedStatement ps=null;
	public static Connection getConnection()
	{
		 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/YOLO","tania","taniat");
			System.out.println("conneted");
			}
		catch(Exception e){System.out.println(e);}
	return con;
	}
	public static int setSeat(int x,int id)
	 {
		 try{
			 	Connection con=getConnection();
			 	ps=con.prepareStatement("SELECT * FROM dCar");
			 	int i=ps.executeUpdate("UPDATE dCar SET cars="+x+" where id ="+id);
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
	public static void setRecords(String o, String d,int id)
	 {
		 try{
			 	Connection con=getConnection();
			 	ps=con.prepareStatement("SELECT * FROM dCar");
			 	int i=ps.executeUpdate("UPDATE dCar SET origin='"+o+"' where id ="+id);
			 	
			 	i=ps.executeUpdate("UPDATE dCar SET date='"+d+"' where id ="+id);
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
 public static List<Cars> getRecords()
 {
	 List<Cars> list=new ArrayList<Cars>();
		 try{
			  con=getConnection(); 
			  ps=con.prepareStatement("SELECT * FROM dCar");//
		     	ResultSet rs=ps.executeQuery();
	         while(rs.next())
	         {
	        	 Cars s=new Cars();
	        	 s.setDate(rs.getString(1));
	        	 s.setOrigin(rs.getString(2));
	        	 s.setPrice2(rs.getDouble(3));
	        	// s.setDestination(rs.getString(3));
	        	 s.setPrice(rs.getDouble(4));
	        	 s.setType(rs.getString(5));
	        	 s.setCars(rs.getInt(6));
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
	public static void add(int x, double p,double p2,String t,int s,String d)
	 {
		 try{
			 	Connection con=getConnection();
			 	ps=con.prepareStatement("SELECT * FROM dCar");
			 	int i=ps.executeUpdate("insert into dcar values('"+d+"','origin',"+p2+","+p+",'"+t+"','"+s+"',"+x+")");
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
  }

