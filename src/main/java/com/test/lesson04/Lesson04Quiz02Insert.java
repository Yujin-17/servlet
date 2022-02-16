package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/favorites_insert")
public class Lesson04Quiz02Insert extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// request params 쿼리 파라미터 꺼낸다.
		String name = request.getParameter("name");
		String url = request.getParameter("url");

		// DB 연결
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection(); // DB 연결

		// insert 쿼리 수행
		String insertQuery = "insert into `favorites` (`name`, `url`) values('" + name
				+ "', '" + url + "')";
		try {
			mysqlService.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 해제
		mysqlService.disconnection(); // DB 연결 해제

		// 리다이렉트 redirect (목록화면이동)
		response.sendRedirect("/lesson04/quiz02_1.jsp");

	}
}
