package chap04;

public class Circle {
	/* �ʵ� : �Ӽ� =======================*/
	public Double radius; //�������
	public String name; //�������
	public static final double PI = 3.14; // �������, ���(final)
	public static String Circle_name = "����";  //Ŭ��������
	
	/* �޼ҵ� : ���� =======================*/
	//������ �޼ҵ�
	public Circle(){}	//Default ������ (Ŭ������ Ȱ���� �� �ִ� ����Ȯ��)
	public Circle(String name, Double radius) {
		this.name = name;
		this.radius = radius;
	}
	//�Ϲ� �޼ҵ�
	double getArea() {return PI * radius * radius;}
	//Ŭ���� �޼ҵ�
	static double getArea(double radius) {return PI * radius * radius;}
	//main �޼ҵ�
	public static void main(String args[]) {
//		Circle c = new Circle(); // ����Ȯ���Ͽ� ��ü����
//		Circle c1 = new Circle("��1", 3); // class�� �޼ҵ� �̸��� ���� ������ �޼ҵ��̹Ƿ�
//										 // Circle class�ȿ� �ִ� ��� ������ �޼ҵ� ��밡��
//		System.out.printf("%.2f", c1.getArea());
		
		Circle pizza = new Circle("����", 10.0);
		Circle donut = new Circle("����", 2.0);
		System.out.println(Circle_name);
		System.out.println("������ ũ��� " + pizza.getArea());
		System.out.println("������ ũ��� " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
	}
}
