package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scan.nextInt();
		int �������� = money/50000;
		int res = (money%50000);
		int ������ = res/10000;
		res = (money%10000);
		int õ���� = res/1000;
		res = (money%1000);
		int ��� = res/100;
		res = (money%100);
		int ���ʿ� = res/50;
		res = (money%50);
		int �ʿ� = res/10;
		res = (money%10);
		int �Ͽ� = res/1;
		System.out.println("�������� : " + ��������);
		System.out.println("������ : " + ������);
		System.out.println("õ���� : " + õ����);
		System.out.println("��� : " + ���);
		System.out.println("���ʿ� : " + ���ʿ�);
		System.out.println("�ʿ� : " + �ʿ�);
		System.out.println("�Ͽ� : " + �Ͽ�);
		
//		System.out.println("�������� : " + money/50000 + "��");
//		System.out.println("���� : " + money%50000/10000 + "��");
//		System.out.println("õ���� : " + money%50000%10000/1000 + "��");
//		System.out.println("��� : " + money%50000%10000%1000/100 + "��");
//		System.out.println("���ʿ� : " + money%50000%10000%1000%100/50 + "��");
//		System.out.println("�ʿ� : " + money%50000%10000%1000%100/10 + "��");
//		System.out.println("�Ͽ� : " + money%50000%10000%1000%100%10 + "��");
		
		scan.close();
	}

}
