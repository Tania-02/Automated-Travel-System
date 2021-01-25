<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="blueberry.css" />
	<style type="text/css">
.{
		margin:0;
		border:0;
		padding:0;
	}
	body
	{
		background-image:url("0ca3907a9c69761b8d70128fa7a84621.jpg");
		background-size:cover;
		font:14px/20px Arial,San-Serif;
		color:#555;
		margin:0;
	}
	p
	{
		text-align:center;
		color:black;
	}
	h1
	{
		text-align:center;
		font-size:200%;
		line-height:120%;
		padding:5% 0;
		color:white;
		text-shadow:2px 2px 2px #000000;
	}
	h2
	{
		text-decoration:underline;
		line-height:280%;
		padding-left:2%;
		text-align:center;
		
	}
	h3
	{
		line-height:110%;
		padding-left:5%;
		text-alignment:center;
	}
	p
	{
		padding-left:1%;
		text-align:center;
	}
	a
	{
		color:#fff;
		text-decoration:none;
		font-weight:bold;
	}
	a:hover
	{
	 font-color:#fff;
	 text-decoration:underline;
	}
	#s
	{
		color:blue;
		text-decoration:underline;
	}
	#sign
	{
		padding:5px;
		text-align:left;
	}
	header
	{
		background:#405580;
		width:100%;
		height:90px;
		position:fixed;
		top:0;
		left:0;
		z-index:100;
		opacity:.90;
	}
	#logo
	{
		float:left;
		width:155px;
		height:50px;
		
	}
	section
	{
		width:29%;
		float:left;
		margin:2% 2%;
		text-align:center;
		img-align:center;
		
		
	}
	input[type="text"]
	{
		text-align:center;
		color:black;
		BORDER:2PX SOLID BLACK;
		BORDER-RADIUS:4PX;
		
	}
	input[type="submit"]
	{
		text-align:center;
		color:black;
		BORDER-RADIUS:4PX;
		SHADOW:5PX GREY;
		BACKGROUND:white;
	}
	input[type="password"]
	{
		text-align:center;
		color:#a3a8ab;
		BORDER:2PX SOLID BLACK;
		BORDER-RADIUS:4PX;
	}
	form
	{
		text-align:center;
		margin-top:20px;
		margin-left:200px;
		color:white;
		text-shadow:2px 2px 2px #000000;
	}
	img
	{
		text-align:center;
		max-width:100%;
		height:auto;
		width:auto;
        display: block;
		margin:auto;
	}
	nav
	{
		
		float:right;
		padding:35px 20px 20px;
	}
	#menu-icon
	{
		display:hidden;
		
		width:40px;
		height:40px;
		background:url("");
	}
	a:hover#menu-icon
	{
		border-radius:4px 0 0;
	}
	ul
	{
		list-style:none;
	}
	nav ul li
	{
		display:inline-block;
		float:left;
		padding:10px;
		
	}
	.current
	{
		color:#fff;
		 text-decoration:underline;
		 text-decoration:bold;	
	}
	.clear
	{
		clear:both;
	}
	footer
	{
		background:#333333;
		overflow:hidden;
		width:100%;
		opacity:0.90;
	}
	footer p,footer h3
	{
		color:#fff;
	}
	footer p a
	{
		color:#fff;
		text-decoration:none; 
	}
	ul.social li
	{
		display:inline-block;
	}
	ul.social img
	{
		height:50px;
	}
	footer.foot
	{
		border-top:1px solid #4d4e50;
		background-color:#333333;
		max-height:50px;
		text-align:center;
		opacity:0.95;
	}
	/*-----media------*/
	@media screen(max-width :478px)
	{
		body{
			position:absolute;
			}
	}
	@media screen(max-width :740px)
	{
		header{
			position:absolute;
			}
		#menu-icon
		{
			display:in-line;
		}
		nav ul, nav:active ul
		{
			position:absolute;
			display:none;
			padding:20px;
			background:#405580;
			border:1px solid #FFF;
			right:20px;
			top:60px;
			width:50px;
			border-radius:2px 0 2px 2px;
			
		}
		nav li
		{
			text-align:center;
			width:100%;
			padding:10px 0;
			margin:0;
		}
		nav:hover ul
		{
			display:block;
		}
		section
		{
			margin:0;
			padding:0;
			float:left;
			width:100%;
		}
	}
	</style>
</head>
<body>
<header>
		<a href="wel.html" id="logo"><img alt="" src="yoloicon.jpg"></a>
		<div id="sign" align="right">
			<a href="signin.html">My Account</a>
			<b> | </b>
			<a href="signup1.html">Log Out
			</a>
		</div>
			
	</header>
	<br><br><br>
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
		
		   CarsDAO.add(id,type,date);
}
 else if(book.equals("flights"))
{
	 String l=(String)session.getAttribute("date1");
     String j=(String)session.getAttribute("origin1");
     String k=(String)session.getAttribute("dest1");
     String n=(String)session.getAttribute("choose1");
     int o=Integer.parseInt(session.getAttribute("seats1").toString());
	 TripFDAO.setSeats(o,n,j,k);
}

else{
	String j=(String)session.getAttribute("star1");
    String k=request.getParameter("add1");
    int r=Integer.parseInt(session.getAttribute("rooms1").toString());
	HotelsDAO.setRooms(r,j,k);
}
%>
       <h1><b>THANK YOU FOR CHOOSING US!!HOPE YOU WILL ENJOY TRAVELLING WITH US<b></h1>
       <br><br><br><br><br><br><p>YOUR PAYMENT HAS BEEN DONE SUCCESSFULLY!!!
           Futher details has been sent to your email-id alongwith a confirmation message on your phone number.
           Do Visit Again.<p> 
      <br><br><br><br><br>
 	<footer class="foot">
		<p>@Copyright #YOLO Travel Agency</p>
	</footer>
</body>
</html>