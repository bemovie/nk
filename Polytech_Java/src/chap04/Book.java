package chap04;

public class Book {
	//필드 : 멤버변수
	String title;
	String author;
	String name = "정성호";
	//메소드
	//생성자메소드
	Book(){
		System.out.println(name);
	}
	Book(String title){
//		this(); //생성자들 중에서 파라미터가 아무것도 없는 얘를 호출
		this("", ""); //생성자들 중에서 파라미터가 String, String으로 이루어진 얘를 호출 
		this.title = title;
		this.author = "작가미상";
	}
	Book(String title, String author) {
		System.out.println("생성자 호출됨");
		this.title = title;	//지역변수를 받아서 멤버변수에 대입
		this.author = author;		
	}
	//일반메소드
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); //객체(인스턴스)생성. 생성자가 공간할당
		Book loveStory = new Book("춘향전"); //객체를 생성할때마다 공간을 따로따로 관리 (stack영역에서 push,pop)
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "북이에요";
		System.out.println(book.title);
	}

}


