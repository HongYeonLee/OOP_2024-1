package Week5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		
		//좌석 2차원 배열 생성 및 초기화
		int[][] seat = new int[10][10];
		
		//예약, 취소기능이 있는 키오스크같은 기능
		과제4_극장예약시스템 kiosk = new 과제4_극장예약시스템();
		
		//동작은 메인클래스에서
		kiosk.show_Welcome();
		while (true)
		{
			kiosk.show_menu();
			System.out.print("menu : ");
			menu = input.nextInt();
			if (menu == 0) break;
			switch(menu)
			{
			case 1:
				kiosk.reserve(seat);
				break;
			case 2:
				kiosk.cancel(seat);
				break;
			case 3:
				kiosk.show_seat(seat);
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

}
