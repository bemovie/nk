package chap04;

public class Book {
	//�ʵ� : �������
	String title;
	String author;
	String name = "����ȣ";
	//�޼ҵ�
	//�����ڸ޼ҵ�
	Book(){
		System.out.println(name);
	}
	Book(String title){
//		this(); //�����ڵ� �߿��� �Ķ���Ͱ� �ƹ��͵� ���� �긦 ȣ��
		this("", ""); //�����ڵ� �߿��� �Ķ���Ͱ� String, String���� �̷���� �긦 ȣ�� 
		this.title = title;
		this.author = "�۰��̻�";
	}
	Book(String title, String author) {
		System.out.println("������ ȣ���");
		this.title = title;	//���������� �޾Ƽ� ��������� ����
		this.author = author;		
	}
	//�Ϲݸ޼ҵ�
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book littlePrince = new Book("�����", "�������丮"); //��ü(�ν��Ͻ�)����. �����ڰ� �����Ҵ�
		Book loveStory = new Book("������"); //��ü�� �����Ҷ����� ������ ���ε��� ���� (stack�������� push,pop)
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "���̿���";
		System.out.println(book.title);
	}

}


