

public class Student extends User {
    private String studentID;
    
    public Student() {//기본생성자, 컴파일에러 방지
    	
    }
    
    public void setStudentID(String studentID){
    	this.studentID = studentID;
    }

    public String getStudentID(){
        return studentID;
    }
    
    @Override
    public void login(String userID, String userPassWord) {
    	if(getUserID().equals(userID) && getUserPassWord().equals(userPassWord))
    		System.out.println("EZ에 로그인되었습니다");
    	else 
    		System.out.println("아이디 또는 비밀번호가 잘못되었습니다");
    }
    
    @Override
    public void showUserInfo() {
        System.out.println("사용자 이름 : " + getUserName());
        System.out.println("아이디 : " + getUserID());
        System.out.println("비밀번호 : " + getUserPassWord());
        System.out.println("학번 : " + studentID);
    }
}
