//package Week9;
//
//
//class 동물{
//	public void 놀기() {
//		
//	}
//	
//	public void 먹기() {
//		
//	}
//}
//
//class 사람 extends 동물{
//	public void 생각하기() {
//		
//	}
//	
//	public void 일하기() {
//		
//	}
//}
//
//interface 학교기능{
//	//인터페이스는 '반드시' 해야하는 일을 들을 모아둔 것이라 보면 된다
//	//인터페이스에서 정의된 것은 '반드시' 물려받은 클래스에서 구현해야한다
//	//인터페이스 자체에서 구현하기 않고 추상적으로 얘기하므로
//	//abstract 붙여서 써도 동일함
//	//default를 붙이면 클래스에서 구현안하고 인터페이스에서 구현해도 됨
//	public abstract void 선생님말씀잘듣기();
//	
//	public default void 공부하기() {
//		System.out.println("졸지말고");
//		System.out.println("메모하고");
//		System.out.println("질문하고");
//	}
//	
//	public void 예습하기();
//	public void 복습하기();
//}
//
//public class 짱구 extends 사람 implements 학교기능{
//	public void 애교부리기() {
//	}
//	
//	public void 매시간웃기() {
//	}
//	
//	public void 개미구경하기() {
//	}
//	
//	public void 샤워하기() {}
//	public void 청소하기() {}
//	public void 화장품사달라조르기() {}
//
//	@Override
//	public void 선생님말씀잘듣기() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void 예습하기() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void 복습하기() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
