package Week7;

public class Main {
	public static void main(String[] args)
	{
		A a = new A();
		B b = new A();
		Ia c = new A();
		
		b.m();
		
		//b 객체는 A클래스로 만들어졌으며 B클래스의 시점으로 바라본다
		//그러면 b 객체는 A 클래스의 필드와 메소드만 쓸 수 있다
		//b.data
		//b.m
		//전부 A 객체를 만들더라도 어떤 클래스로 참조 하느냐에 따라
		//접근할 수 있는 변수와 메소드가 달라진다
	}
}
