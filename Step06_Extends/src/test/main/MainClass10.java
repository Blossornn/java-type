package test.main;

import test.company.*;

public class MainClass10 {
	public static void main(String[] args) {

		Department d1 = new Department("영업부", "대전");
		/*
		 * 위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서 
		 * 그 참조 값 3개를 배열에 순서대로 담아 보기
		 * 
		 */
		Employee emp1 = new Employee("김구라", 1000, d1);
		Employee emp2 = new Employee("해골", 2000, d1);
		Employee emp3 = new Employee("원숭이", 3000, d1);

		Employee[] emps = { emp1, emp2, emp3 };

		for (int i = 0; i < emps.length; i++) {
			Employee tmp = emps[i];
			tmp.printInfo();
//			emps[i].printInfo();;
		}
	System.out.println("------------------");
	for(Employee tmp : emps) {
		tmp.printInfo();
	}
	}
}
