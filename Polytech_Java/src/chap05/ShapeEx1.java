package chap05;

//�߻�Ŭ���� ����
abstract class Shape2{
	abstract void draw();
}

//�߻�Ŭ������ ��ӹ޾Ƽ� �������ؼ� ���
class Circle1 extends Shape2{
	@Override
	void draw() { System.out.println("���׸���"); }
}

class Line1 extends Shape2{
	@Override
	void draw() { System.out.println("���׸���"); }
}

class Rect1 extends Shape2{
	@Override
	void draw() { System.out.println("�簢���׸���"); }
}
		
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape2 s = new Circle1(); 
		//��ĳ����, Shape2Ŭ������ abstractŬ������ �̰� ��ü������ ��ü ���� �Ұ����ϹǷ� Circle1Ŭ���� ��� 
		s.draw();
//		Shape2 s2 = new Shape2();
	}

}


