package chap01;

public class HelloWorld {
	public static int sum(int n, int m) {
		return n+m;
		
	}
		
		// �����ּ�
		/* �����ּ� */
		// �ּ� ����Ű : Ctrl + /
		// ���� : Ctrl + F11
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int s = sum(a, b);
		System.out.println("Hello World");
		System.out.println("a+b = " + s);
	}
}
