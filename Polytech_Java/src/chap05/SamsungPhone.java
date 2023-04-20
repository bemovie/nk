package chap05;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	abstract void sendCall();
	abstract void receiveCall();
	default void printLogo() {System.out.println("**Phone**");} 
	//default로 설정하지 않고 생략하면 abstract로 인식해 오류발생
	}

//implements는 다중 상속 가능하다. 부모는 아니고 이모 느낌
public class SamsungPhone implements PhoneInterface{
		@Override
		public void sendCall() {
			System.out.println("띠리리리링~");
			}
		@Override
		public void receiveCall() {
			System.out.println("전화가 왔습니다.");
		}
		
		public static void main(String[] args) {
			SamsungPhone phone = new SamsungPhone();
			phone.sendCall();
			phone.receiveCall();
			phone.printLogo();
			System.out.println(phone.TIMEOUT);
	}

}
