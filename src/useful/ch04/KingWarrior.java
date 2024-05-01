package useful.ch04;

public class KingWarrior extends Warrior{

	@Override
	void move() {
		System.out.println("전사의 왕이 던전으로 움직입니다");
		
	}

	@Override
	void arrive() {
		System.out.println("전사의 왕이 던전에 도착했습니다");
	}

}
