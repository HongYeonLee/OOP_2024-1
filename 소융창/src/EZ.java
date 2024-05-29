import java.util.Scanner;

public abstract class EZ {
    private String userName;
    private String userID;
    private String userPassWord;
    public Scanner scanner = new Scanner(System.in);
    
    public EZ() { //기본생성자, 컴파일에러 방지
    	
    }
    
    public void setUserName(String userName){
    	this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserID(String userID){
    	this.userID = userID;
    }

    public String getUserID(){
        return userID;
    }

    public void setUserPassWord(String userPassWord){
    	this.userPassWord = userPassWord;
    }
    
    public String getUserPassWord() {
    	return userPassWord;
    }

    public void showUserLocation(){
    	
    }

    public void showSlope(){
    	
    }

}
