package chap02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int 정수 = scan.nextInt();
		int 십의자리 = 정수/10;
		int 일의자리 = 정수%10;
		
		// 어떤 문법이 더 필요할까요?
		// 조건연산자
//		String msg = (십의자리 == 일의자리) ? "YES! 십의 자리와 일의 자리가 같습니다."
//				: "NO! 같지 않습니다." ;
//		System.out.println(msg);
		
		//조건식 if 활용
		String msg;
		if(십의자리 == 일의자리) {msg = "YES! 십의 자리와 일의 자리가 같습니다.";}
		else				{msg = "NO! 같지 않습니다.";}
		System.out.println(msg);
		
		
		scan.close();
		

		
		
		
		
//	Scanner scan = new Scanner(System.in);
//	System.out.print("2자리수 정수 입력(10~99) >> ");
//	int num = scan.nextInt();
//	String a;
//	if ((int)num/10 == (int)num%10)
//	a = "Yes! 10의 자리와 1의 자리가 같습니다";
//	else
//	a = "No! 10의 자리와 1의 자리가 다릅니다";
//	System.out.println(a);
//	
//	scan.close();
	
//		int a=10, b=20, c=30;
//		c = a-- + ++b;
//		System.out.println(c);	
		
		
	}
}
