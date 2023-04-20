package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mission15 {

	public Mission15(){}
	
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e){
//			e.printStackTrace();
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum);
		scanner.close();

		
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}

	}

}
