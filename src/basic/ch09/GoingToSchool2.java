package basic.ch09;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {
		
		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름을 만들기
		//2번을 누르면 지하철을 태우는 실행의 흐름을 만들어 보자.
		Bus bus1 = new Bus(100); // 선언만 했음
		Bus bus2 = new Bus(200); // 선언만 했음
		Subway subway1 = new Subway(1); 
		Subway subway2 = new Subway(2); 
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);

	} // end of main

} // end of class
