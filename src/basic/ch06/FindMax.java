package basic.ch06;

public class FindMax {

	public static void main(String[] args) {
		System.out.println(findMax(3,5));

	}
	
	static int findMax(int n1, int n2) {
		int result = n1 > n2? n1 : n2;
		return result;
	}

}
