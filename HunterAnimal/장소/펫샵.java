package ���;


import Main.*;
import Animal.*;


public class �꼥 extends Place implements  Workable, Escapeable{
	private static �꼥 instance = null;	
	
	private �꼥() { 	//�⺻ 10����
//		this.where = "�꼥"; //place�� where
		animals = new ����[size];
		this.setAnimals("�꼥");
	}
	public static �꼥 getInstance() {
		
		if(instance == null) instance = new �꼥();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("# �꼥�� �ִ� ������ :");
		
		showAnimals(animals , numOfAnimals);
		//static �޼ҵ�� ��ü�� �������� �ʾƵ� �ٷ� ����� �� ����
	}
	
	//������ �������� ���ֺθ���� �� ����Ŭ�������� ������ �����ϼ���
	public void work() {
		System.out.println("�������� �꼥���� ���� �մϴ�.");
		System.out.println("���ָ� �η��� �ٷ��� Ű��� Ż���� �� �־��.");		
		Workable [] w = getAnimals();  // Workable �� ������� �����ϵ��� ����
	
		for(int i = 0; i < numOfAnimals; i++) {			
			w[i].���ֺθ���();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	//�꼥���� ��ǹ߻�!
	public void escape() {			
		
		���� forest = ����.getInstance();
		System.out.println("�꼥���� �������� �ٷ��� 3�̻��� �Ǹ� 30%�� Ȯ���� Ż���մϴ�!");    	
		
		if (this.numOfAnimals == 0)
			System.out.println("�꼥�� ������ �����ϴ�");			
		
		for(int i = 0; i < numOfAnimals; i++) {
			if (this.animals[i].power >= 3)
			{
		    	int r = (int)(Math.random()*1000)%3;
		    	if(r == 1) {
		    		System.out.println(this.animals[i].�̸� + "�� �꼥���� Ż���߽��ϴ�!!");
		    		forest.addAnimal(this.animals[i]);
		    		
		    		//removeAnimal
		    		this.animals[i] = this.animals[numOfAnimals-1];
		    		this.animals[numOfAnimals-1] = null;
		    		numOfAnimals--;
		    	} 
		    	else System.out.println(this.animals[i].�̸� +"�� Ż�⿡ �����߽��ϴ٤̤�");
			}
			else
				System.out.println("�ٷ��� ���� Ż������ ���մϴ�...");
				

		}
	}
	
}








