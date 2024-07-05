

public abstract class User extends EZ {
	
	public User() { //기본생성자, 컴파일에러 방지
	}
	
    public void login(String userID, String userPassWord) {
    	if (this.getUserID().equals(userID) && this.getUserPassWord().equals(userPassWord))
    		System.out.println("로그인 되었습니다.");
	}    
    
    public void showUserInfo(){
    	System.out.println("유저의 이름은 " + getUserName());
    	System.out.println("유저의 아이디는 " + getUserID());
    	System.out.println("유저의 비밀번호는 " + getUserPassWord());
    }

}


