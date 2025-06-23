package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		

		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");

			//	 위에서 생성한 MemberDto 객체 3개의 참조 값을  순서대로 배열에 담기
		MemberDto[ ] memd = {dto1, dto2, dto3};
		
	}
}
