package chap04;

public class Student2 {
	//속성 (필드)
	private String name;	//객체를 만들더라도 직접 접근 못하도록 private(한정자) 달아줌 = 캡슐화
	private int age;		//getters & setters를 통해서 접근
	private int id;
	
	//행위 (메소드)
	//생성자 메소드 : 초기화를 하기 위한 목적
	public Student2() {
		super(); //아무것도 상속하지 않았는데 super라고 찍히면 object를 상속한것
	}
	
	
	public Student2(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	

	//일반 메소드 : 행위를 구현하기 위한 목적
	//다형성 : 오버로딩(overloading)
	void study() {System.out.println("공부합니다.");}
	void study(String test) {System.out.println(test + "공부를 합니다.");}
	void eat() {System.out.println("먹습니다.");}
	void eat(String meat) {System.out.println(meat + "고기를 먹습니다.");}
	void sleep() {System.out.println("잡니다.");}
	boolean test(String test, int score) {
		System.out.println(test + "시험을 봤군요!");
		if (score >= 60)	return true;
		else				return false;
	}
	
	//getters & setters (직접 접근하는게 아니라 한정자를 통해서 접근)
	
	
	//main 메소드
	public static void main(String[] args) {
		Student2 student = new Student2();
//		 Student2 student; //객체명 선언
//		 new Student2(); //공간확보

		student.study(); //student. 하면 안만든것도 뜨는데 이건 object가 정의한 아이들
		if (student.test("정보처리기사", 80))
			System.out.println("합격하셨습니다.");
		else
			System.out.println("불합격하셨습니다.");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
