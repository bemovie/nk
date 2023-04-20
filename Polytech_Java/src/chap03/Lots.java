package chap03;

import java.util.Scanner;

public class Lots {
	
	public static void main(String[] args) {

	System.out.print("몇 명을 뽑을까요? >> ");
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int rand[] = new int[21];
	String member[] = {"김여원","김정현","김준성","김초봄","박규리","박민규","박슬기",
					   "박주연","박지원","심소영","오연경","윤진수","이성진","이유진",
					   "이태형","전병남","정성호","정승복","정웅기","조아름","최지현"};
	
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

