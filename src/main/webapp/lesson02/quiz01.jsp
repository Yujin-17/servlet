<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<%!
	public int getSum(int n){
		int sum = 0;
		for(int i = 1 ; i <= n ;i++){
			sum += i;
		}
		return sum;	
}

%>


<%
	int[] scores = {80, 90, 100, 95, 80};

	int sum = 0;
	for(int i = 0; i < scores.length; i++){
		sum += scores[i];
	}
	double average = sum / (double)scores.length;
	
%>

<%
/* 
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int score = 0;
	for(int i = 0; i <= scoreList.size(); i++){
		if(scoreList.get(i).equals("O")){
			score += 100/scoreList.size();
		}
	}
	
 */
%>

<h1>1부터 50까지의 합은 <%= getSum(50) %> 입니다.</h1>
<h1>평균 점수는 <%= average %> 입니다.</h1>
<%-- <h1>채점 결과는 <%= score %>점 입니다.</h1> --%>

</body>
</html>