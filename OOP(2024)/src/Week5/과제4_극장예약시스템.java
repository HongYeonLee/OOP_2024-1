package Week5;
import java.util.Scanner;
public class 과제4_극장예약시스템 {
	static Scanner input = new Scanner(System.in);
	
	private static void show_Welcome() {
		System.out.println("=====================");
		System.out.println("Welcome to Ewha Movie");
		System.out.println("=====================");
	}
	
	private static void show_menu(int menu) {
		System.out.println("=======================================");
		System.out.println("1. 예약하기 2. 취소하기 3. 좌석보이기 0. 그만하기");
		System.out.println("=======================================");
		menu = input.nextInt();
	}
	
	private static void reserve(int[][] seat) {
		
		int row, column;
		
		while(true)
		{
			System.out.println("예약할 좌석의 행: ");
			row = input.nextInt();
			
			if (row < 0 || row > seat.length - 1;)
			{
				System.out.println("그런 행은 없습니다.");
				continue;
			}
			
			System.out.println("예약할 좌석의 열: ");
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
	
	private static void show_seat() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		int[][] seat = new int[10][10];
		seat = null;
		int menu = 0;
		
		show_Welcome();
		show_menu(menu);
		switch(menu)
		{
		case 1:
			reserve(seat);
		case 2:
			show_seat();
			}
		}


		
	}








}
