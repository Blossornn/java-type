package test.main;

public class MainClass03 {
public static void main(String[] args) {
	//String type을 담을 수 있는 null 로 초기화 된 방 3개짤 배열 객체 생성
	String[] names = {null, null, null};
	names[0] ="kim";
	names[1] ="lee";
	names[2] ="park";
	
	// String type 을 담을 수 있는 null로 초기화 된 방 100개 짜리 배열 객체 생성
	String[] names2 = new String[100];
	System.out.println(names2.length);
}
}
