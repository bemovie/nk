package chap03;

import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		int sum = 0, count = 0; //총합, 정수의 갯수
		double average = 0.0; //평균
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 (띄어쓰기) : ");
		int n = 0;
	
		do{
			
			sum += n;
			count++;
			n = scan.nextInt();
			
		}while(n!=-1); 		 // 센티널, 보초값 -1
		count = count -1;
		if(count>0) {
			System.out.println("정수의 갯수 : " + count + "개");
			average = (double)sum / count;
			System.out.printf("평균 : %.2f", average);
		}
		else
			System.out.println("정수의 갯수가 0이라, 평균을 구할 수가 없습니다.");
		
		

		

//		System.out.print("정수의 개수는 " + count + "개이며 ");
//		System.out.println("평균은 " + (double)sum/count + "입니다.");


	}

}
