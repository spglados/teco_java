package basic.ch01;

public class DataType3 {

	public static void main(String[] args) {
		
		// 기본 데이터 타입
		// 참조 타입
		
		// 기본 데이터 타입 - 실수형
		// float, double
		
		// 컨트롤 + 알트 + 방향키 위아래 = 줄 복사
		float floatBox1 = 0.5F; // 4바이트 , F는 접미사
		float floatBox2 = 0.5f; // 접미사 대소문자 둘다 사용 가능
		
		double doubleBox1 = 0.123;
		double doubleBox2 = 1.12345678;
		// double 8byte 크기이다, 실수에 기본 연산 단위 이고 그 이유는
		// 소수점을 더 많이 표현할 수 있기 때문에 값에 정확도를 높일 수 있다.
		
		// 콘솔창 결과 출력 - 콘솔창에서는 시본적으로 정확한 데이터 타입을 확인할 수 없다.
		System.out.println(floatBox1);
		System.out.println(doubleBox1);
		
		System.out.println(0.5f);
		System.out.println(0.10d);
		

	} // end of main

} // end of class
