package game;

//인터페이스 정의
public interface weapon {
	//추상메소드 정의
	public void fire(int power);
	public int getRestPower();
	public int charge(int power);
}

