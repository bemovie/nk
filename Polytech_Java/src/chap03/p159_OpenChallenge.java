package chap03;


import java.util.Scanner;

public class p159_OpenChallenge {

	public static void main(String[] args) {

		while(true) {
			
			int card_number = (int)(Math.random() * 100);	
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int low = 0;
			int high = 99;
			int count = 0;
			
//		System.out.println(card_number);
			
			while(true) {
				
				System.out.println(low + "-" + high);
				count++;
				System.out.print(count + ">>");
				Scanner scan = new Scanner(System.in);
				int guess_number = scan.nextInt();
				
				if (card_number > guess_number) {
					System.out.println("더 높게");
					low = guess_number+1;
				}
				
				else if (card_number < guess_number) {
					System.out.println("더 낮게");
					high = guess_number-1;
				}	
				
				else if (card_number == guess_number) {
					System.out.println("맞았습니다.");
					break;
				}
				
			}
			
			System.out.println("다시하시겠습니까(y/n)>>");
			Scanner scan2 = new Scanner(System.in);
			String response = scan2.next();
			if (response.equals("y"))
				continue;
			else
				System.out.println("끝냅니다.");
				break;
			
			}	
	
	}
	
}
