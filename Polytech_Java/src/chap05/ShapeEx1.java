package chap05;

//추상클래스 정의
abstract class Shape2{
	abstract void draw();
}

//추상클래스를 상속받아서 재정의해서 사용
class Circle1 extends Shape2{
	@Override
	void draw() { System.out.println("원그리기"); }
}

class Line1 extends Shape2{
	@Override
	void draw() { System.out.println("선그리기"); }
}

class Rect1 extends Shape2{
	@Override
	void draw() { System.out.println("사각형그리기"); }
}
		
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape2 s = new Circle1(); 
		//업캐스팅, Shape2클래스는 abstract클래스라 이것 자체만으로 객체 생성 불가능하므로 Circle1클래스 사용 
		s.draw();
//		Shape2 s2 = new Shape2();
	}

}


