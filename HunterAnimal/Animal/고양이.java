package Animal;
public class ����� extends ���� {
    public int ����;

    public �����(){
    	this.�̸� = "�����";
    	this.set��ġȮ��(40); //����� ���Ȯ���� 40%
    	this.set����Ȯ��(30); //����� ����Ȯ���� 30%
    }

    public �����(String name){    	
    	//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
    	this();
    	this.�̸� = name;
    }
    
    public �����(String name, int ���Ȯ��, int ����Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.set��ġȮ��(���Ȯ��);
    	this.set����Ȯ��(����Ȯ��);
    }
    public void ����ϱ�(){
    	System.out.println("����̰� �ܽ��͸� ����մϴ�...");
    	
    }

    public void �׷���ϱ�(){
    	System.out.println("����̰� �׷���� �մϴ� ��¦ ��¦");
    }

    public void ���(){
    	System.out.println("����̰� ���� �������� ��ϴ�~");
    	�׷���ϱ�();
    	����ϱ�();
    }
    
    public void ���ֺθ���(){
    	System.out.println("�Ŀ��� �ʻ� ���� ������!!");
    	this.power += 1;
    	System.out.println("������� �ٷ��� 1 �����߽��ϴ� ���� : " + this.power);
    }

}
