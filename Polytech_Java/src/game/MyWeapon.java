package game;

public class MyWeapon implements weapon{
	//�Ӽ�(�ʵ�)
	private int curPower; //���� Power��
	
//	public int getCurPower() {
//		return curPower;
//	}
//
//	public void setCurPower(int curPower) {
//		this.curPower = curPower;
//	}

	@Override
	public void fire(int power) {
		this.curPower = curPower - power; // curPower���� power��ŭ ����
	}

	@Override
	public int getRestPower() {
		return this.curPower; // curPower �� ��ü
	}

	@Override
	public int charge(int power) {
		return this.curPower = curPower + power; // power ��ŭ curPower�� ����
	}
	

}
