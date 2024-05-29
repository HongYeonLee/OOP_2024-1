

public class Outsider extends User {
    private String phoneNum;
    
    public Outsider() { //기본생성자, 컴파일에러 방지
    	
    }
    
    public void setPhoneNum(String phoneNum){
    	this.phoneNum = phoneNum;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    @Override
    public void login(String userID, String UserPassWord) {
    	System.out.println("EZ에 로그인되었습니다");
    }
    
    @Override
    public void showUserInfo() {
        System.out.println("사용자 이름 : " + getUserName());
        System.out.println("아이디 : " + getUserID());
        System.out.println("비밀번호 : " + getUserPassWord());
        System.out.println("전화번호 : " + phoneNum);
    }
}
