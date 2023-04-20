package chap03;

import java.util.Random;
import java.util.Scanner;

// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com 은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 로 중에 결정해서 프로그램 작성


public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//1. 컴퓨터 값을 생성한다.
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1 + rand.nextInt(99);
		final int try_number = 7;	//최대시도횟수, 상수로 표현(초기화만 가능, 변경불가능)
		int count = 0;				//시도횟수를 위한 카운트
		boolean state = true;		//상태변수 (성공이라고 가정)
		
		//3. 반복을 한다 (try_number횟수까지, 성공할때까지)
		 //do {
		while(true) {
			count++;
			if(count > try_number) {
				state = false;
				break;
			}
		
		//2. 게임을 한다.
			System.out.println("사용자입력(1~99)>>");
			int user = scan.nextInt(); //1~99
			
			if(user > com) 		System.out.println("user값 down 시켜!");
			else if(user < com)	System.out.println("user값 up 시켜!");
			else break; 		//System.out.println("성공!");
		} //while(true);
		
		if(state) 	System.out.println("맞추셨습니다!!");
		else		System.out.println("실패하셨습니다!! 시도횟수는 " + (count-1));
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
//			System.out.print("\"UP-DOWN 게임\" 1~99까지의 값을 입력 >> ");
//			int user  = scan.nextInt();
//			
//			int result = user - com;
//			if(result == 0)
//				break;
//			else if(result > 0) {
//				System.out.println("시도횟수: " + count);
//				System.out.println("down 시켜!");
//			}
//			else if(result < 0) {
//				System.out.println("시도횟수: " + count);
//				System.out.println("up 시켜!");
//			}
//		}
//	System.out.println("===================");
//	if(state) //if(state == true) 
//	{
//		System.out.println("컴퓨터의 숫자는 " + com + ". 정답입니다~");
//		System.out.println("최종 시도횟수 : " + count);
//		System.out.println("성공 : 이겼다!");
//	}
//	else
//		System.out.println("실패했다!!");
//
//		scan.close();
}
