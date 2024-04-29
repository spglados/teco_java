package useful.ch03;

public class NickNameMainTest {
	
	public static void main(String[] args) {
		
		NickName nickName = new NickName();
		
		String inputNickName = null;
		inputNickName = "aaaa";
		
		try {
			nickName.setNick(inputNickName);
		} catch (NickNameException e) {
			System.out.println("우리가 정의한 Nickname 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
	} // end of main

} // end of class
