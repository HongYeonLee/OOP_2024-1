package ���;


import Main.*;
import Animal.*;


public class �������� extends Place implements Escapeable{
	private static �������� instance = null;	
	
	private ��������() { 	//�⺻ 10����

//		this.where = "��������"; //place�� where
//		animals = new ����[this.size]; //10 -> this.size
		this.setAnimals("��������");
	}
	
	private ��������(int size) { 	//�⺻ 10����

		this.where = "��������";
		animals = new ����[size];
	}
	
	public static �������� getInstance() {
		
		if(instance == null) instance = new ��������();
		return instance;
	}
	
	public static �������� getInstance(int size) {
		
		if(instance==null) instance = new ��������(size);	
		return instance;
	}
	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# �������忡 �ִ� ������ :");
		
		showAnimals(animals, numOfAnimals); //public static void showAnimals(����[] animals, int count)
		//static �޼ҵ�� ��ü ���������ʰ� �ٷ� ���
	}

	//�������忡�� ��ǹ߻�!
	public void escape() {			    
		//Escapeable [] e = getAnimals();   //���� [] �� ����					
		//Ż���� ���� ����
		//int rand=(int)(Math.random()*100) % this.numOfAnimals;	
		//�� ������ Ȯ���� ���� Ż���� �õ��Ѵ�.
		//e[i]. ���� �����ϸ� escape() �� ���δ�!//e[rand].escape();		
		
		���� forest = ����.getInstance();
	    //�����ϰ� 30% Ȯ���� Ż��. 
		System.out.println("�������� ��ȸ�� ������ Ż���� �õ��մϴ�!. Ż��Ȯ���� 30% �Դϴ�.");    	
		
		if (this.numOfAnimals == 0)
			System.out.println("�������忡 ������ �����ϴ�");
		//�����ϰ� ó���ϰų�, �������� ���س��ų�~
		for(int i = 0; i < numOfAnimals; i++) {
	    	int r = (int)(Math.random()*1000)%3;
	    	if(r == 1) {
	    		System.out.println(this.animals[i].�̸� + "�� ���Ŀ�� �������忡�� Ż���߽��ϴ�!!");
	    		forest.addAnimal(this.animals[i]);
	    		
	    		//removeAnimal
	    		this.animals[i] = this.animals[numOfAnimals-1];
	    		this.animals[numOfAnimals-1] = null;
	    		numOfAnimals--;
	    	} 
	    	else System.out.println(this.animals[i].�̸� +"�� Ż�⿡ �����߽��ϴ٤̤�");
		}
	}
}








