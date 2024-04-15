package Week6_Lab;

public class CarTest {
	public static void main(String[] args)
	{
		Car myCar = new Car(); //첫번째 객체 생성
		Car yourCar = new Car();
		
		//객체의 필드 변경
		myCar.speed = 60; 
		myCar.mileAge = 0;
		myCar.color = "blue";
		
		//객체의 메소드 호출
		myCar.speedUp();
		System.out.println(myCar); //toString 메소드 호출
		
		//객체의 필드 변경
		yourCar.mileAge =10;
		yourCar.speed = 120;
		yourCar.color = "white";
		
		//객체의 메소드 호출
		yourCar.speedDown();
		System.out.println(yourCar);//toString 메소드 호출
	}
}
