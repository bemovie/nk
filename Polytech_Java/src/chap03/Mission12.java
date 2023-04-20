package chap03;

public class Mission12 {

//<로또생성기 개발>
// 미션1. 정수 배열에 7개의 난수를 넣어라.
	
	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		String names[] = {"엄남경", "정성호", "이유진"};
	
		//배열에 값 입력
		for(int i=0; i<7; i++) {
			lotto_num[i] = 1 + (int)(Math.random() * 45); // 1~45까지 난수 생성
			for(int j=0; j<i; j++)
				if(lotto_num[i] == lotto_num[j])i--;
		}	
		//배열에 값 출력
//		for(int i=0; i<7; i++)
//			System.out.printf("%5d", lotto_num[i]);
		
		//for each문을 이용한 값 출력
		for(int num : lotto_num)
			System.out.printf("%5d", num);
		
			System.out.println();
		
		for(String name : names)
			System.out.print(name + " ");
		
	}

}
