package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
//		String data = "홍길동,010-1234-5678,서울시,학생";
//		StringTokenizer st = new StringTokenizer(data,",");
		
		String data = "홍길동,남,65,170/김세영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";
		StringTokenizer st = new StringTokenizer(data, "/");
		
		int sum = 0;
		int count = 0;
		
		while(st.hasMoreTokens()) {
			StringTokenizer st1 = new StringTokenizer(st.nextToken(), ",");
			//nextToken()의 데이터 타입은 String
			while(st1.hasMoreTokens()) {
//				st1.nextToken();
				if (st1.nextToken().equals("남"))
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
//			System.out.println("이름 : " + st.nextToken());
//			System.out.println("전화번호 : " + st.nextToken());
//			System.out.println("주소 : " + st.nextToken());
//			System.out.println("직업 : " + st.nextToken());
//		}
				
		}
		
		System.out.println("남자들의 평균 체중 : " + ((double)sum/count));
		
	}
}
