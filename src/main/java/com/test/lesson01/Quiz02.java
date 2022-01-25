package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Quiz02 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest requet, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("kk시 mm분 ss초 ");
		out.print("현재 시간은 " + sdf.format(now) + "입니다.");
	}

}
