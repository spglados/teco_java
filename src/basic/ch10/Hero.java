package basic.ch10;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	
	// getter, setter 메서드를 만들어 주세요
	
	// 공격받다.
		
		
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	
	public int getHp() {
		return this.hp;		
	}
	
//	public int setHp(int inputHp) {
//		if (hp < 0) {
//			System.out.println("");
//		}
//		
//	}
	
	public int getPower() {
		return this.power;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public boolean getIsDie() {
		return this.isDie;
	}
	
	

}
