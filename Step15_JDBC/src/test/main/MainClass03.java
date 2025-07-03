package test.main;
/*
 *  Java DataBase Connectivity (JDBC)
 *  
 *  - Java 에서 DB 에 연결해서 INSERT, UPDATE, DELETE, SELECT 등의 작업을 할 수 있다
 *  - 우리는 ORACLE DataBase 에 연결해서 이런 작업을 할 예정
 *  - Oracle 연결 driver Class가 있어야 연결 가능
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
			// DB에 접속에서 작업을 하려면 Connection 객체가 필요
			Connection conn = null;
			
			try {
				//오라클 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//접속할 DB 의 정보 @아이피주소:port번호:db이름
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
				conn=DriverManager.getConnection(url, "scott", "TIGER");
				//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
				System.out.println("Oracle DB 접속 성공");
			} catch (Exception e) {
				e.printStackTrace();
			}
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				// 실행할 sql 문 미리 준비하기 ( java 10부터 추가 된 문법)
				String sql = """
						SELECT deptno, dname, loc
						 FROM dept
						ORDER BY deptno ASC
						""";
				// sql 문 을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
				pstmt = conn.prepareStatement(sql);
				// SELECT 문 실행 후 결과 result 객체
				rs = pstmt.executeQuery();
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					// 현재 cursor 가 위치한 곳의 데이터를 테스트로 출력
					System.out.println(deptno+ " | " +dname+ " | " + loc);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
