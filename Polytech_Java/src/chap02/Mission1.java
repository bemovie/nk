package chap02;

public class Mission1 {

	public static void main(String[] args) {
		boolean result;
		result = 3==5;
		System.out.println(result);
		System.out.println("==============");
		
		int a = (int) 3.5;
		
		int plain = 10; //평문//
		int key = 8; //키값//
		int cyper = plain ^ key; //암호문//
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper^key));
		System.out.println("==============");
		System.out.println(10 >> 1);
		System.out.println(10 << 1);
		
		System.out.println("==============");
		var v = 30;
		System.out.println(v);
	}

}
