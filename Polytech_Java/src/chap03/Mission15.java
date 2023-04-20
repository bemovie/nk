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
			System.out.println("0���δ� ���� �� �����ϴ�.");
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
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // ���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue; // ���� ����
			}
			sum += n; // ���ϱ�
		}
		System.out.println("���� " + sum);
		scanner.close();

		
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}

	}

}
