package Main;

import Animal.������;
import Animal.�����;
import Animal.����;
import Animal.�䳢;
import Animal.�ܽ���;
import ���.��������;
import ���.����;
import ���.��ȣ��;

public class ������ {
	�������� farm = ��������.getInstance();
	���� forest = ����.getInstance();
	��ȣ�� shelter = ��ȣ��.getInstance();
	
	int ������money = 0;
	
	public ������() {
		System.out.println("===================================");
		System.out.println("  �������� ��Ÿ�����ϴ�! �������� ���غ��ô�!");
		System.out.println("===================================");
	}
	
    public ������(int size){
    	this();
    	��ȣ�� shelter = ��ȣ��.getInstance(size);
    }
    
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("�������� ��ȣ�� ũ�� : " + shelter.getSize()); //place�� getSize() �޼ҵ� ȣ��
    	System.out.println("�������� �� : " + ������money +"����");    	
    	System.out.println("�������� �ִ� ���� �� : " + shelter.numOfAnimals); //place�� numOfAnimals
    	System.out.println("------------------------------------------------");
    	
    	shelter.showAnimals(); //place�� showAnimals() �޼ҵ� ȣ��
    }
    
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# �������� ��ȣ�� :");	
		shelter.showAnimals(); //place Ŭ������ showAnimals() �޼ҵ� ȣ��
	}
	
    public boolean �����ϱ�(���� ani){    	
    	System.out.println("������ ������ �����Ѵ�!! " + ani.�̸�);    	
    	return true;
    }
    
    public boolean �����ϱ�(������ dog){
    	System.out.println("�������� �������� �����Ϸ� �մϴ�...");
    	boolean signal = doRandom(dog);
    	return signal;
    }
    
    public boolean �����ϱ�(����� cat){
    	System.out.println("�������� ����̸� �����Ϸ� �մϴ�...");
    	boolean signal = doRandom(cat);
    	return signal;
    }
   
    public boolean �����ϱ�(�䳢 rabbit){
    	System.out.println("�������� ����̸� �����Ϸ� �մϴ�...");
    	boolean signal = doRandom(rabbit);
    	return signal;  
    }
    
    public boolean �����ϱ�(�ܽ��� ham){
    	System.out.println("�������� �ܽ��͸� �����Ϸ� �մϴ�...");
    	boolean signal = doRandom(ham);
    	return signal;  
    }
    
    public boolean doRandom(���� animal) {
    	
    	int r = (int)(Math.random()*1000)% 100;
    	if( r < animal.get����Ȯ��()) {
    		System.out.println("�������� " + animal.�̸� + " �����ϱ⸦ �����߽��ϴ�!");
    		return true;
    	}
    	else System.out.println("�������� " + animal.�̸� + " �����ϱ⸦ �����߽��ϴ�...");   	
    	return false;
    }
    
    public void �����ϱ�()
    {
    	farm.show(); //���ӿ� �ִ� ���� �����ֱ�
    	System.out.print("� ������ �����ϰڽ��ϱ�? : ");
    	String name = Main.input.next(); //���ο��� ��ǲ ���� �������� �����ϱ�
    	���� target = null;
    	boolean sig = false;
    	
    	if (name.equals("������"))
    	{
    		target = farm.getDog();
    		if (target != null)
    			sig = �����ϱ�((������)target);
    	}
    	else if (name.equals("�����"))
    	{
    		target = farm.getCat();
    		if (target != null)
    			sig = �����ϱ�((�����)target);
    	}
    	else if (name.equals("�䳢"))
    	{
    		target = farm.getRabbit();
    		if (target != null)
    			sig = �����ϱ�((�䳢)target);
    	}
    	else if (name.equals("�ܽ���"))
    	{
    		target = farm.getHamster();
    		if (target != null)
    			sig = �����ϱ�((�ܽ���)target);
    	}
    	else
    		System.out.println("�׷� ������ �����ϴ�.");
    	
    	if(sig == true) {
    		//���������� ���� ����� ��ȣ�ҿ� ���� �߰��ϱ�
    		farm.removeAnimal(target); //place Ŭ������ removeAnimal(���� ani) �޼ҵ� ȣ��
    		shelter.addAnimal(target); //place Ŭ������ addAnimal(���� ani) �޼ҵ� ȣ��
    		getMoney();
    	}
    }
    
    public void getMoney()
    {
		//1���� ~ 4���� ������ �� ȹ��
    	int earn = (int)(Math.random()*100000)%30000 + 10000;
    	this.������money += earn; //0 ~ 10���� -> 3�������� ���� ������ -> 0 ~ 2�� 999..�� + 1���� 
		System.out.println("������ �����Ͽ� ��α� " + earn + "���� �޾ҽ��ϴ�! (���� ������ ��: " + this.������money + "��)");
    	
    	if (this.������money >= 100000) //10���� �̻� ����� ���
    		getFree();
    }
    
    public void getFree()
    {
    	System.out.println("�������� ��α����� 10���� �̻��� ��ҽ��ϴ�!");
    	System.out.println("���Ŀ�� ���������� �Ÿ��� �� �ְԵǾ����ϴ�!");
    	System.out.println("���������� �������� ��� ��ȣ�ҷ� �̵��մϴ�...");
    	
    	for (int i = 0; i < farm.numOfAnimals; i++)
    		shelter.addAnimal(farm.getAnimals()[i]);
    	
    	farm.removeAll();
    	farm.show();
    	shelter.show();
    	Main.flag = 1;
    }
}
