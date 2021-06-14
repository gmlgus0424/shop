<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
		@import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap');
		a:link {color:black; text-decoration: none;}
	{ 
		margin:0;
		padding:0;

	 }
		li{
			list-style-type: none;
			color:gray;
		}

		header { 
			height:250px;
			
		 }
		 #top{
		 	height: 60px;
		 	background-color: #00BFFF;



		 }
		 #top li{
		 	display:inline;
		 	font-size: 15px;
		 	margin: 5px;
		 	

		 }
		 #mainmenu{
		 	height:60px;
		 	border-top: solid 1px #e2e2e2;
		 	border-bottom: solid 1px #e2e2e2;
		 	padding: 15px 15px;


		 	}
		 	
		 #mainmenu li{
		 	display:inline;
		 	text-align: center;
		 	font-family: 'Montserrat', sans-serif;
		 	font-size:20px;
		 	text-align: justify;
		
         	margin-left: 35px;

         	}

		 	#weekly{
		 		
		 		margin:0 auto;
		 	}
		#weekly h3{
			text-align: center;
		}
		footer{
			width:1500px;
			border-top:solid 1px #dddddd;

			
		}
		.accent{
			font-size: 130%;
			font-weight: 150;

		}

		.footers{
			float:left;
			margin:30px 0 0 30px;
		}

		
		</style>
	</head>
	<body>
		<header>
		<div id= "top">
			
           <li><a href="/login2.jsp">LOGIN</a></li> 
			         <li><a href="/signUp.jsp">JOIN US</a></li>
			          <li><a href="#">CART</a></li> 			         
			         <li><a href="#">ORDER</a></li>
			   
			     
			     </div>

					

		 	<div id = "logo">
		 		<center>  <img src="C:\Users\user\Desktop\xxxy\images/logo.png"> </center>
		 	</div>
		 </header>
	 	
	 <nav id ="mainmenu">
	 	<div class= "box">
	 		<ul>

	     <li><a href="#"> All </a></li>
		<li><a href="#"> Similar Look </a></li>
			<li><a href="#"> Couple </a></li>
	
		</ul>
	</div>
					
	 </nav>
</body>
</html>