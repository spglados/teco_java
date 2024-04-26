package basic.exercise;

public class PhoneBook {

//	저장 : 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다.
//	조회 : 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
//	수정 : 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
//	삭제 : 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
//	선택 조회 : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
//	Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리
//	전화번호 저장은 100까지 한정.
	
	// 속성
	
	// 기능
	
	private String name;
	private String phoneNumber;
	
	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
	}
	
	
	
} // end of class
