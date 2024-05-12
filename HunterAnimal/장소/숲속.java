package 장소;
import Animal.강아지;
import Animal.고양이;
import Animal.동물;
import Animal.토끼;
import Animal.햄스터;
import Main.Huntable;
import Main.Playable;

public class 숲속 extends Place implements Huntable, Playable  {
	private  static 숲속 instance = null;	
	
	private 숲속() { 	//기본 10마리		
		//this.where = "숲속"; //place의 where
		//animals = new 동물[size]; // 10 -> size
		this.setAnimals("숲속");
	}	
	
	public static 숲속 getInstance() {
		
		if(instance == null) instance = new 숲속();
		return instance;
	}	

	
	public void show() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.print("# 숲 속에 있는 동물들 :");
		
		showAnimals(animals, numOfAnimals);
		//static 메소드로 객체를 생성하지 않아도 바로 사용할 수 있음
	}	
	
	public void 놀기() {
		System.out.println("동물들이 숲 속에서 자유롭게 뛰어놉니다.");		
//		System.out.println("사냥도 합니다.");		
		Playable[] p = getAnimals();  //Playable로 접근하도록 설정 Place 클래스의 getAnimal()호출
		
		for(int i=0; i< numOfAnimals; i++) {
			System.out.printf("[%2d] :",i);
			p[i].놀기();	   //p[i].로 접근하면 놀기() 만 보인다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

	public void 사냥하기() {
		System.out.println("동물들이 숲 속에서 자유롭게 뛰어놉니다.");		
		System.out.println("사냥도 합니다.");		
		Huntable [] h = getAnimals();  //숲속기능으로 접근하도록 설정 //place 클래스의 getAnimal() 메소드 호출
		
		for(int i=0; i< numOfAnimals; i++) {
			int rand = (int)(Math.random()*10) % numOfAnimals;
			if (i == rand) {
				System.out.println("자신을 사냥할 순 없다구! 정신차려! 나라구!");
				continue;
			}		
			
			h[i].사냥하기(animals[rand]);
			
			//input.nextLine();	
		}		
	}

	
}
