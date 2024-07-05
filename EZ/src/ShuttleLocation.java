

public class ShuttleLocation extends EZ {
    private int busID;
    public String location;
    
    public ShuttleLocation() { //기본생성자, 컴파일에러 방지
    	
    }
    
    public void setBusID(int busID){
    	this.busID = busID;
    }

    public int getBusID(){
        return busID;
    }

    public String getLocation(int busID){
    	switch(busID)
    	{
    	case 1:
    		location = "포스코관(상행)";
    		break;
    	case 2:
    		location = "연구협력관";
    		break;
    	case 3:
    		location = "한우리집";
    		break;
    	default:
    		System.out.println("잘못 입력하셨습니다.");
    		break;
    	};
		return location;
    }

    public void showLocation(){ 
    	System.out.println("현재 " + getBusID() + "번 버스가 " + getLocation(getBusID()) + " 정류장에 있어요");
    }

}
