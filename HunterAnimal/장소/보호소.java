package ���;

import Animal.����;
import Animal.������;
import Animal.�����;
import Animal.�䳢;
import Animal.�ܽ���;
import Main.Playable;

public class ��ȣ�� extends Place implements Playable{
	private static ��ȣ�� instance = null;
	
	private ��ȣ��()
	{
		this.setAnimals("��ȣ��");
	}
	
	private ��ȣ��(int size) { 	//�⺻ 10����

		this.where = "��ȣ��";
		animals = new ����[size];
	}
	
	public static ��ȣ�� getInstance() {
		
		if(instance == null) instance = new ��ȣ��();
		return instance;
	}
	
	public static ��ȣ�� getInstance(int size) {
		
		if(instance==null) instance = new ��ȣ��(size);	
		return instance;
	}
	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# ��ȣ�ҿ� �ִ� ������ :");
		
		showAnimals(animals, numOfAnimals); //public static void showAnimals(����[] animals, int count)
		//static �޼ҵ�� ��ü ���������ʰ� �ٷ� ���
	}

	@Override
	public void ���() {
		// TODO Auto-generated method stub
		System.out.println("�������� ��ȣ�ҿ��� �����Ӱ� �پ��ϴ�.");
		Playable[] p = getAnimals();
		
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
}
