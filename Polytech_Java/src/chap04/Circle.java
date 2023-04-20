package chap04;

public class Circle {
	/* 필드 : 속성 =======================*/
	public Double radius; //멤버변수
	public String name; //멤버변수
	public static final double PI = 3.14; // 멤버변수, 상수(final)
	public static String Circle_name = "원형";  //클래스변수
	
	/* 메소드 : 행위 =======================*/
	//생성자 메소드
	public Circle(){}	//Default 생성자 (클래스가 활동할 수 있는 공간확보)
	public Circle(String name, Double radius) {
		this.name = name;
		this.radius = radius;
	}
	//일반 메소드
	double getArea() {return PI * radius * radius;}
	//클래스 메소드
	static double getArea(double radius) {return PI * radius * radius;}
	//main 메소드
	public static void main(String args[]) {
//		Circle c = new Circle(); // 공간확보하여 객체생성
//		Circle c1 = new Circle("원1", 3); // class와 메소드 이름이 같은 생성자 메소드이므로
//										 // Circle class안에 있는 모든 변수와 메소드 사용가능
//		System.out.printf("%.2f", c1.getArea());
		
		Circle pizza = new Circle("피자", 10.0);
		Circle donut = new Circle("도넛", 2.0);
		System.out.println(Circle_name);
		System.out.println("피자의 크기는 " + pizza.getArea());
		System.out.println("도넛의 크기는 " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
	}
}
