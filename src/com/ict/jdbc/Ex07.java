package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//jar : 자바로 압축한 파일이다. 보통 라이브러리에 사용, 클래스들로 이루어졌다.
//1. 자바와 오라클을 연결해주는 드라이버(ojdbcXXX.jar)가 필요하다.
//그런데 sqldeveloper 에 존재한다. 해당 드라이버를 찾아서 util 폴더에 넣자.
//2. 이클립스에서 프로젝트에서 마우스 오른쪽 Build Path -- Configure Build Path
public class Ex07 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와 주는 클래스
				Connection conn = null;
				// 2. SQL 구문 작성
				PreparedStatement pstmt = null;
				// 3-1. 결과를 받은 클래스(select일때)
				ResultSet rs = null;
				// 3-2 . 결과를 받은 변수 (select가 아닐때)
				int result =0;
				Scanner scan = new Scanner(System.in);
				
				
				try {
					
					System.out.println("검색번호 받기 : ");
					int custid = scan.nextInt();
					
					// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다르다.
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					// 5. 오라클과 연결 하기 위한 정보
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "c##ictedu";
					String password = "1111";
					
					// 6. 오라클에 연결하기
					conn = DriverManager.getConnection(url, user, password);
					
					// String sql = "select * from customer";
					// ?: 동적 바인딩 변수 => 지금은 값을 모르고 실행할때 값을 알 수 있다.
					 String sql = "select * from customer where custid = ?";
					
					
					
					// 8. sql을 보내기 위해서 구문을 만듬
					// stmt = conn.createStatement();
					 pstmt = conn.prepareStatement(sql);
					
					 
					// ?를 처리하자
					 pstmt.setInt(1, custid);
					
					 // 보내서 결과받기
					// 9-1. select 문인 경우
					rs = pstmt.executeQuery(); 
					
					// 9-2. insert, update, delete 인 경우
					// result = pstmt.executeUpdate();
					
						
						while(rs.next()) {
							System.out.print(rs.getInt(1)+"\t");
							System.out.print(rs.getString(2) +"\t");
							System.out.print(rs.getString(3)+"\t");
							System.out.print(rs.getString(4)+"\n");
						}
						
					
					
				
					
					
				} catch (Exception e) {
					
				}finally {
					try {
						rs.close();
	
						conn.close();
						
					} catch (Exception e2) {

					}
				}
				
	}
}
