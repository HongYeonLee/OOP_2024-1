package Animal;
public class �ܽ��� extends ���� {

	public �ܽ���() {
		this.�̸� = "����";
		this.set��ġȮ��(90); //�ܽ��� ���Ȯ�� 90
		this.set����Ȯ��(80); //�ܽ��� ����Ȯ�� 80
	}

	public �ܽ���(String name) {
		// �������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
		this();
		this.�̸� = name;
	}

	public �ܽ���(String name, int ���Ȯ��, int ����Ȯ��) {
		// ������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
		this(name);
		this.set��ġȮ��(���Ȯ��);
		this.set����Ȯ��(����Ȯ��);
	}
    public void ���ı�(){
    	System.out.println("�ܽ��Ͱ� ���� �˴ϴ�");
    }

    public void �عٶ�⾾�Ա�(){
    	System.out.println("�ܽ��Ͱ� �عٶ�⾾�� �Խ��ϴ�~ �ȳ�");
    }

    public void ���(){
    	System.out.println("�ܽ��Ͱ� ���ӿ��� ��ϴ�~");
    	�عٶ�⾾�Ա�();
    	���ı�();
    }
    
    public void ���ֺθ���(){
    	System.out.println("���� �عٶ�⾾ ���� ���!!");
    	this.power += 1;
    	System.out.println("�ܽ����� �ٷ��� 1 �����߽��ϴ� ���� : " + this.power);
    }

}
