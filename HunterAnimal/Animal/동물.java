package Animal;
import Main.*;

public abstract class ���� implements Playable, Moveable, Huntable, Workable, Escapeable {
    public String �̸�;
    private int ����;
    private int ��ġȮ��;
    private int ����Ȯ��;
    
    public int hp;
    public int power;
    private int money;

    public ����(){
    	System.out.println(this.getClass().getSimpleName() + " �� ������ ���ӿ� �¾���ϴ�! "); //this.getClass().getSimpleName() -> � Ŭ���� Ÿ���� ��ü�� ����������� 
    }

	public ����(String �̸�){
    	//this(); //���� �⺻������ ȣ��
    	this.�̸� = �̸�;
    	System.out.println("�̸��� " + this.�̸� +"�� ������ �Ѹ��� �����մϴ�.");
    }

    public int get����(){
    	
        return this.����;
    }

    public void set����(int ����){	
    	this.���� = ����;
    }   

    public int get��ġȮ��(){
    	
        return this.��ġȮ��;
    }

    public void set��ġȮ��(int ��ġȮ��){
    	this.��ġȮ�� = ��ġȮ��;
    }   
    
    public int get����Ȯ��() {
		return this.����Ȯ��;
	}

	public void set����Ȯ��(int ����Ȯ��) {
		this.����Ȯ�� = ����Ȯ��;
	}
	
    public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract void ���();

    public void �Ա�(){
    	System.out.println("�������� �꿡�� Ǯ�� ���Ծ��");
    }

    public void �ڱ�(){
    }

    public void �����̱�(){
    }

    public void show(){
    	
    }

}
