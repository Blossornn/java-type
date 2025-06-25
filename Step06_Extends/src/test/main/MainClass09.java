package test.main;

import test.company.Department;
import test.company.Employee;
import test.company.Manager;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 사원이름 : KING 급여 : 5000 부서명 : 기획부 부서의 위치 : 서울 직위(position) : 이사
		 *
		 * 위의 정보를 가지는 Manager 객체를 생성해서 그 참조 값을 m1 이라는 변수에 담기
		 */
		Manager m1 = new Manager("KING", 5000, new Department("기획부", "서울"));
		m1.setPosition("이사");

		m1.printInfo();
		Employee m2 = new Manager("KING2", 5000, new Department("기획부", "서울"));
		m2.printInfo();
		// KING의 직위를 넣어 주려면?
		Manager m3 = (Manager) m2;
		m3.setPosition("도구");
		m2.printInfo();
	}
}
