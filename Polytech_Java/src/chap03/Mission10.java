package chap03;

import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		int sum = 0, count = 0; //����, ������ ����
		double average = 0.0; //���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� (����) : ");
		int n = 0;
	
		do{
			
			sum += n;
			count++;
			n = scan.nextInt();
			
		}while(n!=-1); 		 // ��Ƽ��, ���ʰ� -1
		count = count -1;
		if(count>0) {
			System.out.println("������ ���� : " + count + "��");
			average = (double)sum / count;
			System.out.printf("��� : %.2f", average);
		}
		else
			System.out.println("������ ������ 0�̶�, ����� ���� ���� �����ϴ�.");
		
		

		

//		System.out.print("������ ������ " + count + "���̸� ");
//		System.out.println("����� " + (double)sum/count + "�Դϴ�.");


	}

}