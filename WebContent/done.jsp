<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,pack.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
done
<% String book=request.getParameter("book");
if(book.equals("tour1"))
{	
	int id=(int)session.getAttribute("tour1id");
	int seat=(int)session.getAttribute("tour1seat");
	Tour1DAO.updateSeat(id,seat);
}
else if(book.equals("tour2"))
{
	int id=(int)session.getAttribute("tour2id");
	int seat=(int)session.getAttribute("tour2seat");
	Tour2DAO.updateSeat(id,seat);
}
else if(book.equals("bus"))
{
	int id=(int)session.getAttribute("busid");
	int seat=(int)session.getAttribute("busseat");
	Tour2DAO.updateSeat(id,seat);
	BusDAO.setSeat(id,seat);
}
else if(book.equals("cars"))
{	//double value=Double.parseDouble(request.getParameter("value"));
	//double price=(double)session.getAttribute("p");
	//price=price*value;
	//out.println("TOTAL PAYMENT++++++>>>>>"+price);
	int id=(int)session.getAttribute("carid");
	String origin=(String)session.getAttribute("origincar");
	String date=(String)session.getAttribute("datecar");
	CarsDAO.setRecords(origin,date,id);
	 String type=(String)session.getAttribute("typecar");
	//CarsDAO.add(id,price2,price1,type,seat,date);
		
		 //  CarsDAO.add(id,type,date);
		  	
}



%>
</body>
</html>