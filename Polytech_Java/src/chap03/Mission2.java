package chap03;

import java.util.Random;
import java.util.Scanner;

// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �� �߿� �����ؼ� ���α׷� �ۼ�


public class Mission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����	
//		int com = (int)(1 + Math.random()*3); //1~3������ ����
//		
//		System.out.println(com);
		
		// 2) Random() Ŭ������ nextInt, nextDobule..
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 10; //���
		boolean state = true; // ���°� �������� ����
		
		while(true) {
//			count = count+1;
			count++;
			if (count > TRY_NUMBER) {
				state = false; // ���н� ���� ��ȯ
				break;
			}
			rand.setSeed(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis());
			int com = 1 + rand.nextInt(3);

			System.out.print("����(1),����(2),��(3) >> ");
			int user  = scan.nextInt();
			
			if(com == 1) 	  System.out.println("��ǻ�� : ����");
			else if(com == 2) System.out.println("��ǻ�� : ����");
			else 			  System.out.println("��ǻ�� : ��");
			
			int result = user - com;
			if(result==0) 						 System.out.println("���º�!");
			else if(result == -1 || result == 2) System.out.println("��ǻ�� ��!");
			else {
				System.out.println("����� ��!");
				break;
			}
		}	
	System.out.println("===================");
	if(state) //if(state == true)
		System.out.println("����� �¸�!");
	else
		System.out.println("�õ�Ƚ�� �ʰ�!");
		
//		int dual = 0;
//		dual = com - user;
//		String result = "a";
//		
//		switch (dual) {
//		case 0 :
//			result = "���º�";
//			break;
//		case 1 :case -2:
//			result = "��ǻ�� ��";
//			break;
////		case -1:case 2:
////			result = "����� ��";
////			break;
//		default :
//			result = "����� ��";
//			break;			
//		}
//		String com2 = "b";
//		
//		switch (com) {
//		case 1 :
//			com2 = "����";
//			break;
//		case 2 :
//			com2 = "����";
//			break;
//		case 3 :
//			com2 = "��";
//			break;
//		}
//		System.out.println("��ǻ�ʹ� " + com2 + " �� �½��ϴ�.");
//		System.out.println("����� " + result + " �Դϴ�.");
		scan.close();
	}
}