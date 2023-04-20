package chap05;

class Person{
	String name;
	int id;
	public Person(String name) {this.name = name;}
}
class Student extends Person{
	String grade;
	String depart;
	public Student(String name) {super(name);}
	
}	

public class UpcastingEx {
	public static void main(String[] args) {
		//Upcasting
		Person p = new Student("정성호");
		System.out.println(p.name);
//		System.out.println(p.grade); //실행안됨. 이제 Student의 grade는 접근 못한다
		Student s = new Student("홍길동");
		System.out.println(s.grade);
		
		//Downcasting
//		Student s1 = (Student)new Person("김영희"); // X. 미지의 영역을 사용할수 없음
		Student s2 = (Student)p; // 있는 영역을 다시 사용. Student로 만들었던 아이를 Upcasting 하고 다시 Downcasting
		System.out.println(s2.name);
		s2.depart = "하이테크";
		System.out.println(s2.depart);
		
		if(p instanceof Person)	System.out.println("Person");
		else					System.out.println("Person 아니야");
	}
}
