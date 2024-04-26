package starcraft.ver02;

public class Hatchery {
	
	private int hatcheryNumber;
	private int count;
	
	//생성자
	public Hatchery(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getHatcheryNumber() {
		return hatcheryNumber;
	}
	
	// 저글링을 생산하는 기능
	public Zergling createZegling(String name) {
		count++;
		return new Zergling(name);
	}
	

}
