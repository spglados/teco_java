package useful.ch04;

public class TopWarrior extends Warrior{

	@Override
	void move() {
		System.out.println("정예전사가 전장으로 움직입니다");
		
	}

	@Override
	void arrive() {
		System.out.println("정예전사가 전장에 도착했습니다");
	}

}
