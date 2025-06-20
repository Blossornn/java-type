package test.main;

import test.mypac.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");

		// dto 객체에 보관된 num, name, addr 을 참조하고 싶다면?

		// 회원의 번호를 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getNum());
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());

		// dto의 getter 메소드를 호출해서 리턴되는 값을 변수에 연습 삼아 담아보기.
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
	}
}
