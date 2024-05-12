package ���;
import Animal.������;
import Animal.�����;
import Animal.����;
import Animal.�䳢;
import Animal.�ܽ���;
import Main.Huntable;
import Main.Playable;

public class ���� extends Place implements Huntable, Playable  {
	private  static ���� instance = null;	
	
	private ����() { 	//�⺻ 10����		
		//this.where = "����"; //place�� where
		//animals = new ����[size]; // 10 -> size
		this.setAnimals("����");
	}	
	
	public static ���� getInstance() {
		
		if(instance == null) instance = new ����();
		return instance;
	}	

	
	public void show() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.print("# �� �ӿ� �ִ� ������ :");
		
		showAnimals(animals, numOfAnimals);
		//static �޼ҵ�� ��ü�� �������� �ʾƵ� �ٷ� ����� �� ����
	}	
	
	public void ���() {
		System.out.println("�������� �� �ӿ��� �����Ӱ� �پ��ϴ�.");		
//		System.out.println("��ɵ� �մϴ�.");		
		Playable[] p = getAnimals();  //Playable�� �����ϵ��� ���� Place Ŭ������ getAnimal()ȣ��
		
		for(int i=0; i< numOfAnimals; i++) {
			System.out.printf("[%2d] :",i);
			p[i].���();	   //p[i].�� �����ϸ� ���() �� ���δ�.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

	public void ����ϱ�() {
		System.out.println("�������� �� �ӿ��� �����Ӱ� �پ��ϴ�.");		
		System.out.println("��ɵ� �մϴ�.");		
		Huntable [] h = getAnimals();  //���ӱ������ �����ϵ��� ���� //place Ŭ������ getAnimal() �޼ҵ� ȣ��
		
		for(int i=0; i< numOfAnimals; i++) {
			int rand = (int)(Math.random()*10) % numOfAnimals;
			if (i == rand) {
				System.out.println("�ڽ��� ����� �� ���ٱ�! ��������! ����!");
				continue;
			}		
			
			h[i].����ϱ�(animals[rand]);
			
			//input.nextLine();	
		}		
	}

	
}
