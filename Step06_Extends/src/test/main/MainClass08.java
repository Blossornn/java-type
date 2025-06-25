package test.main;

import test.company.*;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 사원의 이름 : 김구라 급여 : 1000 부서명 : 교육부 부서의 위치 : 역삼동
		 * 
		 * 위의 정보를 가지는 employee 객체를 하나 생성해서 
		 * 그 참조 값 emp1이라는 지역 변수에 담기 Departmemt, Employee
		 * 클래스를 수정하라는 말이 아님 
		 * 여기 아래에 2 줄의코딩만 메소드를 호출 하라 한 적 없음
		 */
		Department d = new Department("교육부", "역삼동");
		Employee emp1 = new Employee("김구라", 1000, d);
		emp1.printInfo();
		
		/*
		 *  위에서 생성한 부서와 동일한 부서에 근무하는 사원(Employee) 객체를 하나 더 생성
		 *  사원 이름 : 원숭이
		 *  급여 : 2000
		 * */
		Employee emp2 = new Employee("원숭이", 2000, d);
		emp2.printInfo();
		/*
		 *  사원 이름 : 주뎅이
		 *  급여 : 3000
		 *  부서 이름 : SALES
		 *  부서 위치 : LA
		 *  1줄 코딩
		 * */
		 Employee emp3 = new Employee("주뎅이", 3000, new Department("SALES", "LA"));
		 emp3.printInfo();
	}
}
