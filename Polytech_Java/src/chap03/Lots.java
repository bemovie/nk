package chap03;

import java.util.Scanner;

public class Lots {
	
	public static void main(String[] args) {

	System.out.print("�� ���� �������? >> ");
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int rand[] = new int[21];
	String member[] = {"�迩��","������","���ؼ�","���ʺ�","�ڱԸ�","�ڹα�","�ڽ���",
					   "���ֿ�","������","�ɼҿ�","������","������","�̼���","������",
					   "������","������","����ȣ","���º�","������","���Ƹ�","������"};
	
	for (int i=0 ; i < count ; i++) {
		rand[i] = (int)(Math.random()*21);	
		for (int j=0 ; j < i ; j++) 
			if (rand[i] == rand[j]) i--;
	}		
	for(int i=0; i < count; i++) {
//		if (rand[i]==0) continue;
		System.out.print(member[rand[i]] + " ");
	}
	}
}

