package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz06")
public class quiz06 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		
//		Integer number1 = Integer.valueOf(request.getParameter("number1"));
//		Integer number2 = Integer.valueOf(request.getParameter("number2"));
//		
//		int addtion = number1 + number2;
//		int subtraction = number1 - number2;
//		int multiplication = number1 * number2;
//		int division = number1 / number2;
//		
//		out.print("{\"addition\": " + addtion + ",\"subtraction\": " + subtraction + ",\"multiplication\": " + multiplication + ",\"division\":" + division +"}");
//		}
		String number1Param = request.getParameter("number1");
		String number2Param = request.getParameter("number2");
		Integer number1 = Integer.parseInt(number1Param);
		Integer number2 = Integer.parseInt(number2Param);
		
		// {"addtion":1570, "subtraction":1430, "multiplication":105000, "division":21}
		out.print("{\"addtion\":" + (number1 + number2) + ", \"subtraction\":" + (number1 - number2) +
				", \"multiplication\":" + (number1 * number2) + ", \"division\":" + (number1 / number2) + "}");
	}
	
	
	
}
