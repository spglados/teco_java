package basic.ch05;

public class UserMainTest {
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.adress = "부산광역시";
		user1.name = "김ㅇㅇ";
		user1.id = "person123";
		
		System.out.println(user1.adress);
		System.out.println(user1.name);
		System.out.println(user1.id);
		

	} // end of main

} // end of class
