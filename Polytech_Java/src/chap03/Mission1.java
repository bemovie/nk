package chap03;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//1. while 문 사용
		System.out.println("토익점수 >> ");
		int toeic = scan.nextInt();

//		while(toeic<700) {
//			System.out.println("공부를 하세요!");
//			System.out.println("시험을 보세요!");
//			System.out.println("토익점수 >> ");
//			toeic = scan.nextInt();	
//			
//		}
//		
//		System.out.println("드디어 토익 탈출!!!");
		
		while(true) { //무한반복(무한루프)
			if(toeic>=700) break;
			System.out.println("공부를 하세요!");
			System.out.println("시험을 보세요!");
			System.out.println("토익점수 >> ");
			toeic = scan.nextInt();	
		}
		
		System.out.println("드디어 토익 탈출!!!");
		
		//2. do-while문 활용
//		do {
//			System.out.println("공부를 하세요!");
//			System.out.println("시험을 보세요!");
//			
//			System.out.println("토익점수 >> ");
//			int toeic = scan.nextInt();
//		}
//		while(toeic<700) {	
//			System.out.println("공부를 하세요!");
//			System.out.println("시험을 보세요!");
//			System.out.println("토익점수 >> ");
//			toeic = scan.nextInt();	
//			
//		}
//		
//		System.out.println("드디어 토익 탈출!!!");
		
	}

}
