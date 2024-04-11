package Week6;

public class Main {
	public static void main(String[] args)
	{
		Circle a = new Circle();
		Circle b = new Circle(10);
		Circle c = new Circle("동그라미");
		Circle d = new Circle(5, "냐옹이");
		
		Circle e = new Circle();
		e.setRadius(7);
	}
}