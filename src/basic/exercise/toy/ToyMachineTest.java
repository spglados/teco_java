package basic.exercise.toy;

public class ToyMachineTest {

	// 코드 테스트
	public static void main(String[] args) {

		int tryNumber1 = ToyMachine.takeToy();
		int tryNumber2 = ToyMachine.takeToy();
		int tryNumber3 = ToyMachine.takeToy();
		int tryNumber4 = ToyMachine.takeToy();
		int tryNumber5 = ToyMachine.takeToy();

		// 1~10사이 숫자 랜덤 생성
		
		// 문제점 
		// 1 숫자 대신 상품이름 및 문구로 출력
		// 2 중복숫자 발생시 2번째 부터는 상품없음으로 가야함 -- (반복문, 조건문) 사용 예상 
		// 3 상품을 추가 할수있는 기능 부재 < -- 토이머신에 기능 추가
		
		System.out.print(tryNumber1 + "\t");
		System.out.print(tryNumber2 + "\t");
		System.out.print(tryNumber3 + "\t");
		System.out.print(tryNumber4 + "\t");
		System.out.print(tryNumber5 + "\t");

	} // end of main

} // end of class
