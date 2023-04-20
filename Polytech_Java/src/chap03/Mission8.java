package chap03;

public class Mission8 {

	public static void main(String[] args) {
		
//		int count = 0;
//		for (int i=1 ; i<=31 ; i++) {
//			count++;
//			
//			if (count%8 == 0)
//				System.out.println();
//			System.out.printf("%5d", i);
//		}
		
		int count = 0;
		for (int i=1 ; i<=31 ; i++) {
			count++;
			System.out.printf("%5d", i);
			if (count%7 == 0)
				System.out.println();	
		}
		
		
//		for (int i=1 ; i<=31 ; i++) {
//			System.out.print(i + " ");
//			if (i%7 == 0)
//			System.out.println();
//		}
		
		
	}
}
