package Week9;
public class RemoteTest {
    public static void main(String[] args){
    	RemoteRole mr; //끄기, 켜기, 볼륨 조정, 무음처리 기능만 있는 기본 리모컨
    	TV tv = new TV();
    	Audio au = new Audio();
    	Car car = new Car();
    	
    	//인터페이스 mr을 이용해 각 객체들을 업캐스팅하기
    	//tv 기능 동작하기
    	mr = tv; // 업캐스팅
    	mr.turnOn(); //티비 켜기
    	mr.set_vol(3); // 티비 소리 3으로 하기
    	mr.set_MUTE(); //티비 무음처리 -> set_vol(0) 호출
    	mr.turnOff(); // 티비 끄기
    	System.out.println();
    	
    	//mr에 오디오 연결
    	mr = au; //업캐스팅
    	mr.turnOn(); //오디오 켜기
    	mr.set_vol(5); //오디오 무음처리
    	mr.set_MUTE(); //오디오 소리 0
    	mr.turnOff(); //오디오 끄기
    	System.out.println();
    	
    	//mr에 자동차에 연결
    	mr = car; //업캐스팅
    	mr.turnOn(); //자동차 시동켜기
    	mr.set_vol(5); //자동차 경적소리 5
    	mr.set_MUTE(); //자동차 무음처리
    	mr.turnOff(); //자동차 시동끄기
    	System.out.println();
    	
    	///////////////////////////////////////////
    	//MyRemoteControl 클래스를 이용해 리모컨 기능이 참조변수로 들어가 있고 각각의 객체를 인자로 받아서 세팅하기
    	
    	//TV 클래스로 만든 tv 객체를 MyRemoteControl클래스의 생성자에 인자로 전달하기
    	MyRemoteControl my_rc = new MyRemoteControl(tv); 
    	
    	//만약 RemoteRole이 RemoteControl을 implements 하지 않았다면
    	//System.out.println("tv sound : " + my_rc.rc.get_vol());
    	System.out.println("티비 소리: " + my_rc.get_vol());
    	
    	
    	//MyRemoteControl의 changeMode메소드의 인자로 객체를 전달하기
    	my_rc.changeMode(tv); 
    	my_rc.set_vol(9); //TV 클래스의 set_vol 메소드 호출
    	System.out.println("티비 소리: " + my_rc.get_vol()); //TV 클래스이 get_vol 메소드 호출
    	System.out.println();
    	
    	//MyRemoteControl의 changeMode메소드의 인자로 객체를 전달하기
    	my_rc.changeMod(au);
    	System.out.println("오디오 소리: " + my_rc.get_vol());
    	System.out.println();
    	
    	//MyRemoteControl의 changeMode메소드의 인자로 객체를 전달하기
    	my_rc.changeMode((Object) tv);
    	System.out.println();
    	
    	//MyRemoteControl의 changeMode메소드의 인자로 객체를 전달하기
    	my_rc.changeMode(car);
    	my_rc.turnOn();

    }

}
