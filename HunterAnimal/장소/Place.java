package ���;
import java.util.ArrayList;


import Animal.����;
import Main.Main;

public abstract class Place {	
	
	String where;
	protected  ���� []  animals = null;  //�ִ� 10������ ����!
	public int numOfAnimals = 0;
	int size = 10;  //ũ�� private�� �ƴѵ� ���� getSize()�� ȣ���ؾ� �ϳ�..
	
	public int getSize() {
		return this.size;
	}
	
	//animals = new ����[size]; ���ִ� �޼ҵ� -> ����, �꼥, �������忡�� ���
	public void setAnimals(String placeName)
	{	
		this.where = placeName;
		animals = new ����[size];
	}
	
	public ����[] getAnimals() {
		if (this.animals ==null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�."); 
			return null;
		}
		return this.animals;
	}	
	
	public ���� getAnimal() {
		
		if (this.animals == null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�."); 
			return null;
		}
		
		int r = (int)(Math.random()*1000)%numOfAnimals;
    	return this.animals[r];
		
	}
	
	public ���� getDog() {
		
		if (this.animals == null)
		{
			System.out.println("���� ������ �����ϴ�");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("������"))
						return this.animals[i];
			}
		}

		System.out.println("�������� �����ϴ�");
		return null;
	}
	
	public ���� getCat() {
		
		if (this.animals == null)
		{
			System.out.println("���� ������ �����ϴ�");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("�����"))
						return this.animals[i];
			}
		}
		System.out.println("����̰� �����ϴ�");
		return null;
	}
	
	public ���� getRabbit() {
		
		if (this.animals == null)
		{
			System.out.println("���� ������ �����ϴ�");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("�䳢"))
						return this.animals[i];
			}
		}
		System.out.println("�䳢�� �����ϴ�");
		return null;
	}
	
	public ���� getHamster() {
		
		if (this.animals == null)
		{
			System.out.println("���� ������ �����ϴ�");
			return null;
		}	
		else
		{
			for (int i = 0; i < animals.length; i++)
			{
				if (this.animals[i] != null)
					if (this.animals[i].getClass().getSimpleName().equals("�ܽ���"))
						return this.animals[i];
			}
		}
		System.out.println("�ܽ��Ͱ� �����ϴ�");
		return null;
	}
	
	public void showAnimals() {
		
		System.out.print("(�� " + numOfAnimals + "����)");
		
		for(int i = 0; i < this.animals.length; i++) //ó���� null�ε� �� 10���� ������ -> ����.getInstance() -> new ����() -> animals = new ����[10] => place Ŭ������ setAnimals �޼ҵ带 �߰��� ����
		{
			if(animals[i] != null) 	System.out.print(animals[i].�̸� + " ");
			else System.out.print(" x  ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
	
	}
	
	public static void showAnimals(����[] animals, int count) {
		
		System.out.print("(�� " + count +"����)");
		
		for(int i=0; i < animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].�̸� + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
	
	}
	
	public  void set����(���� ani, int r) {
		animals[r] = ani;
		
	}
	
	public void addAnimal(���� ani) {
		
		try
		{
			animals[numOfAnimals] = ani;
			numOfAnimals++;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("������ ���� ���ֽ��ϴ�!");
		}	
		
	}	
	
	public void removeAnimal(���� ani) {
		int i = 0;
		
		for(i = 0; i < numOfAnimals; i++) {
			if(animals[i] == ani) {
				animals[i] =null;
				break;
			}
		}
		
		animals[i] = animals[numOfAnimals - 1]; //������ �� �ڸ��� �迭�� �� �ڿ� �ִ� ������ ä���
		animals[numOfAnimals-1] = null; //�� �ڴ� ����д�
		numOfAnimals--;
	}
	
	public void removeAll()
	{
		for (int i = 0; i < numOfAnimals; i++)
			animals[i] = null;
		numOfAnimals = 0;
	}

}
