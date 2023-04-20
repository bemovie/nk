package chap04;

public class Cylinder {
	Cylinder(){};
	public Circle c;
	public Double height;
//	Circle c = new Circle();
	public Double getVolume() {
		return c.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder d = new Cylinder();
		d.c = new Circle("원통", 2.8); //Circle.c = new Circle("원통", 2.8);
		d.height = 5.6;
		System.out.println(d.getVolume());

	}

}
