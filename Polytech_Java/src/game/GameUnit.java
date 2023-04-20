package game;

import java.util.Scanner;

public class GameUnit {
	static int bossPower = 2000;
	private int unitPower = 500;
    private MyWeapon weapon; 
    private String name;
//    private Scanner scan;
    
    //������ �޼ҵ� ����
    public GameUnit(String name) {
    	this.name = name;
    	weapon = new MyWeapon();
    	weapon.charge(unitPower); // curPower�� �ʱⰪ 0���� unitPower 500��ŭ ����
//    	weapon.setCurPower(unitPower);
//    	weapon.fire(unitPower);
//    	weapon.getRestPower();
    }
    
    //attack �޼ҵ� ����
    void attack(int power) {
//    	if(weapon.getRestPower() <= 0) {
//    	weapon.charge(unitPower);
//    	}
//    	else 
    	{
    	GameUnit.bossPower = bossPower - power;
    	weapon.fire(power);	// curPower���� power��ŭ ����
    	System.out.println("������ " + name + "Power : "  + weapon.getRestPower());
//    	weapon.getCurPower();
    	}
    }
    
    //charge �޼ҵ� ����
    void charge(int power) {

    	weapon.charge(power); // power ��ŭ curPower�� ����
    	System.out.println("������ " + name + "Power : " + weapon.getRestPower());
    	
    	}     
    
	public static void main(String[] args) {
		
		GameUnit unit1 = new GameUnit("Unit1");
		GameUnit unit2 = new GameUnit("Unit2");
		
		
	while (true) {
    	
		int rand = (int) (Math.random()*unit1.weapon.getRestPower()); //Unit�� Power�� ����ؼ� ������ ����
		int rand1 = (int) (Math.random()*(unit1.unitPower-unit1.weapon.getRestPower())); //Unit�� Power�� �ݺ���ؼ� ������ ����
		System.out.println(unit1.name + " �ൿ ���� (" + unit1.weapon.getRestPower() + ") : 1.���� 2.���� >>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		switch (a) {
			case 1 :
			{
				
				if (unit1.weapon.getRestPower() <= 0)
					System.out.println("���� �Ұ� �����Դϴ�~");
				
				else
				{
					System.out.println(rand + "��ŭ �����Ͽ����ϴ�~");
					System.out.println("===================================");
					unit1.attack(rand);
					System.out.println("������ bossPower : " + GameUnit.bossPower);
					System.out.println("===================================");
					
				}
				break;
				
				
			}
			
			case 2: 
			{
				System.out.println(rand1 + "��ŭ �����Ͽ����ϴ�~");
				System.out.println("===================================");
				unit1.charge(rand1);
				System.out.println("������ bossPower : " + GameUnit.bossPower);
				System.out.println("===================================");
				break;
	    	}
			
		}
		
		if(GameUnit.bossPower <=0) 
    	{
    		System.out.println(unit1.name + "�� ���ӽ¸�! - ���� �����մϴ�.");
    		System.exit(0);
    	}
		
		int rand2 = (int) (Math.random()*unit2.weapon.getRestPower());
		int rand3 = (int) (Math.random()*(unit2.unitPower-unit2.weapon.getRestPower()));
		
		System.out.println(unit2.name + " �ൿ ���� (" + unit2.weapon.getRestPower() + ") : 1.���� 2.���� >>");
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		switch (b) {
		case 1 :
		{
			
			if (unit2.weapon.getRestPower() <= 0)
				System.out.println("���� �Ұ� �����Դϴ�~");
			
			else
			{
				System.out.println(rand2 + "��ŭ �����Ͽ����ϴ�~");
				System.out.println("===================================");
				unit2.attack(rand2);
				System.out.println("������ bossPower : " + GameUnit.bossPower);
				System.out.println("===================================");
			}
			break;
			
		}
		
		case 2:
		{
			System.out.println(rand3 + "��ŭ �����Ͽ����ϴ�~");
			System.out.println("===================================");
			unit2.charge(rand3);
			System.out.println("������ bossPower : " + GameUnit.bossPower);
			System.out.println("===================================");
			break;
    	}
	}
		if(GameUnit.bossPower <=0) 
    	{
    		System.out.println(unit2.name + "�� ���ӽ¸�! - ���� �����մϴ�.");
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
//	    		System.out.println("���ӽ¸�! - ���� �����մϴ�.");
//	    		System.exit(0);
//	    	}
//	    	else
//	    		System.out.println("������ bossPower : " + GameUnit.bossPower);
//	    
//	    }
		
		
		
	}

}
}
