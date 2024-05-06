package Week9;
public class MyRemoteControl implements RemoteRole{
    private RemoteRole rc = null;

    //기본생성자
    public MyRemoteControl() {}
    
    //생성자로 객체를 만들 때 각각의 클래스에 참초
    public MyRemoteControl(TV tv){
    	this.rc = tv;
    }
    
    public MyRemoteControl(Audio au) {
    	this.rc = au;
    }
    
    public MyRemoteControl(Car car)
    {
    	this.rc = car;
    }
    
    //인자가 RemoteRole 한 모든 기기라면 여기서 연결
    //기타 위에서 없는 기기는 이 생성자가 실행
    public MyRemoteControl(RemoteRole rc)
    {
    	this.rc = rc;
    }

    //리모컨 하나로 여러개의 객체를 연결하기
    //인자를 object로 받는 경우
    public void changeMode(Object o){
    	System.out.println("인자를 object로 받아 모드를 변경합니다");
    	if (o instanceof Audio)
    	{
    		System.out.println("오디오 모드로 변경합니다");
    		this.rc  = (Audio) o; //다운캐스팅
    	}
    	
    	else if (o instanceof TV)
    	{
    		System.out.println("티비 모드로 변경합니다");
    		this.rc = (TV) o; //다운캐스팅
    	}
    	
    	else
    	{
    		System.out.println("자동차 모드로 변경합니다");
    		this.rc = (Car) o; //다운캐스팅
    	}
    }
    
    //인자를 각각의 객체에 따라 다르게 받을 경우
    //객체를 인자로 받아 rc 세팅
    public void changeMod(Audio au){
    	System.out.println("오디오 모드로 변경합니다");
    	this.rc = au;
    }

    public void changeMode(TV tv){
    	System.out.println("티비 모드로 변경합니다");
    	this.rc = tv;
    }

    public void changeMode(Car car){
    	System.out.println("자동차 모드로 변경합니다");
    	this.rc = car;
    }

    public void turnOn(){
    	this.rc.turnOn();
    }

    public void turnOff(){
    	this.rc.turnOff();
    }

    public void set_vol(int vol){
    	this.rc.set_vol(vol);
    }

    public int get_vol(){
        return this.rc.get_vol();
    }

}
