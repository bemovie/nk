package game;

public class MyWeapon implements weapon{
	//속성(필드)
	private int curPower; //현재 Power값
	
//	public int getCurPower() {
//		return curPower;
//	}
//
//	public void setCurPower(int curPower) {
//		this.curPower = curPower;
//	}

	@Override
	public void fire(int power) {
		this.curPower = curPower - power; // curPower에서 power만큼 차감
	}

	@Override
	public int getRestPower() {
		return this.curPower; // curPower 그 자체
	}

	@Override
	public int charge(int power) {
		return this.curPower = curPower + power; // power 만큼 curPower를 증가
	}
	

}
