package test.company;

public class Department {
	// 부서명과 부서의 위치를 저장하는 필드
	private String deptname;
	private String location;

	// 부서명과 부서의 위치를 생성자로 전달 받아서 필드에 저장하는 생성자
	public Department(String deptname, String location) {
		this.deptname = deptname;
		this.location = location;
	}

	// 부서 정보를 콘솔에 출력하는 테스트 메소드
	public void printInfo() {
		System.out.println("부서 명 : " + deptname);
		System.out.println("위치 : " + location);
	}
    @Override
    public String toString() {
        return "부서 명 : " + deptname + "\n위치 : " + location;
    }
}
