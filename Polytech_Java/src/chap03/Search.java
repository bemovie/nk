package chap03;

import java.util.Scanner;

// IU를 확용한 탐색 알고리즘

public class Search {
	
	public static void main(String[] args) {
		
		// 선택정렬====================================================
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		System.out.print("정렬 전: ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
	
		for(int i=0; i<7; i++) // <- 반복하라
		{
			
	
			int min = iu_height[i]; // <- int min = iu_height[0];
			int min_index = i; // <- int min_index = 0;
			
			for(int j=i+1; j<8; j++) // <-for(int j=1; j<8; j++)
				if(min > iu_height[j]) {
					min = iu_height[j];
					min_index = j;
				}
		
			//교환 알고리즘
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i]; //<- iu_height[min_index] = iu_height[0];
			iu_height[i] = temp; //<- iu_height[0] = temp;
		
		}
			
		System.out.print("정렬 후: ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		//========================================================
		
		// 탐색 알고리즘
		Scanner scan = new Scanner(System.in);
		
		System.out.println("순차탐색 ==========================================");
		System.out.print("검색키값 : ");
		int key = scan.nextInt();
		int key_index = -1; //검색된 값의 인덱스값, -1인 경우 실패로 가정
	
		// 순차탐색 (Sequential Search)

		for(int i=0; i<8; i++)
			if(iu_height[i] == key)
				key_index = i;
		if(key_index == -1) System.out.println("검색실패!");
		else				System.out.println("검색성공!" + key_index + "번방에 있습니다.");
	
		// 탐색 알고리즘
		
		// 이진 탐색 (Binary Search)

		int low = 0, high = 7; //low, high 초기화
		int middle = 0; //중간방의 인덱스
		System.out.println("이진탐색 ==========================================");
		System.out.print("검색키값 : ");
		key = scan.nextInt();
		key_index = -1; //검색된 값의 인덱스값, -1인 경우 실패로 가정
		
		while(low<=high)
		{
			middle = (low+high)/2;
			System.out.println("[low]" + low + "[high]" + high + 
								"[middle]" + middle + "[value]" + iu_height[middle]);
			if(key == iu_height[middle]) {
				key_index = middle;
				break;
			}
			else if(key > iu_height[middle])
				low = middle + 1;
			else if(key < iu_height[middle])
				high = middle - 1;
		}
		
		if(key_index == -1) System.out.println("검색실패!");
		else				System.out.println("검색성공!" + key_index + "번방에 있습니다.");
	
		System.out.println("원소의 갯수 : " + iu_height.length);
	
		for(int i = 0; i < iu_height.length; i++)
		System.out.println(iu_height[i] + " ");
	}
	
}
