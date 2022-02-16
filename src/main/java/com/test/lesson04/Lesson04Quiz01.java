package com.test.lesson04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Lesson04Quiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");

		// DB 접속 연결
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection(); // DB 연결

		// insert query
		String insertQuery = "insert into `real_estate`(`realtorld`, `area`, `type`, `price`, `rentPrice`)"
				+ "values (3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, 'NULL')";
		
		
	}

}
