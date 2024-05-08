package basic.ch20;

public class AnimalTest {
		// 컴파일 시점에 문법만 확인
		// 런 시점에는 객체 확인
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("--------------");
		
		Animal 주소2 = new Tiger(); // 타이거는 애니멀이라는 데이터 타입으로 볼수 있고 타이거라는 데이터 타입으로도 볼수 있다
		주소2.move();
		주소2.eating();
		System.out.println("--------------");
		
		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		
		int n1 = (int)10.5; // 강제형변환 데이터 손실발생가능
		( (Human)주소3 ).readBooks(); // 참조타입 Human으로 형변환
		System.out.println("---------");
		
		// 캐스팅 --> 형변환
		// double 안에 int 넣으면 큰상자에서 작은상자로 넣는것이기 떄문에 가능함
		
		// 업캐스팅
		// Animal animal = new Dog();  업캐스팅 , 선언됨
		
	} // end of main

} // end of class
