package basic.ch09;

public class Warrior {
	
	String warriorName;
	int healthPoint;
	int attackPoint;
	int defensePoint;
	
	public Warrior(String name) {
		warriorName = name;
	}
	
	// 공격
	public void wAttack(int power) {
		attackPoint = power;
	}
	
	// 방어
	public void wDefense(int shield) {
		defensePoint = shield;
	}
	
	// 체력
	public void wHealth(int hp) {
		healthPoint = hp; 
	}
	
	// 상태창
	public void showInfo() {
		System.out.println("이름 : " + warriorName);
		System.out.println("체력 : " + healthPoint);
		System.out.println("공격력 : " + attackPoint);
		System.out.println("방어력 : " + defensePoint);
	}
	
}
