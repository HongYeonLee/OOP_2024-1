package Main;
import java.util.Scanner;

import Animal.������;
import Animal.�����;
import Animal.����;
import Animal.�䳢;
import Animal.�ܽ���;
import ���.��������;
import ���.�꼥;
import ���.����;
import ���.��ȣ��;

//�������� �� ��ü�迭 �ǽ��� ���� �׽�Ʈ 
public class Main {
	static Scanner input = new Scanner(System.in); //���Ŀ�� ������ Ŭ���������� �Է��� ���� �� �ְ� ���������� ����
	static int flag = 0;
	
	public static void menu����() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("���ӿ� ���� ����: | 1.������ | 2.����� | 3.�䳢 | 4.�ܽ��� | 5.�������� |");
		System.out.println("    ���Ŀ ����: | 11.��ġ�ϱ� | 12.�꼥�� �����ȱ� |");
		System.out.println("    ������ ����: | 13. �����ϱ� |");
		System.out.println("     ���� ����: | 14.����Ȱ�� | 15. ��������Ȱ�� | 16.�꼥Ȱ�� | 17.��ȣ��Ȱ�� |");
		System.out.println("     ���� ����: | 21.���Ӻ��� | 22.�������庸�� | 23.�꼥���� | 24. ��ȣ�Һ��� | 25. ��κ��� | 0.���� |");
		System.out.println("-----------------------------------------------------------------------");
	}
 

    public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
    	���� forest = ����.getInstance(); //animals = new ����[size];
    	�꼥 petShop = �꼥.getInstance(); //animals = new ����[size]; -> �ڵ� �ߺ�
    	�������� farm = ��������.getInstance(); //animals = new ����[size]; -> �ڵ� �ߺ�
    	��ȣ�� shelter = ��ȣ��.getInstance();
    	
		//���Ŀ ����
		���Ŀ broker = new ���Ŀ(); //���⼭ ���Ŀ Ŭ������ public ���Ŀ(){} �⺻������ ȣ��
		������ rescue = new ������();
		//broker.showInfo();

		//������ �Ѹ��� ���� �� ��ġ�ϱ�
		//������ d = new ������("�����"); //������ Ŭ������ public ������(String name)
		//boolean sig = broker.��ġ�ϱ�(d); //���Ŀ Ŭ������ public boolean ��ġ�ϱ�(������ dog) -> doRandom(dog)
		
		//��ġ�� �����ߴٸ�, �������忡 �ֱ�, �� ������ addAnimal()�� ���ȭ�� �� �ְ� "��ɰ�"���� �ӹ��� �ñ� �� ����
		//if (sig == true) farm.addAnimal(d); //place Ŭ������ addAnimal(���� ani) ȣ��
		//broker.show(); //place Ŭ������ showAnimals() �޼ҵ� ȣ��
		//farm.show(); // place Ŭ������ static void showAnimals(����[] animals, int count) ȣ��
		//////////////////////////////////////////////////////

		//�޴��� ���۽�Ű��
//		System.out.println("------------------------------------------------------");
//		System.out.println("�޴��� ���۽�Ű��");
		int menu = 0;
		int i = 0;

		while(true) {
			
			if (flag == 1)
			{
				System.out.println("������ �������ϴ�!");
				break;
			}
			
			menu����();
			System.out.print("�޴��� �Է��ϼ��� : ");
			menu = input.nextInt();
			if(menu == 0) {
				System.out.println("���α׷� ����!");
				break;
			}			
			switch (menu) {
				case 1:
					forest.addAnimal(new ������("�����" + (i++))); //������ Ŭ������ ������(String name) ������ ȣ�� -> ������ ��ü ���� -> place Ŭ������ addAnimal(���� ani) �޼ҵ� ȣ��
					break;
				case 2:
					forest.addAnimal(new �����("�Ŀ���" + (i++)));
					break;
				case 3:
					forest.addAnimal(new �䳢("�䲤��" + (i++)));
					break;
				case 4:
					forest.addAnimal(new �ܽ���("����" + (i++)));
					break;
				case 5: //���ӿ� ���� ���� �����ϱ�
					int rand = (int)(Math.random()*10)%4 + 1; // 0 ~ 10 ������ ���� 4�� ���� ������ -> 0, 1, 2, 3 �� +1 -> 1, 2, 3, 4
					if (rand == 1)
						forest.addAnimal(new ������("�����" + (i++)));
					if (rand == 2)
						forest.addAnimal(new �����("�Ŀ���" + (i++)));
					if (rand == 3)
						forest.addAnimal(new �䳢("�䲤��" + (i++)));
					if (rand == 4)
						forest.addAnimal(new �ܽ���("����" + (i++)));
					break;
					
				/////////////////////////////////////////
					
				case 11:
					broker.��ġ�ϱ�();
					break;
				case 12: //���������� ������ �꼥�� �ȱ�
					broker.�����ȱ�();
					break;
				
				////////////////////////////////////////
					
				case 13: 
					rescue.�����ϱ�();
					break;
				
				///////////////////////////////////////
					
				case 14: //����Ȱ������- ���()
					forest.���(); //���� Ŭ������ ���()�޼ҵ� ȣ��
					break;
				case 15:// ��������Ȱ������ - Ż��õ�!
					farm.escape();
					break;
				case 16: //�꼥 Ȱ������ - ���ϱ�();	
					petShop.work();
					break;
				case 17: //��ȣ�� Ȱ������
					shelter.���();
					break;

				/////////////////////////////////////////
					
				case 21:
					forest.show();	
					break;
				case 22:
					broker.show();
					break;
				case 23:
					petShop.show();
					break;
				case 24:
					shelter.show();
					break;
				case 25:
					forest.show();
					farm.show();
					petShop.show();
					shelter.show();
					break;
				default:
					System.out.println("�׷� �޴��� �����ϴ�.");
					break;	
				}				
		}
		//�޴����� ���ӵ��� �����ϰ� ���
		while(true) {
			if (forest.numOfAnimals == 1) {
				System.out.println("���°踦 ���� �Ѹ����� ����Ӵϴ�.");
				break;
			}
			
			broker.��ġ�ϱ�();
			broker.show();		
			forest.show();
			
			//���� ��ٷȴ� ��µǵ��� 1�� delay 
			Thread.sleep(1000);
		}        
    }

}
