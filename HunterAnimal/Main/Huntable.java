package Main;
import Animal.동물;

public interface Huntable {
	
	//사냥 확률에 따라 실패/성공을 return하도록 수정할 수 있음
	
	public default void 사냥하기() {
		System.out.println("동물이 사냥을 합니다.");
		
	}
	
	public default void 사냥하기(동물 animal) {
		//특정 동물 사냥하기
		System.out.println(animal.이름 +"을 사냥 합니다.");
		
	}	
	
	public default void 사냥하기(동물 [] animals) {
		System.out.println("어떤 동물이 어떤 동물을 사냥합니다.");
		// 여러 동물들중 랜덤하게 골라 사냥하기	여러분이 만들어보세요.	
		// animals[i]가 animal[j]를 사냥하도록 , i와 j는 서로 달라야 한다.
		

	}
	
}
