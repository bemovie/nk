package chap05;

class Point {
	private int x, y;

	void set(int x, int y) {this.x = x;this.y = y;}
	void showPoint() {System.out.println("(" + x + "," + y + ")");}
}

class ColorPoint extends Point {
	private String color;
	public void setColor(String color){
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(this.color);
//		System.out.println("(" + super.x + "," + super.y + ")");} //private 막아놔서 super로도 접근못한다
		super.showPoint(); // 부모의 showPoint 함수 (super를 생략하면 자식의 showPoint가 있는지 먼저 확인, 없으면 부모껄 가져옴)
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}
	
}