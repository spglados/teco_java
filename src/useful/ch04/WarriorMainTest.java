package useful.ch04;

public class WarriorMainTest {
	
	public static void main(String[] args) {
		
		Warrior kingWarrior = new KingWarrior();
		kingWarrior.run();
		
		System.out.println("----------");
		
		Warrior topWarrior = new TopWarrior();
		topWarrior.run();
	}

}
