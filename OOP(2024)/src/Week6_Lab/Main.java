package Week6_Lab;

public class Main {
	public static void main(String[] args)
	{
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		//minivan 객체의 필드 지정
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//sportcar 객체의 필드 지정
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		//minivan과 sportcar 객체에서
		//연료탱크 하나에 얼마나 갈 수 있는지 계산
		int range1 = minivan.fuelcap * minivan.mpg;
		int range2 = sportcar.fuelcap * sportcar.mpg;
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = car1;
		
		car1.mpg = 26;
		
		System.out.println(car1.mpg);
		System.out.println(car2.mpg);
		
		//연비 출력
		minivan.range();
		sportcar.range();
		
		//100마일 가는데 필요한 연료 출력
		minivan.fuelNeeded(100);
		sportcar.fuelNeeded(100);
		
		//생성자는 . 으로 접근하는게 아니라 new로 접근해서 인자를 줘야 한다
		//하나만 주면 승객, 두개주면 승객, 연료량
		Vehicle car3 = new Vehicle(5, 10, 34);
		
	}
}
