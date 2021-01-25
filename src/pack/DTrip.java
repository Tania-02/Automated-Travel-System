package pack;
import java.sql.*;
import java.util.*;


public class DTrip
{

	static Connection con=null;

	static Statement s=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner (System.in);
	static int flag=0;
	public static void insert()
	{
		try
		{
		
		s=con.createStatement();
		/*System.out.print("Enter Serial Number :");
		int sr_no=sc.nextInt();*/
		System.out.print("Enter Date :");
		String date=sc.next();
		System.out.print("Enter Origin :");
		String origin=sc.next();
		System.out.print("Enter Destination :");
		String destination=sc.next();
		System.out.print("Enter Airlines :");
		String air=sc.next();
		System.out.print("Enter Price :");
		double price=sc.nextDouble();
		System.out.print("Enter Seats :");
		int seats=sc.nextInt();
		int i=s.executeUpdate("INSERT INTO DFlights VALUES('"+date+"','"+origin+"','"+destination+"','"+air+"',"+price+","+seats+")");
		if(i!=0)
			System.out.println("successfully updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void updatePrice()
	{
		System.out.print("Enter Origin & Destination where to Price to be updated : ");
		String origin=sc.next();
		String destination=sc.next();
		System.out.println("Updated Price value:");
		double p=sc.nextDouble();
		try
		{
			s=con.createStatement();
			rs=s.executeQuery("select * from DFlights");
			int i=s.executeUpdate("UPDATE DFlights SET PRICE="+p+" where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");
			if(i>0)
				System.out.println("Updated!!");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void updateSeats()
{
	System.out.print("Enter Origin & Destination where to Seats to be updated : ");
	String origin=sc.next();
	String destination=sc.next();
	System.out.println("Updated Seats :");
	int p=sc.nextInt();
	try
	{
		s=con.createStatement();
		rs=s.executeQuery("select * from DFlights");
		int i=s.executeUpdate("UPDATE DFlights SET SEATS_Availability="+p+" where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");
		if(i>0)
			System.out.println("Updated!!");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void updateDate()
{
	System.out.print("Enter Origin & Destination where to Date to be updated : ");
	String origin=sc.next();
	String destination=sc.next();
	System.out.println("Updated Date value:");
	String d=sc.next();
	try
	{
		s=con.createStatement();
		rs=s.executeQuery("select * from DFlights");
		int i=s.executeUpdate("UPDATE DFlights SET DATE="+d+" where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");
		if(i>0)
			System.out.println("Updated!!");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void updateAirlines()
{
	System.out.print("Enter Origin & Destination where to Airlines to be updated : ");
	String origin=sc.next();
	String destination=sc.next();
	System.out.println("Updated Airlines :");
	String air=sc.next();
	try
	{
		s=con.createStatement();
		rs=s.executeQuery("select * from IFlights");
		int i=s.executeUpdate("UPDATE DFlights SET FLIGHT='"+air+"' where ORIGIN ='"+origin+"' and DESTINATION='"+destination+"'");
		if(i>0)
			System.out.println("Updated!!");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void delete()
	{
		System.out.print("Enter origin & detination to delete:");
		String origin=sc.next();
		String destination=sc.next();
		try
		{
			s=con.createStatement();
			rs=s.executeQuery("select * from DFlights");
			int i=s.executeUpdate("delete from DFlights where ORIGIN='"+origin+"' and DESTINATION='"+destination+"'");
			if(i>0)
				System.out.println("Deleted!!");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	/*public static void change()
	{
		System.out.print("Enter origin & destination where to change:");
		String origin=sc.next();
		String destination=sc.next();
		System.out.print("Enter Price:");
	    double price=sc.nextDouble();
		try
		{
			int i=s.executeUpdate("delete from Flights where ORIGIN="+ORIGIN+");
			
			i=s.executeUpdate("insert into mytable values("+id+",'"+n+"',"+sal+")");
			if(i>0)
				System.out.println("Changed!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}*/
	public static void main(String args[])
	{
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/YOLO","tania","tania");
			//s=con.createStatement();
			while(true)
			{
				System.out.println("=====MENU=====");
				System.out.println("1.TO INSERT");
				System.out.println("2.TO UPDATE PRICE");
				System.out.println("3.TO UPDATE DATE");
				System.out.println("4.TO UPDATE SEATS");
				System.out.println("5.TO DELETE");
				System.out.println("6.TO EXIT");
				System.out.println("==============");
				System.out.println("ENTER YOUR CHOICE:");
				int ch=sc.nextInt();
			
				switch(ch)
				{
				case 1:insert();
						break;
				case 2:updatePrice();
						break;
				case 3:updateDate();
				        break;
				case 4:updateSeats();
		                break;
				case 5:delete();
						break;		
				case 6:
					   System.exit(0);
				default:
					System.out.println("Enter again!!!");
					break;
				}
			
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}