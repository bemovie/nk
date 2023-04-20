package chap01;

//정수형의 2개의 input parameter를 입력받은 후
//더 큰 수를 return 하는 max 메소드를 작성하라.

public class Mission2 {
	public static int max(int x, int y) {
		if (x > y)
			return x;
		else if(x == y)
			return -1;
		else
		return y;
	}		
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		if (max(x,y) == -1)
			System.out.println("두 값은 같습니다.");
		else
			System.out.println("더 큰 수는 : " + max(x,y));
	}
}
