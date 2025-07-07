package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.TodoDto;
import test.util.DBConnector;

public class TodoDao {
	public boolean insert(TodoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화 된 row 의 갯수를 담을 변수 선언 하고 0 으로 초기화
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
							INSERT INTO todo
							(num, content, done)
							VALUES (todo_seq.NEXTVAL, ?, 'N')
					""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());

			// ? 에 순서대로 필요한 값 바인딩

			// sql 문 실행하고 변화된 (추가된, 수정된, 삭제된) row의 갯수 리턴 받기
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		// 변화 된 rowCount 값을 조사해서 작업의 성공 여부를 알아낼 수 있다.
		if (rowCount > 0) {
			return true; // 작업 성공이라는 의미에서 true
		} else {
			return false; // 작업 실패라는 의미에서 false
		}
	}

	public boolean updateDone(int num, String done) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화 된 row 의 갯수를 담을 변수 선언 하고 0 으로 초기화
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
						UPDATE todo SET done = ? WHERE num = ?
					""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, done);
			pstmt.setInt(2, num);
			// ? 에 순서대로 필요한 값 바인딩

			// sql 문 실행하고 변화된 (추가된, 수정된, 삭제된) row의 갯수 리턴 받기
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		// 변화 된 rowCount 값을 조사해서 작업의 성공 여부를 알아낼 수 있다.
		if (rowCount > 0) {
			return true; // 작업 성공이라는 의미에서 true
		} else {
			return false; // 작업 실패라는 의미에서 false
		}
	}
public boolean delete(int num) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	// 변화 된 row 의 갯수를 담을 변수 선언 하고 0 으로 초기화
	int rowCount = 0;

	try {
		conn = new DBConnector().getConn();
		String sql = """
					DELETE FROM todo WHERE num = ?
				""";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		// ? 에 순서대로 필요한 값 바인딩

		// sql 문 실행하고 변화된 (추가된, 수정된, 삭제된) row의 갯수 리턴 받기
		rowCount = pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {

		}
	}
	// 변화 된 rowCount 값을 조사해서 작업의 성공 여부를 알아낼 수 있다.
	if (rowCount > 0) {
		return true; // 작업 성공이라는 의미에서 true
	} else {
		return false; // 작업 실패라는 의미에서 false
	}
}
public List<TodoDto> selectAll() {
    List<TodoDto> list = new ArrayList<>();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        conn = new DBConnector().getConn();
        String sql = "SELECT num, content, done FROM todo ORDER BY num";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while(rs.next()) {
            TodoDto dto = new TodoDto();
            dto.setNum(rs.getInt("num"));
            dto.setContent(rs.getString("content"));
            dto.setDone(rs.getString("done"));
            list.add(dto);
        }
    } catch(Exception e) { e.printStackTrace(); }
    finally { try { if(rs!=null)rs.close(); if(pstmt!=null)pstmt.close(); if(conn!=null)conn.close(); } catch(Exception e){} }
    return list;
}
}
