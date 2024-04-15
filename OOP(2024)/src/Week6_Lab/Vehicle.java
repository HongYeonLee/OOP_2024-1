package Week6_Lab;

public class Vehicle {
	public int passengers; //탑승객 수
	public int fuelcap; //연료통 용량
	public int mpg; //연료 1갤런 당 몇 마일 갈 수있는지, 연비
	
	//기본생성자
	public Vehicle() {
	}
	
	//인원, 연료량, 연비를 인자로 받아 초기화 하는 생성자
	//생성자는 .을 이용해 메소드처럼 불러서 쓰는게 아니다
	//우클릭 -> source -> Generate Constructor using field -> 모든 필드 체크 -> 생성
	public Vehicle(int passengers, int fuelcap, int mpg) {
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
		System.out.printf("이 자동차의 승객은 %d명 탑승 가능, 연료량 %d갤런, mpg는 %d이다", this.passengers, this.fuelcap, this.mpg);
	}

	public int range()
	{
		int range = this.fuelcap*this.mpg;
		System.out.println("갈 수 있는 거리는 " + range + "마일입니다");
		return range;
	}
	
	public double fuelNeeded(int range)
	{
		double fuelNeeded = (double)range/this.mpg;
		System.out.printf("필요한 연료 %.1f 갤런 입니다\n", fuelNeeded);
		return fuelNeeded;
	}
}
