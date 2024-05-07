package Week10;

public class 강아지테스트 {
	public static void main(String[] args)
	{
		//흰둥이, 퉁퉁이, 요룽이
		
		강아지 흰둥이 = new 강아지();
		흰둥이.bark();
		흰둥이.smile();
		
		//퉁퉁이는 익명객체
		//기능이 조금만 다를 경우
		//퉁퉁이라는 클래스를 만들어서 강아지를 상속받을 필요x
		//익명객체를 구현할 때는 기존 클래스의 메소드만 오버라이딩할 수 있다
		//새로운 메소드 추가x
		강아지 퉁퉁이 = new 강아지() {
			
			int time = 10;
			//기존 강아지 클래스 bark() 메소드 오버라이딩
			public void bark() {
				for (int i = 0; i < time; i++)
					System.out.println("왈왈왈");
			}
		};
		
		퉁퉁이.bark();
		퉁퉁이.smile();
		
		//요룽이는 익명 객체
		//기능이 조금만 다를 경우
		//요룽이라는 클래스를 만들어서 강아지를 상속받을 필요x
		강아지 요룽이 = new 강아지() {
			//기존 강아지 클래스 bark() 메소드 오버라이딩
			public void bark() {
				System.out.println("나는 못짖어 흑흑흑");
			}
		};
		
		요룽이.bark();
		요룽이.smile();
	}
}
