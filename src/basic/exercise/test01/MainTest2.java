package basic.exercise.test01;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		// 문제 2
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		// 메서드 의존 주입
		a.setB(b);
		b.setC(c);
		c.setD(d);
		
		
		
		
	}
}
