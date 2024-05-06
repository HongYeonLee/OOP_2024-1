package Week9;
public class Car implements RemoteRole {
	
	private int volume; //자동차의 경적소리
	
	//기본생성자
	public Car() {}
	
    public void turnOn(){
    	this.시동걸기();
    }

    public void turnOff(){
    	this.시동끄기();
    }

    //사실 자동차는 set_vol 메소드가 필요없으나 인터페이스에서 메소드를 구현해놨으므로
    //하위 클래스에서는 반드시 이를 구현해놔야한다
    //하지만 자동차는 set_vol 메소드를 쓸 필요가 없으므로 인터페이스에 set_vol 메소드에 default를 붙여 자동차에서
    //굳이 구현하지 않거나(다른 클래스에서는 어차피 오버라이딩할 것이므로)
    //하위 클래스에서 구현한 뒤 바디를 그냥 비워둬도 된다
    public void set_vol(int vol){
    	this.volume = vol;
    	System.out.println("자동차의 경적 소리를 " + vol + "로 설정합니다");
    }

    public void 시동걸기(){
    	System.out.println("자동차의 시동을 켭니다");
    }

    public void 시동끄기(){
    	System.out.println("자동차의 시동을 끕니다");
    }

    public void move(){
    	System.out.println("부릉부릉 차가 움직입니다");
    }

}
