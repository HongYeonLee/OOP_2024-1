package Animal;
public class �䳢 extends ���� {
    int toxic;

    public �䳢(){
    	this.�̸� = "�䲤��";
    	this.toxic = 100; 
    	this.set��ġȮ��(80); //�䳢 ���Ȯ���� 80%
    	this.set����Ȯ��(70); //�䳢 ���Ȯ���� 70%
    }

    public �䳢(String name){    	
    	//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
    	this();
    	this.�̸�= name;
    }
    
    public �䳢(String name, int ���Ȯ��, int ����Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.set��ġȮ��(���Ȯ��);
    	this.set����Ȯ��(����Ȯ��);
    }
    public void ���ı�(){
    	System.out.println("�䳢�� ���� �˴ϴ�~");
    }

    public void ���ã��(){
    	System.out.println("�䳢�� ����� ã���ϴ�~");
    }

    public void ���(){
    	System.out.println("�䳢�� ���ӿ��� ��ϴ�~");
    	���ã��();
    	���ı�();
    }
    
    public void ���ֺθ���(){
    	System.out.println("������� ���� �ٱ�!!");
    	this.power += 1;
    	System.out.println("�䳢�� �ٷ��� 1 �����߽��ϴ� ���� : " + this.power);
    }

}
