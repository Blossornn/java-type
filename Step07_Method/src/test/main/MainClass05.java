package test.main;
import test.mypac.*;
public class MainClass05 {
	public static void main(String[] args) {
		Messenger msg = new Messenger();
		Post post = new Post(9, "배고픔", "익명의 제보자");
		msg.sendPost(post);
	}
}
