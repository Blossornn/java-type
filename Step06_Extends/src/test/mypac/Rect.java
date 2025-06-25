package test.mypac;

public class Rect extends Shape {
	private int length;

	public Rect(int x, int y, int length) {
		super(x, y); // super() 는 부모 클래스의 생성자를 의미한다.
		this.length = length;
	}


	public void printArea() {
		int area = length * length;
		System.out.println("사각형의 넓이는 : " + area);
	}	
		
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("한변의 길이는 : " + length);
	}
}
