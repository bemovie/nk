package chap04;

public class MethodSample {

	
	//메소드 오버로딩
	int getSum(int x, int y) {return x+y;}
	int getSum(int x, int y, int z) {return x+y+z;}
	//	double getSum(int x, int y) {return (double)(x+y);}
	// parameter의 갯수와 타입이 모두 같기 때문에 오버로딩 불가
	double getSum(double x, double y) {return (double)(x+y);} 

	
	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1,2));
		//static이 아닌 아이들 접근 방법
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(2.0,3.0));

	}

}
