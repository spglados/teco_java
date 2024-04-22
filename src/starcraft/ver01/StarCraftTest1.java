package starcraft.ver01;

public class StarCraftTest1 {
	public static void main(String[] args) {
		
		// 질럿 2
		// 마린 2
		// 저글링 2
		
		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine2 = new Marine("질럿2");
		
		for (int i = 0; i < 10; i++) {
			zealot1.attackMarine(marine2);
		}
		marine2.showInfo();

	} // end of main

} // end of class
