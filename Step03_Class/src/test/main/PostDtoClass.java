package test.main;

import test.mypac.PostDto;

public class PostDtoClass {
	public static void main(String[] args) {
		new PostDto();
		PostDto dto = new PostDto();
		PostDto dto2 = new PostDto(1, "바보", "멍청이");
		PostDto dto3 = new PostDto();
		dto3.setId(2);
		dto3.setContent("멍청");
		dto3.setAuthor("메롱");

	}
}
