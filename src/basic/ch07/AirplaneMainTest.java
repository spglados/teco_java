package basic.ch07;

public class AirplaneMainTest {

	public static void main(String[] args) {
		
		Airplane airplane1 = new Airplane();
		airplane1.name = "abc123";
		airplane1.purpose = "여객";
		airplane1.price = 20000000000l;
		
		airplane1.airplaneName();
		airplane1.airplanePurpose();
		airplane1.airplanePrice();
		

	} // end of main

} // end of class
