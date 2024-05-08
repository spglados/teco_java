package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachine {

// 클래스 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟 --> product
// 사장이 인형 넣기

	// 상품들을 보관할 수 있는 공간 선언 - 다형성
	int productCount = 1;
	final int MAX_PRODUCT = 100; // 최대 상품수(상수)
	Scanner sc = new Scanner(System.in);
	Product[] products = new Product[MAX_PRODUCT]; // 최대 상품수 만큼 생성

	Product product = new Product();

	public void addProduct(Product product) {
		// 공간[0] = 상품
		products[0] = product;

		if (productCount < MAX_PRODUCT) {
			for (int i = 1; i < products.length; i++) {
			}
		}
	}

	// 요구 조건 - 배열을 활용해서 객체들을 담아 주세요
	int tryNumber = ToyMachine.takeToy();

	public static int takeToy() {
		Random random = new Random();
		int resultNumber = random.nextInt(10) + 1;
		return resultNumber;
	}
}
