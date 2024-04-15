package Week6_Lab;

public class DeskLampTest {
	public static void main(String[] args) {
		//new 예약어를 이용해 객체 생성
		DeskLamp myLamp = new DeskLamp();
		
		//객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다
		myLamp.turnOff();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}

}
