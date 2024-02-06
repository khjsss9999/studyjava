package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer 테이블에 6, 이강인, 대한민국 제주도, 000-1234-9876 을 삽입하자.
	
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		
		// 2. SQL 구문 작성
		Statement stmt = null;
		
		// 3-1. 결과를 받은 클래스(select일때) 
		ResultSet rs = null;
		// 3-2. 결과를 받은 변수 (select가 아닐때)
		int result = 0;
		
		try {
			// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결 하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. sql 작성
			
			String sql = "insert into customer(custid,name,address,phone) values(6,'이강인','대한민국 제주도','000-1234-9876')";
			
			// 8. sql을 보내기 위해서 구문을 만듬
			stmt = conn.createStatement();
			
			// 9-2. insert, update, delete 인 경우
			result = stmt.executeUpdate(sql);
			
			// 삽입 성공하면 result = 1 이다.
			if (result >0) {
				System.out.println("삽입 성공");
				// 성공했을 때 select 문을 이용해서 삽입된 내용을 보자.
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}else {
				System.out.println("삽입 실패");
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}
	
}
