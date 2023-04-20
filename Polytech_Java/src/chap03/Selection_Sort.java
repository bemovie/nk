package chap03;

// IU를 확용한 선택정렬 알고리즘

public class Selection_Sort {
	
	public static void main(String[] args) {
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		System.out.print("정렬 전: ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
	
		for(int i=0; i<7; i++) // <- 반복하라
		{
			
			//최소값 알고리즘
	//		System.out.print("최소값 찾기: ");
			int min = iu_height[i]; // <- int min = iu_height[0];
			int min_index = i; // <- int min_index = 0;
			
	//		System.out.print("정렬 후: ");
			for(int j=i+1; j<8; j++) // <-for(int j=1; j<8; j++)
				if(min > iu_height[j]) {
					min = iu_height[j];
					min_index = j;
				}
		
//		System.out.print(min);
//		System.out.print("["+min_index+"]");
		
			//교환 알고리즘
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i]; //<- iu_height[min_index] = iu_height[0];
			iu_height[i] = temp; //<- iu_height[0] = temp;
		
		}
			
		System.out.print("정렬 후: ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		
	}
	
}
