package basic.ch06;

public class SignOfNumber {

	public static void main(String[] args) {
		System.out.println(signOfNumber(3));

	}
	
	static String signOfNumber(int number) {
		String result;
		if(number > 0) {
			result = "positive";
		} else if(number == 0) {
			result = "zero";
		} else {
			result = "negative";
		}
		return result;
	}
	

}
