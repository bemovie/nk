package chap04;

public class Student2 {
	//�Ӽ� (�ʵ�)
	private String name;	//��ü�� ������� ���� ���� ���ϵ��� private(������) �޾��� = ĸ��ȭ
	private int age;		//getters & setters�� ���ؼ� ����
	private int id;
	
	//���� (�޼ҵ�)
	//������ �޼ҵ� : �ʱ�ȭ�� �ϱ� ���� ����
	public Student2() {
		super(); //�ƹ��͵� ������� �ʾҴµ� super��� ������ object�� ����Ѱ�
	}
	
	
	public Student2(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	

	//�Ϲ� �޼ҵ� : ������ �����ϱ� ���� ����
	//������ : �����ε�(overloading)
	void study() {System.out.println("�����մϴ�.");}
	void study(String test) {System.out.println(test + "���θ� �մϴ�.");}
	void eat() {System.out.println("�Խ��ϴ�.");}
	void eat(String meat) {System.out.println(meat + "��⸦ �Խ��ϴ�.");}
	void sleep() {System.out.println("��ϴ�.");}
	boolean test(String test, int score) {
		System.out.println(test + "������ �ñ���!");
		if (score >= 60)	return true;
		else				return false;
	}
	
	//getters & setters (���� �����ϴ°� �ƴ϶� �����ڸ� ���ؼ� ����)
	
	
	//main �޼ҵ�
	public static void main(String[] args) {
		Student2 student = new Student2();
//		 Student2 student; //��ü�� ����
//		 new Student2(); //����Ȯ��

		student.study(); //student. �ϸ� �ȸ���͵� �ߴµ� �̰� object�� ������ ���̵�
		if (student.test("����ó�����", 80))
			System.out.println("�հ��ϼ̽��ϴ�.");
		else
			System.out.println("���հ��ϼ̽��ϴ�.");
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
