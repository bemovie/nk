package chap03;

import java.util.Random;
import java.util.Scanner;

// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �� �߿� �����ؼ� ���α׷� �ۼ�


public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//1. ��ǻ�� ���� �����Ѵ�.
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1 + rand.nextInt(99);
		final int try_number = 7;	//�ִ�õ�Ƚ��, ����� ǥ��(�ʱ�ȭ�� ����, ����Ұ���)
		int count = 0;				//�õ�Ƚ���� ���� ī��Ʈ
		boolean state = true;		//���º��� (�����̶�� ����)
		
		//3. �ݺ��� �Ѵ� (try_numberȽ������, �����Ҷ�����)
		 //do {
		while(true) {
			count++;
			if(count > try_number) {
				state = false;
				break;
			}
		
		//2. ������ �Ѵ�.
			System.out.println("������Է�(1~99)>>");
			int user = scan.nextInt(); //1~99
			
			if(user > com) 		System.out.println("user�� down ����!");
			else if(user < com)	System.out.println("user�� up ����!");
			else break; 		//System.out.println("����!");
		} //while(true);
		
		if(state) 	System.out.println("���߼̽��ϴ�!!");
		else		System.out.println("�����ϼ̽��ϴ�!! �õ�Ƚ���� " + (count-1));
	}
//		int count = 0;
//		final int TRY_NUMBER = 7;
//		boolean state = true; 
//		
//		while(true) {
//
//			count++;
//			if (count > TRY_NUMBER) {
//				state = false; 
//				break;
//			}
//
//			System.out.print("\"UP-DOWN ����\" 1~99������ ���� �Է� >> ");
//			int user  = scan.nextInt();
//			
//			int result = user - com;
//			if(result == 0)
//				break;
//			else if(result > 0) {
//				System.out.println("�õ�Ƚ��: " + count);
//				System.out.println("down ����!");
//			}
//			else if(result < 0) {
//				System.out.println("�õ�Ƚ��: " + count);
//				System.out.println("up ����!");
//			}
//		}
//	System.out.println("===================");
//	if(state) //if(state == true) 
//	{
//		System.out.println("��ǻ���� ���ڴ� " + com + ". �����Դϴ�~");
//		System.out.println("���� �õ�Ƚ�� : " + count);
//		System.out.println("���� : �̰��!");
//	}
//	else
//		System.out.println("�����ߴ�!!");
//
//		scan.close();
}
