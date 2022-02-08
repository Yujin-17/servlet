package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class Quiz05 extends HttpServlet{
	
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Integer number = Integer.valueOf(request.getParameter("number"));
		
		
		out.print("<html><head><title>구구단</title></head><body><ul>");
			for(int j = 1 ; j < 10; j++) {
				out.print("<li>" + number + " X " + j + " = " + (number*j));
			}
		
		out.print("</ul></body></html>");
	}


}
// http status code 에 들어가면 오류내용을 알 수 있다. 

 