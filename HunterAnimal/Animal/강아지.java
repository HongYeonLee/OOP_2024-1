package Animal;
public class ������ extends ���� {
	
	//����Ʈ������
    public ������(){
    	this.�̸� = "������"; //�̸����� �޾��� ���� �⺻ �̸��� �������� ��
    	this.set��ġȮ��(50);  //������ ��ġ���� 50%
    	this.set����Ȯ��(70); //������ �������� 70%
    }

    public ������(String name){    	
    	//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
    	//super(name) -> ���� Ŭ�������� public ���� (String �̸�) ������ ȣ��
    	this(); //���� Ŭ�������� public ����() ������ ȣ�� -> ������() ȣ�� -> ������(String name) 
    	this.�̸� = name;
    }
    
    public ������(String name, int ��ġȮ��, int ����Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.set��ġȮ��(��ġȮ��);
    	this.set����Ȯ��(����Ȯ��);
    }
    
    public void �����̱�(){
    	
    }

    public void ���(){
    	System.out.println("�������� ���ӿ��� �پ�ϸ� ��ϴ� �۸۸�~");
    	����������();
    	�Ź߹���������();
    
    }
    public void �����ϱ�(){    	
    
    }
    
    public void ����������(){
    	System.out.println("������ �������? �۸�~");
    }

    public void �Ź߹���������(){
    	System.out.println("�Ź��� ���� ������ ������? �۸�~");
    }
    
    //����������
    public void ���ֺθ���(){
    	System.out.println("�۸�...�۸�....���� ���ָ� �θ��� ������ ");
    	System.out.println("������ ���ؼ� ���� ���� �ٷµ� �淯�� Ż���� �õ��ؾ���!");
    	this.power+=10;
      }

    

}
