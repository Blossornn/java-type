package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		// sendPost() 메소드 호출
	 Post post =  new Post(12, "나 ICH인데.", "익명");
	 sendPost(post);
	 Post post2 =  new Post(27, "맹갈자", "익명");
	 sendPost(post2);
	 
	 sendPost (new Post(1,"메롱", "바보"));
	sendPost (new Post(2,"바롱", "메보"));
	}

	public static void sendPost(Post post) {
		System.out.println("글을 전송했습니다.");
		
	} 
}
