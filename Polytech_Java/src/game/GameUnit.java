package game;

import java.util.Scanner;

public class GameUnit {
	static int bossPower = 2000;
	private int unitPower = 500;
    private MyWeapon weapon; 
    private String name;
//    private Scanner scan;
    
    //생성자 메소드 구현
    public GameUnit(String name) {
    	this.name = name;
    	weapon = new MyWeapon();
    	weapon.charge(unitPower); // curPower를 초기값 0에서 unitPower 500만큼 충전
//    	weapon.setCurPower(unitPower);
//    	weapon.fire(unitPower);
//    	weapon.getRestPower();
    }
    
    //attack 메소드 구현
    void attack(int power) {
//    	if(weapon.getRestPower() <= 0) {
//    	weapon.charge(unitPower);
//    	}
//    	else 
    	{
    	GameUnit.bossPower = bossPower - power;
    	weapon.fire(power);	// curPower에서 power만큼 차감
    	System.out.println("남겨진 " + name + "Power : "  + weapon.getRestPower());
//    	weapon.getCurPower();
    	}
    }
    
    //charge 메소드 구현
    void charge(int power) {

    	weapon.charge(power); // power 만큼 curPower를 증가
    	System.out.println("남겨진 " + name + "Power : " + weapon.getRestPower());
    	
    	}     
    
	public static void main(String[] args) {
		
		GameUnit unit1 = new GameUnit("Unit1");
		GameUnit unit2 = new GameUnit("Unit2");
		
		
	while (true) {
    	
		int rand = (int) (Math.random()*unit1.weapon.getRestPower()); //Unit의 Power에 비례해서 데미지 설정
		int rand1 = (int) (Math.random()*(unit1.unitPower-unit1.weapon.getRestPower())); //Unit의 Power에 반비례해서 데미지 설정
		System.out.println(unit1.name + " 행동 선택 (" + unit1.weapon.getRestPower() + ") : 1.공격 2.충전 >>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		switch (a) {
			case 1 :
			{
				
				if (unit1.weapon.getRestPower() <= 0)
					System.out.println("공격 불가 상태입니다~");
				
				else
				{
					System.out.println(rand + "만큼 공격하였습니다~");
					System.out.println("===================================");
					unit1.attack(rand);
					System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
					System.out.println("===================================");
					
				}
				break;
				
				
			}
			
			case 2: 
			{
				System.out.println(rand1 + "만큼 충전하였습니다~");
				System.out.println("===================================");
				unit1.charge(rand1);
				System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
				System.out.println("===================================");
				break;
	    	}
			
		}
		
		if(GameUnit.bossPower <=0) 
    	{
    		System.out.println(unit1.name + "의 게임승리! - 게임 종료합니다.");
    		System.exit(0);
    	}
		
		int rand2 = (int) (Math.random()*unit2.weapon.getRestPower());
		int rand3 = (int) (Math.random()*(unit2.unitPower-unit2.weapon.getRestPower()));
		
		System.out.println(unit2.name + " 행동 선택 (" + unit2.weapon.getRestPower() + ") : 1.공격 2.충전 >>");
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		switch (b) {
		case 1 :
		{
			
			if (unit2.weapon.getRestPower() <= 0)
				System.out.println("공격 불가 상태입니다~");
			
			else
			{
				System.out.println(rand2 + "만큼 공격하였습니다~");
				System.out.println("===================================");
				unit2.attack(rand2);
				System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
				System.out.println("===================================");
			}
			break;
			
		}
		
		case 2:
		{
			System.out.println(rand3 + "만큼 충전하였습니다~");
			System.out.println("===================================");
			unit2.charge(rand3);
			System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
			System.out.println("===================================");
			break;
    	}
	}
		if(GameUnit.bossPower <=0) 
    	{
    		System.out.println(unit2.name + "의 게임승리! - 게임 종료합니다.");
    		System.exit(0);
    	}
		
		
//	    while(true){
//	    	unit1.attack(300);
////	    	System.out.println(unit1.getCurPower());
//	    	unit2.attack(50);
////	        unit1.weapon.charge(100);
//
//	    	
//	    	if(GameUnit.bossPower <=0) {
//	    		System.out.println("게임승리! - 게임 종료합니다.");
//	    		System.exit(0);
//	    	}
//	    	else
//	    		System.out.println("남겨진 bossPower : " + GameUnit.bossPower);
//	    
//	    }
		
		
		
	}

}
}
