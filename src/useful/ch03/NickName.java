package useful.ch03;

public class NickName {

	private String nick;
	
	// getter
	public String getNick() {
		return nick;
	}
	
	// setter
	public void setNick(String nick) throws NickNameException{
		
		// null 값 x
		if (nick == null) {
			throw new NickNameException("비밀번호는 null값일 수 없습니다");
		}
		
		// 비밀번호 자릿수 설정
		if(nick.length() < 8) {
			throw new NickNameException("비밀번호는 8자 이상이어야 합니다");
		}
		
		// 비밀번호의 조건 설정
		if (nick.matches("[a-zA-Z]+")) {
			throw new NickNameException("비밀번호는 숫자나 특수문자를 포함해야 합니다");
		}
		
		this.nick = nick;
		
	}
	
}
