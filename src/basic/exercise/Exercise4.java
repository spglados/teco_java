package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	// 코드의 시작
	public static void main(String[] args) {

		// 사용자 한테 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean flag = true;

		// \n --> 무조건 한줄 내림
		// 특정 조건을 만날때 반복문을 종료 해야 된다면
		//깃발
		
		while (flag) {
			System.out.println("\n메뉴 선택");
			System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			} else if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제을 선택했습니다.");
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요");
				System.out.println("----------------------------------------");
				System.out.println("\n메뉴 선택");
				System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
				System.out.print("선택 : ");
				choice = sc.nextInt();
			}
			System.out.println("----------------------------------------");

		}

	} // end of main

} // end of class
