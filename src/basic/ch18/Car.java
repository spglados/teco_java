package basic.ch18;

public class Car  {

	String name;
	int price; 
	Engine engine; // 포함관계
	
	public Car() {
		engine = new Engine();
		// Car라는 객체가 생성이 될 때 
		// Engine 객체도 함께 생성이 된다.
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발 합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
	
}
