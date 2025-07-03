package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.management.Query;

import test.util.DBConnector;

public class MainClass05 {
	public static void main(String[] args) {
			int minSal = 2000;
			int maxSal = 3000;
			// 위의 범위의 sal 을 받는 사원들의 empno, ename, sal 를  SELECT 해서
			// sal 에 대해서 오름차순 정렬 해서 콘솔창에 출력
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = new DBConnector().getConn();
				// 실행 할 sql 문의 뼈대 구성
				String sql = """
							SELECT empno, ename, sal
							FROM emp
							WHERE sal BETWEEN ? AND ?
							ORDER BY  sal ASC 
						""";
						// 미완성의 sql 문을 전달하면서 PreparedStatment 객체 얻어내
						pstmt = conn.prepareStatement(sql);
						// ? 에 필요한 값 binding 하기
						pstmt.setInt(1, minSal);
						pstmt.setInt(2, maxSal);
						rs = pstmt.executeQuery();
						
						while (rs.next()) {
							int empno = rs.getInt("empno");
							String ename = rs.getString("ename");
							int sal = rs.getInt("sal");
							System.out.println(empno + " | "+ename+" | "+sal);
						}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
