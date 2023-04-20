package chap04;

public class ArrayParameterEx {

	static void printCharArray(char a[]){
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i]);
		for(char aa : a)
			System.out.print(aa);
		System.out.println();
	}
	
	static void replaceSpace(char a[]){
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ')
				a[i] = '♥';
	}
			
	
	public static void main(String[] args) {
		char c[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U', '.'};

		printCharArray(c); // main이 static이므로 printCharArray에 static이 붙어야 불러올 수 있다
		replaceSpace(c);
		printCharArray(c);
		
//		ArrayParameterEx s = new ArrayParameterEx();
//		s.printCharArray(c);
//		s.replaceSpace(c);
//		s.printCharArray(c);

	}

}
