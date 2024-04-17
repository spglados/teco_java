package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		order1.orderNumber = 141414;
		order1.orderList = "책";
		order1.orderPrice = 15000;
		
		System.out.println(order1.orderNumber);
		System.out.println(order1.orderList);
		System.out.println(order1.orderPrice);

	} // end of main;
	
}// end of class
