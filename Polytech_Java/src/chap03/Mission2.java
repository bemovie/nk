package chap03;

import java.util.Random;
import java.util.Scanner;

// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com 은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 로 중에 결정해서 프로그램 작성


public class Mission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1) Math.random() 메소드를 활용해서 난수를 생성	
//		int com = (int)(1 + Math.random()*3); //1~3사이의 난수
//		
//		System.out.println(com);
		
		// 2) Random() 클래스의 nextInt, nextDobule..
		Random rand = new Random();
		int count = 0;
		final int TRY_NUMBER = 10; //상수
		boolean state = true; // 상태가 성공임을 가정
		
		while(true) {
//			count = count+1;
			count++;
			if (count > TRY_NUMBER) {
				state = false; // 실패시 상태 전환
				break;
			}
			rand.setSeed(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis());
			int com = 1 + rand.nextInt(3);

			System.out.print("가위(1),바위(2),보(3) >> ");
			int user  = scan.nextInt();
			
			if(com == 1) 	  System.out.println("컴퓨터 : 가위");
			else if(com == 2) System.out.println("컴퓨터 : 바위");
			else 			  System.out.println("컴퓨터 : 보");
			
			int result = user - com;
			if(result==0) 						 System.out.println("무승부!");
			else if(result == -1 || result == 2) System.out.println("컴퓨터 승!");
			else {
				System.out.println("사용자 승!");
				break;
			}
		}	
	System.out.println("===================");
	if(state) //if(state == true)
		System.out.println("당신의 승리!");
	else
		System.out.println("시도횟수 초과!");
		
//		int dual = 0;
//		dual = com - user;
//		String result = "a";
//		
//		switch (dual) {
//		case 0 :
//			result = "무승부";
//			break;
//		case 1 :case -2:
//			result = "컴퓨터 승";
//			break;
////		case -1:case 2:
////			result = "사용자 승";
////			break;
//		default :
//			result = "사용자 승";
//			break;			
//		}
//		String com2 = "b";
//		
//		switch (com) {
//		case 1 :
//			com2 = "가위";
//			break;
//		case 2 :
//			com2 = "바위";
//			break;
//		case 3 :
//			com2 = "보";
//			break;
//		}
//		System.out.println("컴퓨터는 " + com2 + " 를 냈습니다.");
//		System.out.println("결과는 " + result + " 입니다.");
		scan.close();
	}
}