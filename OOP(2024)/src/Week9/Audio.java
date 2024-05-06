package Week9;
public class Audio implements RemoteRole {
    private int volume;

    //기본생성자
    public Audio() {}
    
    public void turnOn(){
    	System.out.println("오디오를 켭니다");
    }

    public void turnOff(){
    	System.out.println("오디오를 끕니다");
    }

    public void set_vol(int vol){
    	this.volume = vol;
    	System.out.println("오디오의 볼륨을 " + vol + "로 설정합니다");
    }

    public int get_vol(){
        return this.volume;
    }

}
