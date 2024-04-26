package basic.ch22;

public interface Calc {
	
	public abstract int add(int n1, int n2);
	public abstract int substract(int n1, int n2);
	public abstract int times(int n1, int n2);
	public abstract double divide(int n1, int n2);

	
}

// 0을 넣으면 사용자에게 알려주는 기능 추가
// 0으로 나눌 수 없습니다
// 만약 ---가 --라면 0으로 나눌 수 없습니다 sysout