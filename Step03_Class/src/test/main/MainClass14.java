package test.main;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		// 객체를 생성해서 default 생성자가 실행의 흐름이 들어오는 지 확인하기
		new MemberDto();
		MemberDto dto = new MemberDto();
		MemberDto dto2 = new MemberDto(1, "김구라", "노량진");
		
		MemberDto dto3 = new MemberDto();
		dto3.setNum(2);
		dto3.setName("해골");
		dto3.setAddr("행신동");
	}
}
