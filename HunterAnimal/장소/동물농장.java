package 장소;


import Main.*;
import Animal.*;


public class 동물농장 extends Place implements Escapeable{
	private static 동물농장 instance = null;	
	
	private 동물농장() { 	//기본 10마리

//		this.where = "동물농장"; //place의 where
//		animals = new 동물[this.size]; //10 -> this.size
		this.setAnimals("동물농장");
	}
	
	private 동물농장(int size) { 	//기본 10마리

		this.where = "동물농장";
		animals = new 동물[size];
	}
	
	public static 동물농장 getInstance() {
		
		if(instance == null) instance = new 동물농장();
		return instance;
	}
	
	public static 동물농장 getInstance(int size) {
		
		if(instance==null) instance = new 동물농장(size);	
		return instance;
	}
	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# 동물농장에 있는 동물들 :");
		
		showAnimals(animals, numOfAnimals); //public static void showAnimals(동물[] animals, int count)
		//static 메소드라서 객체 생성하지않고 바로 사용
	}

	//동물농장에서 사건발생!
	public void escape() {			    
		//Escapeable [] e = getAnimals();   //동물 [] 을 리턴					
		//탈출할 동물 고르기
		//int rand=(int)(Math.random()*100) % this.numOfAnimals;	
		//각 동물의 확률에 따라 탈출을 시도한다.
		//e[i]. 으로 접근하면 escape() 만 보인다!//e[rand].escape();		
		
		숲속 forest = 숲속.getInstance();
	    //랜덤하게 30% 확률로 탈출. 
		System.out.println("동물들은 기회만 있으면 탈출을 시도합니다!. 탈출확률은 30% 입니다.");    	
		
		if (this.numOfAnimals == 0)
			System.out.println("동물농장에 동물이 없습니다");
		//랜덤하게 처리하거나, 마리수를 정해놓거나~
		for(int i = 0; i < numOfAnimals; i++) {
	    	int r = (int)(Math.random()*1000)%3;
	    	if(r == 1) {
	    		System.out.println(this.animals[i].이름 + "이 브로커의 동물농장에서 탈출했습니다!!");
	    		forest.addAnimal(this.animals[i]);
	    		
	    		//removeAnimal
	    		this.animals[i] = this.animals[numOfAnimals-1];
	    		this.animals[numOfAnimals-1] = null;
	    		numOfAnimals--;
	    	} 
	    	else System.out.println(this.animals[i].이름 +"이 탈출에 실패했습니다ㅜㅜ");
		}
	}
}








