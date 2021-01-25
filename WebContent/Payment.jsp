<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PAYMENT</title>
<meta name="viewport" content="device-width ,initial-scale=1.0">
<link rel="stylesheet" href="blueberry.css" />
	<style type="text/css">
.{
		margin:0;
		border:0;
		padding:0;
	}
	body
	{
		background-image:url("5.jpg");
		background-size:cover;
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
		<nav>
			
			
		</nav>
	</header>
	<br><br><br><br><br>
	<%String book=request.getParameter("book");%>
	<h1>PAYMENT</h1>
	
		
			ENTER CARD NO:<input type="text"  name="cardno" placeholder="Enter CARD NUMBER"><br><BR>
			ENTER CVV NO.:<input type="text"  name="cvv" placeholder="Enter CVV"><br><br>
			NAME ON CARD: <input type="text"  name="name" placeholder="Enter Name"><br><br>
			EXPIRY DATE:<input type="text"  name="date" placeholder="Enter Expiry Date"><br><br>
			<a href='AfterP.jsp?book=<%=book%>'><input type="submit"  value="PROCEED"></a>
			
	<br><br><br><br><br>
		<footer>
		<section>
		<h3><b>#YOLO Travel Agency</b></h3>
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
	</section>
	</footer>
	<footer class="foot">
		<p>@Copyright #YOLO Travel Agency</p>
	</footer>
	</body>
</html>