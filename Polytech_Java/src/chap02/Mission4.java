package chap02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
		int ���� = scan.nextInt();
		int �����ڸ� = ����/10;
		int �����ڸ� = ����%10;
		
		// � ������ �� �ʿ��ұ��?
		// ���ǿ�����
//		String msg = (�����ڸ� == �����ڸ�) ? "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�."
//				: "NO! ���� �ʽ��ϴ�." ;
//		System.out.println(msg);
		
		//���ǽ� if Ȱ��
		String msg;
		if(�����ڸ� == �����ڸ�) {msg = "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.";}
		else				{msg = "NO! ���� �ʽ��ϴ�.";}
		System.out.println(msg);
		
		
		scan.close();
		

		
		
		
		
//	Scanner scan = new Scanner(System.in);
//	System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
//	int num = scan.nextInt();
//	String a;
//	if ((int)num/10 == (int)num%10)
//	a = "Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�";
//	else
//	a = "No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�";
//	System.out.println(a);
//	
//	scan.close();
	
//		int a=10, b=20, c=30;
//		c = a-- + ++b;
//		System.out.println(c);	
		
		
	}
}
