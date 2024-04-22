package basic.ch06;

public class CheckAdult {
	public static void main(String[] args) {
		System.out.println(check(20));

	}

	static boolean check(int age) {
		boolean a;
		if (age >= 18) {
			a = true;
		} else {
			a = false;
		}
		return a;

	}

}
