package chap03;

public class Mission12 {

//<�ζǻ����� ����>
// �̼�1. ���� �迭�� 7���� ������ �־��.
	
	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		String names[] = {"������", "����ȣ", "������"};
	
		//�迭�� �� �Է�
		for(int i=0; i<7; i++) {
			lotto_num[i] = 1 + (int)(Math.random() * 45); // 1~45���� ���� ����
			for(int j=0; j<i; j++)
				if(lotto_num[i] == lotto_num[j])i--;
		}	
		//�迭�� �� ���
//		for(int i=0; i<7; i++)
//			System.out.printf("%5d", lotto_num[i]);
		
		//for each���� �̿��� �� ���
		for(int num : lotto_num)
			System.out.printf("%5d", num);
		
			System.out.println();
		
		for(String name : names)
			System.out.print(name + " ");
		
	}

}
