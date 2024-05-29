

public class ElevatorStatus extends EZ {
    private String elevID;
    public String status;
    
    public ElevatorStatus() { //기본생성자, 컴파일에러 방지
    	
    }
    
    public void setElevID(String elevID){
    	this.elevID = elevID;
    }

    public String getElevID(){
        return elevID;
    }

    public String getStatus(String elevID){
    	if (elevID.equals("포스코관"))
    		status = "혼잡";
    	else if (elevID.equals("종합과학관"))
    		status = "보통";
    	else if (elevID.equals("학생문화관"))
    		status = "쾌적";
    	
    	return status;
    }

    public void showStatus(){ //매개변수 제거
    	System.out.println("현재 " + getElevID() + " 엘리베이터는 " + getStatus(getElevID()) + " 상태입니다");
    }

}
