package Week9;
public class TV implements RemoteRole {
    private int volume;
    
    //기본생성자
    public TV() {}
    
    public void turnOn(){
    	System.out.println("티비를 켭니다");
    }

    public void turnOff(){
    	System.out.println("티비를 끕니다");
    }

    public void set_vol(int vol){
    	this.volume = vol;
    	System.out.println("티비의 볼륨을 " + vol + "로 설정합니다");
    }
    
    public int get_vol(){
        return this.volume;
    }
    
    public void set_MUTE(){
    	System.out.println("티비를 무음 처리 합니다");
    	set_vol(0);
    }

}
