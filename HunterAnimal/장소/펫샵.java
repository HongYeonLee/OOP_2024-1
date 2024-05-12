package 장소;


import Main.*;
import Animal.*;


public class 펫샵 extends Place implements  Workable, Escapeable{
	private static 펫샵 instance = null;	
	
	private 펫샵() { 	//기본 10마리
//		this.where = "펫샵"; //place의 where
		animals = new 동물[size];
		this.setAnimals("펫샵");
	}
	public static 펫샵 getInstance() {
		
		if(instance == null) instance = new 펫샵();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("# 펫샵에 있는 동물들 :");
		
		showAnimals(animals , numOfAnimals);
		//static 메소드로 객체를 생성하지 않아도 바로 사용할 수 있음
	}
	
	//동물원 동물들의 재주부리기는 각 동물클래스에서 적절히 구현하세요
	public void work() {
		System.out.println("동물들이 펫샵에서 일을 합니다.");
		System.out.println("재주를 부려서 근력을 키우면 탈출할 수 있어요.");		
		Workable [] w = getAnimals();  // Workable 한 기능으로 접근하도록 설정
	
		for(int i = 0; i < numOfAnimals; i++) {			
			w[i].재주부리기();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	//펫샵에서 사건발생!
	public void escape() {			
		
		숲속 forest = 숲속.getInstance();
		System.out.println("펫샵에서 동물들의 근력이 3이상이 되면 30%의 확률로 탈출합니다!");    	
		
		if (this.numOfAnimals == 0)
			System.out.println("펫샵에 동물이 없습니다");			
		
		for(int i = 0; i < numOfAnimals; i++) {
			if (this.animals[i].power >= 3)
			{
		    	int r = (int)(Math.random()*1000)%3;
		    	if(r == 1) {
		    		System.out.println(this.animals[i].이름 + "이 펫샵에서 탈출했습니다!!");
		    		forest.addAnimal(this.animals[i]);
		    		
		    		//removeAnimal
		    		this.animals[i] = this.animals[numOfAnimals-1];
		    		this.animals[numOfAnimals-1] = null;
		    		numOfAnimals--;
		    	} 
		    	else System.out.println(this.animals[i].이름 +"이 탈출에 실패했습니다ㅜㅜ");
			}
			else
				System.out.println("근력이 약해 탈출하지 못합니다...");
				

		}
	}
	
}








