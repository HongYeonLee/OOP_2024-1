package Week9;
public interface RemoteRole {
    public static int MAX_VOL = 10;
    public static int MIN_VOL = 0;

    public void turnOn();

    public void turnOff();

    public void set_vol(int vol);
    
    // get_vol()은 기기들마다 동작이 다르므로, 하위클래스에서 오버라이딩 할 것
    public default int get_vol() {
    	return 0;
    }
    
    // 모든 장치들마다 무음 처리는 동일할 것이므로 바디를 작성한다
    public default void set_MUTE() {
    	System.out.println("무음 처리 합니다");
    	this.set_vol(0);
    }

}
