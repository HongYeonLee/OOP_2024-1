package View;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Player.Player;
import Player.노엘;
import Player.데이먼;
import Player.리암;
import Player.본헤드;
import Player.알렉스;
import Player.콕슨;
import Weapon.Weapon;
import Weapon.금니;
import Weapon.기타;
import Weapon.머리카락;
import Weapon.안경;
import Weapon.치즈;
import Weapon.탬버린;

public class Main {

	public static ArrayList<Player> oasis;
	public static ArrayList<Player> blur;
	public static ArrayList<Weapon> weapons;
	static Player attacker;
	static Player target;
	private static Scanner sc;
	
	static void showTeam(String name, ArrayList<Player> team)
	{
		System.out.print(name + " : ");
		for (Player p : team)
		{
			System.out.print(p.name + " ");
		}
		System.out.println();
	}
	
	static void chooseTwo()
	{
		Random random = new Random();

		showTeam("oasis", oasis);
		showTeam("blur", blur);

		System.out.println("\n랜덤하게 두명을 뽑습니다");

		attacker = oasis.get(random.nextInt(oasis.size()));
		target = blur.get(random.nextInt(blur.size()));

		System.out.println("oasis의 " + attacker.name + ", blur의 " + target.name + "이(가) 뽑혔습니다!\n");
		attacker.show();
		target.show();


		if ((int)(Math.random()*100)%2 == 1)
		{
			Player temp = attacker;
			attacker = target;
			target = temp;
		}

		System.out.println("\n첫 공격은 " + attacker.name + "이(가) 시작합니다!\n");
	}

	public static void swap()
	{
		Player temp = attacker;
		attacker = target;
		target = temp;
	}
	
	
	public static void 콘솔run() {
		// TODO Auto-generated method stub

		int attackKind;
		boolean isEnd = false;
		sc = new Scanner(System.in);

		chooseTwo();
		while(!isEnd)
		{	
			if (attacker.getHp() <= 0)
			{
				System.out.println(target.name + "이(가) 이겼습니다!");
				System.out.println("=============================================");

				if (oasis.contains(attacker))
					oasis.remove(attacker);

				if (blur.contains(attacker))
					blur.remove(attacker);
				
				if (!oasis.isEmpty() && !blur.isEmpty())
				{
					chooseTwo();
					continue;
				}
			}
			
			if (oasis.isEmpty())
			{
				System.out.println("blur가 승리했습니다!");
				isEnd = true;
				continue;
			}
			else if (blur.isEmpty())
			{
				System.out.println("oasis가 승리했습니다!");
				isEnd = true;
				continue;
			}

			try {
				System.out.println(attacker.name + "이 할 일을 선택하세요");
				System.out.print("1 - " + attacker.getAttackName() + " (일반공격) 2 - " + attacker.getWeapon().name + " (무기공격) 3 - 스트레스 풀기 : ");
				attackKind = sc.nextInt();
				
			}catch(InputMismatchException e)
			{
				System.out.println("잘못 입력하셨습니다! 다시입력하세요");
				sc.next();
				continue;
			}
			
			System.out.println("=============================================");
			if (attacker.getStress() < 10)
			{
				switch(attackKind)
				{
				case 1:{
					
					System.out.println(attacker.attack(target));
					target.show();
					attacker.show();
					System.out.println("=============================================");
					break;
				}
				case 2:{
					System.out.println(attacker.getWeapon().attack(target, attacker));
					target.show();
					attacker.show();
					System.out.println("=============================================");
					break;
				}
				case 3:{
					System.out.println(attacker.스트레스해소());
					System.out.println("=============================================");
				}
				}
			}
			else if (attackKind == 3)
			{
				System.out.println(attacker.스트레스해소());
				System.out.println("=============================================");
			}
			else
			{
				System.out.println(attacker.name + "의 스트레스가 너무 높아 " + target.name + "을(를) 공격하기 싫어합니다...");
				System.out.println("=============================================");
				continue;
			}
			swap();	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player 노엘 = new 노엘("노엘", 120, 20, "노엘1.png", "노엘2.png", "무시하기");
		Player 리암 = new 리암("리암", 150, 10, "리암1.png", "리암2.png", "브이 날리기");
		Player 본헤드 = new 본헤드("본헤드", 115, 25, "본헤드1.png", "본헤드2.png", "머리로 빛 반사하기");
		Player 데이먼 = new 데이먼("데이먼", 140, 10, "데이먼1.png", "데이먼2.png", "마이크로 때리기");
		Player 콕슨 = new 콕슨("콕슨", 130, 20, "콕슨1.png", "콕슨2.png", "헛소리하기");
		Player 알렉스 = new 알렉스("알렉스", 120, 20, "알렉스1.png", "알렉스2.png", "담배 연기 내뿜기");

		oasis = new ArrayList<Player>();
		blur = new ArrayList<Player>();

		oasis.add(노엘);
		oasis.add(리암);
		oasis.add(본헤드);
		blur.add(데이먼);
		blur.add(콕슨);
		blur.add(알렉스);

		Weapon 기타 = new 기타("기타로 작곡하기", 5, 0.5, 0.5);
		Weapon 탬버린 = new 탬버린("탬버린 던지기", 3, 0.8, 0.7);
		Weapon 머리카락 = new 머리카락("머리카락 뽑기", 1, 0.5, 0.4);
		Weapon 금니 = new 금니("금니 보여주기", 5, 0.5, 0.5);
		Weapon 안경 = new 안경("안경 던지기", 3, 0.6, 0.4);
		Weapon 치즈 = new 치즈("치즈 만들기", 5, 0.4, 0.3);

		weapons = new ArrayList<Weapon>();

		weapons.add(기타);
		weapons.add(탬버린);
		weapons.add(머리카락);
		weapons.add(금니);
		weapons.add(안경);
		weapons.add(치즈);


		노엘.setWeapon(기타);
		리암.setWeapon(탬버린);
		본헤드.setWeapon(머리카락);
		데이먼.setWeapon(금니);
		콕슨.setWeapon(안경);
		알렉스.setWeapon(치즈);

		//콘솔run();
		new 두명뽑기();


	}

}
