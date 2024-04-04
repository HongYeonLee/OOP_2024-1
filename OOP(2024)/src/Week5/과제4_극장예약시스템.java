package Week5;
import java.util.Scanner;
public class 과제4_극장예약시스템 {
	Scanner input = new Scanner(System.in);
	
	public void show_Welcome() {
		System.out.println("-------------------------");
		System.out.println(" *Welcome to Ewha Movie*");
		System.out.println("-------------------------");
	}
	
	public void show_menu() {
		System.out.println("=======================================");
		System.out.println("1. 예약하기 2. 취소하기 3. 좌석보이기 0. 그만하기");
		System.out.println("=======================================");
	}
	
	public void reserve(int[][] seat) {
		
		int row, column;
		
		while(true)
		{
			System.out.print("예약할 좌석의 행: ");
			row = input.nextInt();
			
			if (row < 0 || row > seat.length - 1)
			{
				System.out.println("그런 행은 없습니다.");
				continue;
			}
			
			System.out.print("예약할 좌석의 열: ");
			column = input.nextInt();
			if (column < 0 || column > seat[row].length - 1)
			{
				System.out.println("그런 열은 없습니다.");
				continue;
			}
			
			if(seat[row][column] == 1)
			{
				System.out.println("이미 예약된 좌석입니다");
				continue;
			}
			
			else break;
		}
		seat[row][column] = 1;

	}
	
	public void cancel(int[][] seat) {
		int row, column;
		
		while(true)
		{
			System.out.print("취소할 좌석의 행: ");
			row = input.nextInt();
			
			if (row < 0 || row > seat.length - 1)
			{
				System.out.println("그런 행은 없습니다.");
				continue;
			}
			
			System.out.print("취소할 좌석의 열: ");
			column = input.nextInt();
			if (column < 0 || column > seat[row].length - 1)
			{
				System.out.println("그런 열은 없습니다.");
				continue;
			}
			
			if(seat[row][column] == 0)
			{
				System.out.println("이미 취소된 좌석입니다");
				continue;
			}
			
			else break;
		}
		System.out.println("취소되었습니다");
		seat[row][column] = 0;
	}
	
	public void show_seat(int[][] seat) {
		for (int i = 0; i < seat.length; i++)
		{
			System.out.printf("%d행 ", i);
			for (int j = 0; j <seat[i].length; j++)
			{
				if (seat[i][j] != 1)
					System.out.print("□ ");
				else
					System.out.print("■ ");
			}
			System.out.println();
		}
	}
	
	public void main(String[] args)
	{
//		int[][] seat = new int[10][10];
//		int menu = 0;
//		
//		show_Welcome();
//		while (true)
//		{
//			show_menu();
//			System.out.print("menu : ");
//			menu = input.nextInt();
//			if (menu == 0) break;
//			switch(menu)
//			{
//			case 1:
//				reserve(seat);
//				break;
//			case 2:
//				cancel(seat);
//				break;
//			case 3:
//				show_seat(seat);
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다");
//			}
//		}
	}
}
			

