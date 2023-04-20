package chap05;

class Shape{
	void draw() {System.out.println("Shape");}
}

class Line extends Shape{
	@Override	//override 됐음을 표시. 이 아이는 부모님이 존재한다
	void draw() {System.out.println("Line");}
}

class Rect extends Shape{
	@Override
	void draw() {System.out.println("Rect");}
}

class Circle extends Shape{
	@Override
	void draw() {System.out.println("Circle");}
}

public class ShapeEx {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();		// Circle 이 출력. 부모님 무시. 동적 바인딩
		Shape shape = new Line();
		shape.draw();	// Line이 출력. 부모님 무시. 동적 바인딩
	}
}
