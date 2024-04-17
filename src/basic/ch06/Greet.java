package basic.ch06;

public class Greet {

	public static void main(String[] args) {
		greet("김");

	}

	static void greet(String name) {
		System.out.println("안녕하세요," + name + "님!");
	}

}
