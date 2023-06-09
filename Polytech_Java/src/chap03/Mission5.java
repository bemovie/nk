package chap03;

public class Mission5 {

	public static void main(String[] args) {
		//1. 1~100까지의 숫자중의 13의 배수만 합산하라.
		int sum = 0;
		for(int num=1 ; num<=100; num++)
			if(num%13==0) sum += num;
		System.out.println("sum = " + sum);	
		
		//2. 1~100까지의 숫자중의 13이 되기 전까지만 합산하라.
		sum = 0;
		for(int num=1 ; num<=100; num++) {
			if(num%13==0) break;
			sum += num;
		}
		System.out.println("sum = " + sum);
		
		//3. 1~100까지의 숫자중의 13의 배수를 제외한 숫자만 합산하라.
		sum = 0;
		for(int num=1 ; num<=100; num++) {
			if(num%13==0) continue;
			sum += num;
		}
		
		System.out.println("sum = " + sum);	
		
//		int num = 1;
//		int sum = 0; //누적합 (초기화는 항상 0)
//		while (num<=10) {
//			sum +=num; //sum =sum+num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		
		//2. do-while 문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.
//		int num = 1;
//		int sum = 0; //누적합 (초기화는 항상 0)
//		do {
//			sum +=num; //sum =sum+num
//			num++;
//		}while (num<=10);
//		System.out.println("sum = " + sum);
			
		//3. for문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.	
//		System.out.println("sum = " + sum);
//		
//		
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum +=num;
//		
//		System.out.println("sum = " + sum);
		
	}
}
