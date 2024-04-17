package basic.ch07;

public class Airplane {
	String name;
	String purpose;
	Long price;

	void airplaneName() {
		System.out.println("비행기 이름 : " + name);
	}

	void airplanePurpose() {
		System.out.println("목적 : " + purpose);
	}
	
	void airplanePrice() {
		System.out.println("가격 : " + price);
	}

}
