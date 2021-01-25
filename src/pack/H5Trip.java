package pack;
import java.sql.*;
import java.util.*;

public class H5Trip
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
		System.out.print("Enter Location :");
		String loc=sc.next();
		System.out.print("Enter Name :");
		String name=sc.next();
		System.out.print("Enter Star :");
		String star=sc.next();
		System.out.print("Enter Rooms_Avialable :");
		int rooms=sc.nextInt();
		System.out.print("Enter Address :");
		String add=sc.next();
		System.out.print("Enter Phone :");
		long phone=sc.nextLong();
		System.out.print("Enter Price :");
		double price=sc.nextDouble();
		int i=s.executeUpdate("INSERT INTO 5HOTELS VALUES('"+loc+"','"+name+"','"+star+"',"+rooms+",'"+add+"',"+phone+","+price+")");
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
		System.out.print("Enter ADDRESS : ");
		
		String add=sc.next();
		System.out.println("Updated Price value:");
		double p=sc.nextDouble();
		try
		{
			s=con.createStatement();
			rs=s.executeQuery("select * from 5HOTELS");
			int i=s.executeUpdate("UPDATE 5HOTELS SET PRICE="+p+" where ADDRESS ='"+add+"'");
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
		System.out.print("Enter ADDRESS:");
         String add=sc.next();
		try
		{
			s=con.createStatement();
			rs=s.executeQuery("select * from 5HOTELS");
			int i=s.executeUpdate("delete from 5HOTELS where ADDRESS='"+add+"'");
			if(i>0)
				System.out.println("Deleted!!");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
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
				System.out.println("3.TO DELETE");
				System.out.println("4.TO EXIT");
				System.out.println("==============");
				System.out.println("ENTER YOUR CHOICE:");
				int ch=sc.nextInt();
			
				switch(ch)
				{
				case 1:insert();
						break;
				case 2:updatePrice();
						break;
				case 3:delete();
						break;		
				case 4:
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