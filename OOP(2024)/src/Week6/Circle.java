package Week6;

public class Circle {
	private int radius;
	public String name;
	
	//////////////////////////////////
	
	public Circle() {
		System.out.println("기본 생성자를 호출합니다");
	}

	public Circle(int radius) {
		this.radius = radius;
		System.out.println("반지름을 " + radius + "으로 세팅합니다");
	}
	
	public Circle(String name) {
		this.name = name;
		System.out.println("원의 이름을 " + name + "으로 세팅합니다");
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
		System.out.println("원이 이름을 " + name + "으로 세팅합니다");
		System.out.println("반지름을 " + radius + "으로 세팅합니다");
	}

	//////////////////////////////////
	
	//우클릭 -> source -> generate setter and getter ->
	//자동으로 private한 변수를 채우고 가져오는데 필요한 메소드를 만들어준다
	
	public void setRadius(int radius)
	{
		//set은 변수를 지정할 때 쓰는 이름
		//this를 이용해 클래스내의 private 변수를 자유롭게 접근할 수 있고
		//변수명이 똑같은 경우에도 헷갈리지 않게 할 수 있다
		this.radius = radius;
		System.out.println("반지름을 " + this.radius + "으로 세팅합니다");
	}
	
	public int getRadius()
	{	//get은 변수를 가져올 때 쓰는 이름
		return this.radius;
	}
	
	////////////////////////////////
	
	public double getArea()
	{
		return this.radius*this.radius*3.14;
	}





}
