package Week6_Lab;

public class DeskLamp extends 전자기기 {
    private boolean isOn;

    public void turnOn(){
    	isOn = true;
    }

    public void turnOff(){
    	isOn = false;
    }
    
    //객체의 상태를 문자열로 반환하는 일반메소드 toString을 오버라이딩한다
    public String toString()
    {
    	//조건식 ? true일때 실행 : false일때 실행
    	return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }

}
