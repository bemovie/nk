package chap01;

//�������� 2���� input parameter�� �Է¹��� ��
//�� ū ���� return �ϴ� max �޼ҵ带 �ۼ��϶�.

public class Mission2 {
	public static int max(int x, int y) {
		if (x > y)
			return x;
		else if(x == y)
			return -1;
		else
		return y;
	}		
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		if (max(x,y) == -1)
			System.out.println("�� ���� �����ϴ�.");
		else
			System.out.println("�� ū ���� : " + max(x,y));
	}
}
