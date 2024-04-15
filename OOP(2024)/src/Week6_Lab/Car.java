package Week6_Lab;

public class Car {
	//필드 정의
	public int speed; //속도
	public int mileAge; //주행거리
	public String color; //색상
	
	//메소드 정의
	public void speedUp() //속도 증가 메소드
	{
		speed += 10;
	}
	
	public void speedDown() //속도 감소 메소드
	{
		speed -= 10;
	}
	
	public String toString()
	{//객체의 상태를 문자열로 반환하는 일반메소드 toString을 오버라이딩한다
		return "속도: " + speed + " 주행거리: " + mileAge + " 색상: " + color;
	}
	
	//lab 8 부분
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("정수 버전 호출");
		System.out.println("속도는 " + this.speed + " 입니다");
	}
	
	public void setSpeed(double speed)
	{
		this.speed = (int)speed;
		System.out.println("실수 버전 호출");
		System.out.println("속도는 " + this.speed + " 입니다");
	}
	
	
}
