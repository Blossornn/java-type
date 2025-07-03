package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {

	// member 테이블에 회원 한 명의 정보를 추가하는 메소드를 만든다고 생각 해 보자
	public static boolean insert(MemberDto dto) {
		Connection conn = null; 
		PreparedStatement pstmt = null;
		// 변화 된 row 의 갯수를 담을 변수 선언 하고 0 으로 초기화
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member
					(num, name, addr)
					VALUES(member_seq.NEXTVAL, ?, ?)
					""";
			pstmt = conn.prepareStatement(sql);
			// ? 에 순서대로 필요한 값 바인딩

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
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

	public static void main(String[] args) {
		// DB에 추가 할 회원의 정보라고 가정하자 (member table)
		String name = "누구게2";
		String addr = "어디게2";
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 메소드를 호출하면서 전달하고 작업의 성공 여부를 리턴 받는다.
		boolean isSuccess = insert(dto);
		if (isSuccess) {
			System.out.println("작업 성공띠띠");
		} else {
			System.out.println("작업 실패띠띠");
		}
	}
}
