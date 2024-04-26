package starcraft.ver05;

public class Zealot extends Unit {


	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}


	// 질럿이 저글링을 공격합니다.
	public void attack(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 질럿이 마린을 공격합니다.
	public void attack(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다." );
		m.beAttacked(this.power);
	}
	

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

}
