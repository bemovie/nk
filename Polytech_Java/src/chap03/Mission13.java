package chap03;

public class Mission13 {
//2차원 배열
	public static void main(String[] args) {
		int H[][] = {
				{1, 0, 0, 0, 1},
				{1, 0, 0, 0, 1},
				{1, 1, 1, 1, 1},
				{1, 0, 0, 0, 1},
				{1, 0, 0, 0, 1}
		};
		
		for(int i=0; i<H.length; i++) { //행
			for(int j=0; j<H[i].length; j++) { //열
				if(H[i][j]==1) System.out.print("■");
				else 		   System.out.print(" ");
			}
			System.out.println();	
		}
		
		

	}

}
