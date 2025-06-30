package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * Hash set은 Set 인터페이스를 구현 한 클래스이다.
 * 
 * - 순서가 없다
 * - key 값도 없다
 * - 중복을 허용하지 않는다.
 * - 어떤 data 를 묶음(집합)으로 관리하고자 할 때 사용한다.
 * 
 */

public class MainClass09 {
	public static void main(String[] args) {
		// 정수를 저장 할 수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역 변수에 담기
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(20);
		set1.add(40);

		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");

		// Set 객체에 저장된 모든 아이템의 순서를 보장 할 수는 없지만 모두 참조해서 사용해보기
		set1.forEach((item) -> {
			// set1은 Set<Integer> 이기때문에 item은 Integer type이 됨
			Integer tmp = item;
			System.out.println(tmp);
		});
		System.out.println("-------------");
		set2.forEach((item) -> {
			// set2은 Set<String> 이기때문에 item은 String type이 됨
			String tmp = item;
			System.out.println(tmp);
		});
		System.out.println("--------");
		// Iterator를 사용하는 구조도 연습해보자 *반복자? ( Set의 generic이 Iterator의 Generic이 된다)
		Iterator<String> it = set2.iterator();
		/*
		 * 무한 루프를 구성하거나 정확한 반복 횟수를 알 수 없을 때 While(){}문을 사용한다
		 */
		while (it.hasNext()) { // 다음 item이 있는 지 확인해서
			// 다음 item을 얻어낸다 (item의 type은 Iterator의 Generic type)
			String item = it.next();
			// 얻어낸 item을 사용하고 또 다음 item이 있는 지 위에서 확인이 된다
			System.out.println(item);
		}
	}
}
