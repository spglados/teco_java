package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요
		// 1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// 반복문은 while 을 사용
		int i = 1;

		while (true) {
			if (i >= 100) {
				break;
			} else if ((i % 3) == 0) {
				System.out.println("3의 배수 : " + i);
			} else {
			}
			i++; // 식 사용하기 (무한 반복 예방)
		}
	} // end of main

} // end of class
