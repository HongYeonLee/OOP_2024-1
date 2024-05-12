package Main;
import java.util.Scanner;

import Animal.강아지;
import Animal.고양이;
import Animal.동물;
import Animal.토끼;
import Animal.햄스터;
import 장소.동물농장;
import 장소.펫샵;
import 장소.숲속;
import 장소.보호소;

//동물생성 및 객체배열 실습을 위한 테스트 
public class Main {
	static Scanner input = new Scanner(System.in); //브로커와 구조원 클래스에서도 입력을 받을 수 있게 전역변수로 설정
	static int flag = 0;
	
	public static void menu보기() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("숲속에 동물 생성: | 1.강아지 | 2.고양이 | 3.토끼 | 4.햄스터 | 5.랜덤생성 |");
		System.out.println("    브로커 동작: | 11.납치하기 | 12.펫샵에 동물팔기 |");
		System.out.println("    구조원 동작: | 13. 구조하기 |");
		System.out.println("     동물 동작: | 14.숲속활동 | 15. 동물농장활동 | 16.펫샵활동 | 17.보호소활동 |");
		System.out.println("     상태 보기: | 21.숲속보기 | 22.동물농장보기 | 23.펫샵보기 | 24. 보호소보기 | 25. 모두보기 | 0.종료 |");
		System.out.println("-----------------------------------------------------------------------");
	}
 

    public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
    	숲속 forest = 숲속.getInstance(); //animals = new 동물[size];
    	펫샵 petShop = 펫샵.getInstance(); //animals = new 동물[size]; -> 코드 중복
    	동물농장 farm = 동물농장.getInstance(); //animals = new 동물[size]; -> 코드 중복
    	보호소 shelter = 보호소.getInstance();
    	
		//브로커 생성
		브로커 broker = new 브로커(); //여기서 브로커 클래스의 public 브로커(){} 기본생성자 호출
		구조원 rescue = new 구조원();
		//broker.showInfo();

		//강아지 한마리 생성 후 납치하기
		//강아지 d = new 강아지("흰둥이"); //강아지 클래스의 public 강아지(String name)
		//boolean sig = broker.납치하기(d); //브로커 클래스의 public boolean 납치하기(강아지 dog) -> doRandom(dog)
		
		//납치에 성공했다면, 동물농장에 넣기, 이 동작은 addAnimal()로 모듈화할 수 있고 "사냥개"에게 임무를 맡길 수 있음
		//if (sig == true) farm.addAnimal(d); //place 클래스의 addAnimal(동물 ani) 호출
		//broker.show(); //place 클래스의 showAnimals() 메소드 호출
		//farm.show(); // place 클래스의 static void showAnimals(동물[] animals, int count) 호출
		//////////////////////////////////////////////////////

		//메뉴로 동작시키기
//		System.out.println("------------------------------------------------------");
//		System.out.println("메뉴로 동작시키기");
		int menu = 0;
		int i = 0;

		while(true) {
			
			if (flag == 1)
			{
				System.out.println("게임이 끝났습니다!");
				break;
			}
			
			menu보기();
			System.out.print("메뉴를 입력하세요 : ");
			menu = input.nextInt();
			if(menu == 0) {
				System.out.println("프로그램 종료!");
				break;
			}			
			switch (menu) {
				case 1:
					forest.addAnimal(new 강아지("댕댕이" + (i++))); //강아지 클래스의 강아지(String name) 생성자 호출 -> 강아지 객체 생성 -> place 클래스의 addAnimal(동물 ani) 메소드 호출
					break;
				case 2:
					forest.addAnimal(new 고양이("냐옹이" + (i++)));
					break;
				case 3:
					forest.addAnimal(new 토끼("토깽이" + (i++)));
					break;
				case 4:
					forest.addAnimal(new 햄스터("햄햄" + (i++)));
					break;
				case 5: //숲속에 동물 랜덤 생성하기
					int rand = (int)(Math.random()*10)%4 + 1; // 0 ~ 10 사이의 수를 4로 나눈 나머지 -> 0, 1, 2, 3 에 +1 -> 1, 2, 3, 4
					if (rand == 1)
						forest.addAnimal(new 강아지("댕댕이" + (i++)));
					if (rand == 2)
						forest.addAnimal(new 고양이("냐옹이" + (i++)));
					if (rand == 3)
						forest.addAnimal(new 토끼("토깽이" + (i++)));
					if (rand == 4)
						forest.addAnimal(new 햄스터("햄햄" + (i++)));
					break;
					
				/////////////////////////////////////////
					
				case 11:
					broker.납치하기();
					break;
				case 12: //동물농장의 동물을 펫샵에 팔기
					broker.동물팔기();
					break;
				
				////////////////////////////////////////
					
				case 13: 
					rescue.구조하기();
					break;
				
				///////////////////////////////////////
					
				case 14: //숲속활동보기- 놀기()
					forest.놀기(); //숲속 클래스이 놀기()메소드 호출
					break;
				case 15:// 동물농장활동보기 - 탈출시도!
					farm.escape();
					break;
				case 16: //펫샵 활동보기 - 일하기();	
					petShop.work();
					break;
				case 17: //보호소 활동보기
					shelter.놀기();
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
					System.out.println("그런 메뉴는 없습니다.");
					break;	
				}				
		}
		//메뉴없이 숲속동물 랜덤하게 사냥
		while(true) {
			if (forest.numOfAnimals == 1) {
				System.out.println("생태계를 위해 한마리는 살려둡니다.");
				break;
			}
			
			broker.납치하기();
			broker.show();		
			forest.show();
			
			//조금 기다렸다 출력되도록 1초 delay 
			Thread.sleep(1000);
		}        
    }

}
