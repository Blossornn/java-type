package test.company;

// 사원 정보를 저장할 객체를 생성하기 위해 클래스 정의
public class Employee {
	// 사원이름
	private String name;
	// 급여
	private int salary;
	// 근무는 부서 정보
	private Department dept;
	
	// 필드에 저장 할 정보를 생성자로 전달 받아서 저장하기
	public Employee(String name, int salary, Department dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	// test method
	public void printInfo() {
		System.out.println("이름 : " +name);
		System.out.println("연봉 : " +salary + "만원");
		System.out.println(dept);
	}
}
