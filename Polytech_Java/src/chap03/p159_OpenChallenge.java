package chap03;


import java.util.Scanner;

public class p159_OpenChallenge {

	public static void main(String[] args) {

		while(true) {
			
			int card_number = (int)(Math.random() * 100);	
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			int low = 0;
			int high = 99;
			int count = 0;
			
//		System.out.println(card_number);
			
			while(true) {
				
				System.out.println(low + "-" + high);
				count++;
				System.out.print(count + ">>");
				Scanner scan = new Scanner(System.in);
				int guess_number = scan.nextInt();
				
				if (card_number > guess_number) {
					System.out.println("�� ����");
					low = guess_number+1;
				}
				
				else if (card_number < guess_number) {
					System.out.println("�� ����");
					high = guess_number-1;
				}	
				
				else if (card_number == guess_number) {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				
			}
			
			System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			Scanner scan2 = new Scanner(System.in);
			String response = scan2.next();
			if (response.equals("y"))
				continue;
			else
				System.out.println("�����ϴ�.");
				break;
			
			}	
	
	}
	
}
