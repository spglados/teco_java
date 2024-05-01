package useful.ch04;

public abstract class Warrior {
	
	void wakeUpWarrior() {
		System.out.println("전사가 깨어납니다");
	}
	
	abstract void move();
	
	abstract void arrive();
	
	void attack() {
		System.out.println("전사가 공격합니다");
	}
	
	
	final void run() {
		wakeUpWarrior();
		move();
		attack();
		arrive();
	}
	

}
