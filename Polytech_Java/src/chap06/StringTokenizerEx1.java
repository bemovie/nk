package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "ȫ�浿,010-1234-5678,�����,�л�";
//		StringTokenizer st = new StringTokenizer(data,",");
		
		String data = "ȫ�浿,��,65,170/�輼��,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165";
		StringTokenizer st = new StringTokenizer(data, "/");
		
		int sum = 0;
		int count = 0;
		
		while(st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(), ",");
			//nextToken()�� ������ Ÿ���� String
			while(st1.hasMoreTokens()) {
//				st1.nextToken();
				if (st1.nextToken().equals("��"))
				{
					count++;
					sum += Integer.parseInt(st1.nextToken());
				}
				
//				st1.nextToken();
		
//				System.out.println(name);
//				System.out.println(gender);
//				System.out.println(weight);
//				System.out.println(height);		
			
			}
				
//		while(st.hasMoreTokens()) {
//			System.out.println("�̸� : " + st.nextToken());
//			System.out.println("��ȭ��ȣ : " + st.nextToken());
//			System.out.println("�ּ� : " + st.nextToken());
//			System.out.println("���� : " + st.nextToken());
//		}
				
		}
		
		System.out.println("���ڵ��� ��� ü�� : " + ((double)sum/count));
		
	}
}
