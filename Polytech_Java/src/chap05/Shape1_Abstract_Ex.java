package chap05;

abstract class Shape1 {
	abstract void draw();	//기능에 이름은 같아도, 내용은 달라지면 자식 클래스에서 구현해라 (예)폰 - 갤럭시, 아이폰
	void paint() {System.out.println("paint메소드 호출");}
	void print() {System.out.println("print메소드 호출");}	
}

class RealShape extends Shape1 {
	@Override
	void draw() {System.out.println("draw메소드 호출");}
	//abstract class를 상속 받으려면 반드시 abstract method를 구현시켜주어야 한다
}	
	
public class Shape1_Abstract_Ex {
	public static void main(String args[]) {
		Shape1 sp = new RealShape();	//upcasting
		sp.paint();	
		sp.draw();	//동적바인딩(dynamic binding)
	}
}