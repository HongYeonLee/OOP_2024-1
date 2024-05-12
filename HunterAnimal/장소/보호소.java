package 장소;

import Animal.동물;
import Animal.강아지;
import Animal.고양이;
import Animal.토끼;
import Animal.햄스터;
import Main.Playable;

public class 보호소 extends Place implements Playable{
	private static 보호소 instance = null;
	
	private 보호소()
	{
		this.setAnimals("보호소");
	}
	
	private 보호소(int size) { 	//기본 10마리

		this.where = "보호소";
		animals = new 동물[size];
	}
	
	public static 보호소 getInstance() {
		
		if(instance == null) instance = new 보호소();
		return instance;
	}
	
	public static 보호소 getInstance(int size) {
		
		if(instance==null) instance = new 보호소(size);	
		return instance;
	}
	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# 보호소에 있는 동물들 :");
		
		showAnimals(animals, numOfAnimals); //public static void showAnimals(동물[] animals, int count)
		//static 메소드라서 객체 생성하지않고 바로 사용
	}

	@Override
	public void 놀기() {
		// TODO Auto-generated method stub
		System.out.println("동물들이 보호소에서 자유롭게 뛰어놉니다.");
		Playable[] p = getAnimals();
		
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
}
