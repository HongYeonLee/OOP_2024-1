package Main;
import Animal.������;
import Animal.�����;
import Animal.����;
import Animal.�䳢;
import Animal.�ܽ���;
import ���.*;

public class ���Ŀ {
	//����[] ��������;
	�������� farm = ��������.getInstance();
	���� forest = ����.getInstance();
	�꼥 petShop= �꼥.getInstance();

	private int ���Ŀmoney = 0; //�⺻ 0����
	private ���� dog;
	public ���Ŀ() {
		
		System.out.println("===================================");
		System.out.println(" ���Ŀ�� ��Ÿ�����ϴ�! �������� ��� �ɱ��?");
		System.out.println("===================================");
	} 
	public ���Ŀ(int size){
    	this();
    	�������� farm = ��������.getInstance(size);
    }
    
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("���Ŀ�� �������� ũ�� : " + farm.getSize()); //place�� getSize() �޼ҵ� ȣ��
    	System.out.println("���Ŀ�� �� : " + this.���Ŀmoney +"����");    	
    	System.out.println("�������忡 �ִ� ���� �� : " + farm.numOfAnimals); //place�� numOfAnimals
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals(); //place�� showAnimals() �޼ҵ� ȣ��
    }
 
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("# ���Ŀ�� �������� :");	
		farm.showAnimals(); //place Ŭ������ showAnimals() �޼ҵ� ȣ��
	}
	
    public boolean ��ġ�ϱ�(���� ani){    	
    	System.out.println("������ ����! ������ ��� ����! " + ani.�̸�);    	
    	return true;
    }
 
    public boolean ��ġ�ϱ�(������ dog){
    	System.out.println("���Ŀ�� �������� ��ġ�Ϸ��� �մϴ�...");
    	boolean signal = doRandom(dog);
    	return signal;
    }
    
    public boolean ��ġ�ϱ�(����� cat){
    	System.out.println("���Ŀ�� ����̸� ��ġ�Ϸ��� �մϴ�...");
    	boolean signal = doRandom(cat);
    	return signal;
    }
   
    public boolean ��ġ�ϱ�(�䳢 rabbit){
    	System.out.println("���Ŀ�� �䳢�� ��ġ�Ϸ��� �մϴ�...");
    	boolean signal = doRandom(rabbit);
    	return signal;  
    }
    
    public boolean ��ġ�ϱ�(�ܽ��� ham){
    	System.out.println("���Ŀ�� �ܽ��͸� ��ġ�Ϸ��� �մϴ�...");
    	boolean signal = doRandom(ham);
    	return signal;  
    }
    
    //�������� ��ġȮ���� ���� ��ġ�������� ��� ����
    public boolean doRandom(���� animal) {
    	int r = (int)(Math.random()*1000)% 100;
    	if( r < animal.get��ġȮ��()) {
    		System.out.println("���Ŀ�� " + animal.�̸� + " ��ġ�ϱ⸦ �����߽��ϴ�!");
    		return true;
    	}
    	else System.out.println("���Ŀ�� " + animal.�̸� + " ��ġ�ϱ⸦ �����߽��ϴ�...");
    	return false;
    }
    
    //��Һ��� �����ε� ����
    //�������� ���� ��ġ�ϱ� -> ������ �����ؼ� ��ġ�ϱ�
    public void ��ġ�ϱ�()
    {
    	forest.show(); //���ӿ� �ִ� ���� �����ֱ�
    	System.out.print("� ������ ��ġ�ϰڽ��ϱ�? : ");
    	String name = Main.input.next(); //���ο��� ��ǲ ���� �������� �����ϱ�
    	���� target = null;
    	boolean sig = false;
    	
    	if (name.equals("������"))
    	{
    		target = forest.getDog();
    		if (target != null)
    			sig = ��ġ�ϱ�((������)target);
    	}
    	else if (name.equals("�����"))
    	{
    		target = forest.getCat();
    		if (target != null)
    			sig = ��ġ�ϱ�((�����)target);
    	}
    	else if (name.equals("�䳢"))
    	{
    		target = forest.getRabbit();
    		if (target != null)
    			sig = ��ġ�ϱ�((�䳢)target);
    	}
    	else if (name.equals("�ܽ���"))
    	{
    		target = forest.getHamster();
    		if (target != null)
    			sig = ��ġ�ϱ�((�ܽ���)target);
    	}
    	else
    		System.out.println("�׷� ������ �����ϴ�.");

//    	//1. �����迭�߿��� �����ϰ� �ƹ��ų� ���� : getAnimal()
//    
//    	���� ani = forest.getAnimal(); //place Ŭ������ getAnimal() �޼ҵ� ȣ��
//    	boolean sig = false;    
//    
//    	//2. ������ ���� ���Ȯ�� ����ϱ�
//    	if (ani instanceof ������) sig = ��ġ�ϱ�((������)ani); //�ٿ�ĳ����
//    	else if (ani instanceof �䳢) sig = ��ġ�ϱ�((�䳢)ani);
//    	else if (ani instanceof �����) sig = ��ġ�ϱ�((�����)ani);
//    	else sig = ��ġ�ϱ�(ani);  // ������ ���ڷ� �޴� ����ϱⰡ ȣ���.
//
    	//3. ������ removeAnimal(), �������忡 addAnimal() 
    	if(sig == true) {
    		forest.removeAnimal(target); //place Ŭ������ removeAnimal(���� ani) �޼ҵ� ȣ��
    		farm.addAnimal(target); //place Ŭ������ addAnimal(���� ani) �޼ҵ� ȣ��
    	}
    }
   
    public void ��ġ�ϱ�(���� [] animals){
    	//...
    	
    }
    
    
    
    public void �����ȱ�()
    {
    	farm.show(); //���ӿ� �ִ� ���� �����ֱ�
    	System.out.print("� ������ �꼥�� �Ȱڽ��ϱ�? : ");
    	String name = Main.input.next(); //���ο��� ��ǲ ���� �������� �����ϱ�
    	���� target = null;
    	
    	if (name.equals("������"))
    	{
    		target = farm.getDog();
    		if (target != null)
    		{
    			System.out.println("�������� �꼥�� �˴ϴ�");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("�����"))
    	{
    		target = farm.getCat();
    		if (target != null)
    		{
    			System.out.println("����̸� �꼥�� �˴ϴ�");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("�䳢"))
    	{
    		target = farm.getRabbit();
    		if (target != null)
    		{
    			System.out.println("�䳢�� �꼥�� �˴ϴ�");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else if (name.equals("�ܽ���"))
    	{
    		target = farm.getHamster();
    		if (target != null)
    		{
    			System.out.println("�ܽ��͸� �꼥�� �˴ϴ�");
    			petShop.addAnimal(target);
    			farm.removeAnimal(target);
    			getMoney();
    		}
    	}
    	
    	else
    		System.out.println("�׷� ������ �����ϴ�");
    }
    
    public void getMoney()
    {
		//1���� ~ 3���� ������ �� ȹ��
    	int earn = (int)(Math.random()*100000)%30000 + 10000;
    	this.���Ŀmoney += earn;
    	System.out.println("�꼥�� �Ⱦ� " + earn + "���� �������ϴ�! (���� ���Ŀ ��: " + this.���Ŀmoney + "��)");
    	
    	if (this.���Ŀmoney >= 100000) //10���� �̻� ����� ���
    		buyPetShop();
    }
    
    public void buyPetShop()
    {
    	System.out.println("���Ŀ�� ������ �Ⱦ� 10���� �̻��� ��ҽ��ϴ�!");
    	System.out.println("�꼥�� �Ÿ��� �� �ְԵǾ����ϴ�!");
    	System.out.println("������ �������� ��� �꼥���� �̵��մϴ�...");
    	
    	for (int i = 0; i < forest.numOfAnimals; i++)
    		petShop.addAnimal(forest.getAnimals()[i]);
    	
    	
    	forest.removeAll();
    	forest.show();
    	petShop.show();
    	Main.flag = 1;
    }
}
