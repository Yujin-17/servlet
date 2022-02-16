package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		// DB 접속 연결 
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection(); // DB 연결 
		
		// insert query
		String insertQuery = "insert into `used_goods`(`title`, `price`, `description`, `sellerId`)"
				+ "values ('고양이 간식 팝니다.', 2000, '저희 고양이가 입맛이 까다로워서 잘 안먹어요 ㅠ', 5)";

		try {
			mysql.update(insertQuery);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		
		// select query
		String selectQuery = "select * from `used_goods`";
		
		// 결과 출력
		try {
			PrintWriter out = response.getWriter();
			ResultSet resultSet = mysql.select(selectQuery);
			while (resultSet.next()) { // 결과 행이 있는 동안 수행 
				// id, title, description, price
				out.println(resultSet.getInt("id"));
				out.println(resultSet.getString("title"));
				out.println(resultSet.getString("description"));
				out.println(resultSet.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 접속 연결 해제 
		mysql.disconnection();
	}
}
