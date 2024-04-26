package starcraft.ver05;

public class Zergling extends Unit{
	
	public Zergling(String name) {
		super(name);
		super.name = name;
		super.power = 3;
		super.hp = 50;
	}


	// 저글링이 질럿을 공격 합니다.
	public void attack(Zealot z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 저글링이 마린을 공격합니다.
	public void attack(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
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
