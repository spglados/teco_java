package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	// 코드의 시작점
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요 (0-100): ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = "";
		// message = "문자열을 담을 수 있다.";
		// 90점 이상 100점 이하 : 'A'학점
		if (score <= 100 && score >= 90) {
			// ---> 100 ~ 90 사이를 조건식으로 작성하라
			grade = 'A';
			message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			System.out.println(grade);
			System.out.println(message);

		} else if (score < 90 && score >= 80) {
			grade = 'B';
			message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
			System.out.println(grade);
			System.out.println(message);
		} else if (score < 80 && score >= 70) {
			grade = 'C';
			message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
			System.out.println(grade);
			System.out.println(message);
		} else if (score < 70 && score >= 60) {
			grade = 'D';
			message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			System.out.println(grade);
			System.out.println(message);
		} else if (score < 60 && score >= 0) {
			grade = 'F';
			message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
			System.out.println(grade);
			System.out.println(message);
		} else {
			System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.");
		}

		// .. 코드를 작성해주세요
		// 힌트 - 비교 연산자와 논리연사자를 활용
		// ...

		scanner.close(); // 자원 닫기

	} // end of main

} // end of class
