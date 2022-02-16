<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.common.MysqlService" %> 
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<style>
	header{background-color: orange; height:100px}
	nav{background-color: orange; height:50px}
	</style>

</head>
<body>
<% 
	// DB 연결
	MysqlService mysql = MysqlService.getInstance();
	mysql.connection(); // DB 연결
	
	String selectQuery = "select * from `seller` join `used_goods` order by seller.id desc";
	ResultSet result = mysql.select(selectQuery);
%>	

	<div class="container">
		<header class="text-center text-white"><h1 class="">HONG당무 마켓</h1></header>
		<nav> 
			<ul class="nav justify-content-center align-items-center nav-fill"> 
				<li class="nav-item">
					<a class="nav-link active text-white" href="#"><h5>리스트</h5></a>
				</li> 
				<li class="nav-item">
					<a class="nav-link active text-white" href="#"><h5>물건 올리기</h5></a>
				</li> 
				<li class="nav-item">
					<a class="nav-link active text-white" href="#"><h5>마이 페이지</h5></a>
				</li> 
			</ul> 
		</nav>
		<section>
			<%
				while(result.next()){
			%>
			
			<div class="card" style="width: 300px;">
  				<div class="">
  					<img class="<%= result.getString("profileImageUrl") %>" src="..." alt="Card image cap">
  						<div class="card-body">
    						<p class="card-text"><%= result.getString("title") %></p>
    						<p class="card-text"><%= result.getString("price") %></p>
    						<p class="card-text"><%= result.getString("nickname") %></p>
  				</div>
			</div>
			
			<%
			}
			%>
<%
	// DB 연결 해제
	mysql.disconnection();
%>
		</section>
		<footer>Copyright © marondal 2021</footer>


	</div>
</body>
</html>