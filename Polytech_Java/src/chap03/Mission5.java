package chap03;

public class Mission5 {

	public static void main(String[] args) {
		//1. 1~100������ �������� 13�� ����� �ջ��϶�.
		int sum = 0;
		for(int num=1 ; num<=100; num++)
			if(num%13==0) sum += num;
		System.out.println("sum = " + sum);	
		
		//2. 1~100������ �������� 13�� �Ǳ� �������� �ջ��϶�.
		sum = 0;
		for(int num=1 ; num<=100; num++) {
			if(num%13==0) break;
			sum += num;
		}
		System.out.println("sum = " + sum);
		
		//3. 1~100������ �������� 13�� ����� ������ ���ڸ� �ջ��϶�.
		sum = 0;
		for(int num=1 ; num<=100; num++) {
			if(num%13==0) continue;
			sum += num;
		}
		
		System.out.println("sum = " + sum);	
		
//		int num = 1;
//		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
//		while (num<=10) {
//			sum +=num; //sum =sum+num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		
		//2. do-while �� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.
//		int num = 1;
//		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
//		do {
//			sum +=num; //sum =sum+num
//			num++;
//		}while (num<=10);
//		System.out.println("sum = " + sum);
			
		//3. for�� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.	
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
