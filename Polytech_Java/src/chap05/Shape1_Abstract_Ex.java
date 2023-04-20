package chap05;

abstract class Shape1 {
	abstract void draw();	//��ɿ� �̸��� ���Ƶ�, ������ �޶����� �ڽ� Ŭ�������� �����ض� (��)�� - ������, ������
	void paint() {System.out.println("paint�޼ҵ� ȣ��");}
	void print() {System.out.println("print�޼ҵ� ȣ��");}	
}

class RealShape extends Shape1 {
	@Override
	void draw() {System.out.println("draw�޼ҵ� ȣ��");}
	//abstract class�� ��� �������� �ݵ�� abstract method�� ���������־�� �Ѵ�
}	
	
public class Shape1_Abstract_Ex {
	public static void main(String args[]) {
		Shape1 sp = new RealShape();	//upcasting
		sp.paint();	
		sp.draw();	//�������ε�(dynamic binding)
	}
}