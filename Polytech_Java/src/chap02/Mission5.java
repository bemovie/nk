package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();
		int 오만원권 = money/50000;
		int res = (money%50000);
		int 만원권 = res/10000;
		res = (money%10000);
		int 천원권 = res/1000;
		res = (money%1000);
		int 백원 = res/100;
		res = (money%100);
		int 오십원 = res/50;
		res = (money%50);
		int 십원 = res/10;
		res = (money%10);
		int 일원 = res/1;
		System.out.println("오만원권 : " + 오만원권);
		System.out.println("만원권 : " + 만원권);
		System.out.println("천원권 : " + 천원권);
		System.out.println("백원 : " + 백원);
		System.out.println("오십원 : " + 오십원);
		System.out.println("십원 : " + 십원);
		System.out.println("일원 : " + 일원);
		
//		System.out.println("오만원권 : " + money/50000 + "매");
//		System.out.println("만권 : " + money%50000/10000 + "매");
//		System.out.println("천원권 : " + money%50000%10000/1000 + "매");
//		System.out.println("백원 : " + money%50000%10000%1000/100 + "개");
//		System.out.println("오십원 : " + money%50000%10000%1000%100/50 + "개");
//		System.out.println("십원 : " + money%50000%10000%1000%100/10 + "개");
//		System.out.println("일원 : " + money%50000%10000%1000%100%10 + "개");
		
		scan.close();
	}

}
