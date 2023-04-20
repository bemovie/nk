package chap03;

public class Mission4 {

	public static void main(String[] args) {
		//1. while문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.
		
//		int num = 1;
//		int sum = 0; //누적합 (초기화는 항상 0)
//		while (num<=10) {
//			sum +=num; //sum =sum+num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		
		//2. do-while 문 활용 : 1~10까지의 수를 합산하여 결과값(sum)을 출력하시오.
		int num = 1;
		int sum = 0; //누적합 (초기화는 항상 0)
		do {
			sum +=num; //sum =sum+num
			num++;
		}while (num<=10);
		System.out.println("sum = " + sum);
			
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
