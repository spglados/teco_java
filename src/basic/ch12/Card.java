package basic.ch12;

public class Card {

	// 카드 번호(객체)가
	// 발급 될때마다 고유한
	// 카드 번호를 가질 수 있도록
	// 코드를 설계해주세요
	// 클래스 하나

	// 멤버 변수, static 변수
	
	private int cardId;
	private String name;
	private String department;
	private static String CardName = "그린카드";
	static int cardSerialNumber = 100;
	
	// 생성자
	public Card(String name) {
		this.name = name;
		this.cardId = cardSerialNumber;
		cardSerialNumber++;
	}

	// 멤버 함수
	
	// get,set 작성
	
	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
		
		
		public static void main(String[] args) {
		// 코드 테스트(메인 함수)
	

	} // end of main

} // end of class
