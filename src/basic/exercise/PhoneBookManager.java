package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

//	o	1. 저장 : 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다.
//	o	2. 조회 : 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
//	o	3. 선택 조회 : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
//	o	4. 수정 : 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
//	o	5. 전체 삭제 : 전화번호부 모두 지우기
//	o	6. 선택삭제 : 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
//	o	0. 종료
//	o	Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리
//	o	전화번호 저장은 100까지 한정.

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phoneBooks = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NAME = "3";
		final String CHANGE = "4";
		final String DELETE_ALL = "5";
		final String DELETE_SELECTED_PHONENUMBER = "6";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println(">>>>>메뉴 선택<<<<<");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.수정");
			System.out.println("5.전체삭제 6.선택삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println("==저장하기==");
				save(sc, phoneBooks);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println("==전체 조회 하기==");
				readAll(phoneBooks);
			} else if (selectedNumber.equals(SEARCH_BY_NAME)) {
				System.out.println("==선택 조회 하기==");
				readByName(sc, phoneBooks);
			} else if (selectedNumber.equals(CHANGE)) {
				System.out.println("==수정 하기==");
				changePhoneNumber(sc, phoneBooks);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println("==전체 삭제 하기==");
				deleteAll(phoneBooks);
			} else if (selectedNumber.equals(DELETE_SELECTED_PHONENUMBER)) {
				System.out.println("==선택 삭제 하기==");
				deleteByName(sc, phoneBooks);
			} else if (selectedNumber.equals(END)) {
				System.out.println("==프로그램 종료==");
				flag = false;
			} else {
				System.out.println("==잘못된 선택 입니다.==");
			} // end of if
		} // end of while

	} // end of main

	// 1.저장
	public static void save(Scanner sc, PhoneBook[] PhoneBook) {
		System.out.println("----번호 저장 하기----");
		System.out.println("이름을 입력 하세요");
		String phoneNumberName = sc.nextLine();
		System.out.println("전화번호를 입력 하세요");
		String phoneNumberNumber = sc.nextLine();
		PhoneBook phoneNumber = new PhoneBook(phoneNumberName, phoneNumberNumber);

		// 번호 저장 갯수 제한
		if (LAST_INDEX_NUMBER >= PhoneBook.length) {
			System.out.println("더이상 번호를 저장할 공간이 없습니다.");
			return;
		}

		// 번호수 계산 for
		for (int i = 0; i < PhoneBook.length; i++) {
			if (PhoneBook[i] == null) {
				PhoneBook[i] = phoneNumber;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("전화번호가 저장 되었습니다.");
	}

	// 2.전체조회
	public static void readAll(PhoneBook[] phoneBooks) {
		System.out.println("vvvv전체 전화번호 목록vvvv");
		for (int i = 0; i < phoneBooks.length; i++) {
			// 방어적 코드
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getPhoneNumber());
			}
		}
	}

	// 3.선택조회
	public static void readByName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("----선택 조회 하기----");
		System.out.println("이름을 입력해주세요");
		String phoneBookName = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			// 방어적 코드
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(phoneBookName)) {
					System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getPhoneNumber());
					isFind = true;
					break;
				}
			}
		}

		if (isFind == false) {
			System.out.println("해당 이름의 전화번호는 존재하지 않습니다");
		}
	}
	
	// 4.수정하기
	public static void changePhoneNumber(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("----수정 하기----");
		System.out.println("수정할 전화번호의 이름을 입력하세요");
		String phoneBookName = sc.nextLine();
		boolean isChange = false;
		
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] !=null) {
				if (phoneBooks[i].getName().equals(phoneBookName)) {
					System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getPhoneNumber() + " 해당 전화번호를 수정합니다.");
					System.out.println("수정하고 싶은 이름으로 입력해주세요.");
					String phoneNumberName = sc.nextLine();
					phoneBooks[i].setName(phoneNumberName);
					System.out.println("수정하고 싶은 전화번호를 입력 하세요");
					String phoneNumberNumber = sc.nextLine();
					phoneBooks[i].setPhoneNumber(phoneNumberNumber);
					System.out.println("전화번호가 수정 되었습니다.");
					isChange = true;
				}
			}
		}
		if (isChange == false) {
			System.out.println("해당 이름의 전화번호는 존재하지 않습니다.");
		}
	
	}
	
	// 5.전체삭제
	public static void deleteAll(PhoneBook[] phoneBooks) {
		System.out.println("----전체 삭제하기----");
		for (int i = 0; i < phoneBooks.length; i++) {
			phoneBooks[i] = null;
		}
	}
	
	// 6.선택삭제
	public static void deleteByName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("----선택 삭제 하기----");
		System.out.println("삭제할 전화번호의 이름을 입력하세요");
		String phoneBookName = sc.nextLine();
		boolean isChange = false;
		
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] !=null) {
				if (phoneBooks[i].getName().equals(phoneBookName)) {
					System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getPhoneNumber() + " 해당 전화번호를 삭제합니다.");
					phoneBooks[i] =null;
					System.out.println("전화번호가 삭제 되었습니다.");
					isChange = true;
				}
			}
		}
		if (isChange == false) {
			System.out.println("해당 이름의 전화번호는 존재하지 않습니다.");
		}
	
	}
	
	
	

} // end of class
