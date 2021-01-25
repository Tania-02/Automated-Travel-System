<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,pack.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>BUS</title>
	<meta name="viewport" content="device-width ,initial-scale=1.0">
	<link rel="stylesheet" href="blueberry.css" />
	
	<style type="text/css">
	.{
		margin:0;
		border:0;
		padding:0;
		background-image:url("PS_Hotel_KingRoom_new.jpg");
	}
	.dropbtn {
    
    border: none;
    cursor: pointer;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
    position: relative;
    display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #f1f1f1}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
    background-color: ;
}
	img
	{
		border-radius:4px;
		shadow:5px black ;
	}
	body
	{
		background:#f0f0f0;
		font:14px/20px Arial,San-Serif;
		color:#555;
		margin:0;
	}
	h1
	{
		text-align:center;
		font-size:180%;
		line-height:120%;
		padding:5% 0;
	}
	h2
	{
		text-decoration:underline;
		line-height:280%;
		padding-left:2%;
		
	}
	h3
	{
		line-height:110%;
		padding-left:5%;
	}
	p
	{
		padding-left:1%;
		text-align:center;
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
	#sign
	{
		padding:5px;
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
	
	nav
	{
		
		float:right;
		padding:0px;
	}
	#menu-icon
	{
		display:hidden;
		
		width:40px;
		height:40px;
		background-image:url();
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
	#doc
	{
		margin:40px;
	}
	#content
	{
		margin:0 auto;
		max-width:1140px;
		margin-top:110px;
	}
	.blueberry
	{
		max-width:960px;
		margin-top:110px;
	}
	section
	{
		width:29%;
		float:left;
		margin:2% 2%;
		text-align:center;
		img-align:center;
		
		
	}

	.clear
	{
		clear:both;
	}
	article
	{
		width:50%;
		float:left;
		margin:0 auto;
		height:auto;
		padding:4%;
		
	}
	aside
	{
		width:35%;
		float:right;
		margin:0 auto;
		height:auto;
		padding:3%;
		
	}
	ul.book_guide.li
	{
		padding-left:3%;
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
		aside
		{	
			margin:0;
			padding:0;
			float:left;
			width:100%;
		}
	}
	</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<br><br><<br><br><br><<br><br><br>
<header>
		<a href="wel.html" id="logo"><img alt="" src="yoloicon.jpg"></a>
		<div id="sign" align="right">
			<a href="signin.html">My Account</a>
			<b> | </b>
			<a href="signin.html">Log Out</a>
		</div>
		<nav>
			<a href="#" id="menuicon"></a>
			<ul>
				<li><a href="wel.html" class="current">HOME</a></li>
				<li><a href="Hotels.html">HOTELS</a></li>
				<li><a href="flights.html">FLIGTS</a></li>
				<li><a href="cars.html">CARS</a></li>
				<li><a href="bus.html">BUS</a></li>
				<li><div class="dropdown">
  					<a class="dropbtn">TOUR</a>
  						<div class="dropdown-content">
    						<a href="tour1.html">INTERNATIONAL</a>
    						<a href="tour2.html">DOMESTIC</a>
    					</div>
					</div></li>
				<li><a href="contacts.html">CONTACTS</a></li>
			</ul>
		</nav>
	</header>
	<%	  
	   String origin=request.getParameter("origin");
	  
	   String type=request.getParameter("type");
	   String date=request.getParameter("date");
	   String dest=request.getParameter("dest");
	   
	   int passengers=Integer.parseInt(request.getParameter("seat"));
	   session.setAttribute("seatbus", passengers);
	   
	  // out.println(origin+" "+type+" "+date+" "+dest+" "+passengers);%>
		   
		  <%!List<Bus> list; %>
		  <%
		  	
		  	list=BusDAO.getRecords();
		  	 int flag1=0;
		 
		   for(Bus s:list)
		   {
			   //if(dest.equalsIgnoreCase(s.getDestination())&&origin.equalsIgnoreCase(s.getOrigin())&&type.equalsIgnoreCase(s.getType())&&passengers<=s.getSeats()&&date.equalsIgnoreCase(s.getDept()))
			   {	
				   if(flag1==0)
					   {%>
					   <table border='1' cellpadding ='4' width='60%'>
					   <tr><th>ID</th><th>ORIGIN</th><th>DESTINATION</th><th>PRICE</th><th>DATE</th><th>SEATS</th>
					  <% flag1=1;
					   }%>
				  				   
				  <tr><td><%=s.getID()%></td><td><%=s.getOrigin()%></td><td><%=s.getDestination()%></td><td><%=s.getRate()%></td><td><%=s.getDept()%></td><td><%=s.getSeats()%></td>
				  <td><a href='bookbus.jsp?id=<%=s.getID()%>'><h3>book</h3></a></td></tr>
			<%   }
		       
		   }%>
		   </table>
		   <%	if(flag1==0)
			   	{
			   		%><h1>Sorry no bus available</h1>
			   		<%
			   	}%>
		   <br><br>
		   <footer>
		<section>
		<h3><b>  #YOLO Travel Agency</b></h3>
		<p><b>+91-8981527748</b><br><br>
		Address:<br>
		
		Email:yolotravels@gmail.com<br>
		</p>
	</section>
	<section>
		<h3><b>Connect with us!</b></h3>
		<ul class="social">
			<li><a href="#"></a><img style="border-radius:15px;" src="facebook_2_shaded.jpg"></li>
			<li><a href="#"></a><img style="border-radius:15px;" src="whatsapp-icon.jpg"></li>
			<li><a href="#"></a><img style="border-radius:15px;" src="twitter-icon--icons-for-twitter--twitter-vector-icons-6.png"></li>
			<li><a href="#"></a><img style="border-radius:15px;" src="Instagram-Icon-993x1024.jpg"></li>
		</ul>
	</section>
	<section>
		<img alt="" src="footer.jpeg">
		<a>Life's Short.Take a Vacation</a>
	</section>
	</footer>
	<footer class="foot">
		<p>@Copyright #YOLO Travel Agency</p>
	</footer>
	
</body>
</html>