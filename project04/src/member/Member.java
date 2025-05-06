package member;

public class Member {
	
	private String userId;
	private int userPw;
	
	public Member() {
		super();
	}

	public Member(String userId, int userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	//userId
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	//userPw
	public int getUserPw() {
		return userPw;
	}
	public void setUserPw(int userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		if ("admin".equals(userId)) { 
	        return "관리자로 로그인되었습니다.";
	    } else {
	        return userId + "님, 안녕하세요. HJ Play입니다!";
	    }
	}
	
}
