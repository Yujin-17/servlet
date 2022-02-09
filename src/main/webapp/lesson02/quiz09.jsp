<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>d-day</title>
</head>
<body>
	<div class="container">
	<h1>오늘부터 1일</h1>
	
	<%
		Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		
		today.add(Calendar.DATE, -1); // 오늘부터로 하면 0일이기 때문에 하루를 빼준다. 
		
		for(int i = 100; i <= 1000 ; i += 100){
			today.add(Calendar.DATE, 100);
	
	
	
	%>
		<div class="display-4">
			<span><%= i %>일:</span>
			<span class="text-danger"><%= sdf.format(today.getTime()) %></span>
		</div>
	
	<%
	
		}
	
	%>
	</div>
	
</body>
</html>