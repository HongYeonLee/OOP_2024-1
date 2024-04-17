package Week7;

public interface Ia {
//	int a; 인터페이스는 메소드만 허용하므로 변수 선언시 오류 발생
	
//	public void b(); //인터페이스에서는 함수의 프로토타입만 적어도 가능
	
	public default void c() { //default 붙여야 에러 사라짐, default를 붙이지 않으면 A에서 c를 구현해줘야 함 
		
	}
}
