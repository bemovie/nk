package chap03;

public class Mission4 {

	public static void main(String[] args) {
		//1. while�� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.
		
//		int num = 1;
//		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
//		while (num<=10) {
//			sum +=num; //sum =sum+num
//			num++;
//		}
//		System.out.println("sum = " + sum);
		
		
		//2. do-while �� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.
		int num = 1;
		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
		do {
			sum +=num; //sum =sum+num
			num++;
		}while (num<=10);
		System.out.println("sum = " + sum);
			
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
