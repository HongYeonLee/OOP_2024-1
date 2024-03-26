package Week3;

import java.util.Scanner;

public class 실습2 {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String 이름 ="", 학번 = "", 음식;
		int 나이 = 0, age = 0;
		float 키 = 0, height = 0;
		boolean b = true; //논리값
		
		while (true)
		{
			//입력을 위한 출력메세지
			System.out.print("이름 : ");
			이름 = input.nextLine();
			
			System.out.print("학번 : ");
			학번 = input.nextLine();
			
			System.out.print("나이 : "); //22 엔터에서 22만 먹고 엔터가 남음
			나이 = input.nextInt();
			
			System.out.print("키 : "); // 엔터 160 엔터에서 엔터 160만 먹음 -> 입력버퍼에 엔터 하나만 남음
			키 = input.nextFloat();
			
			System.out.print("좋아하는 음식은  "); 
			String temp = input.nextLine(); //아까 키를 입력하면서 입력버퍼에 남아있던 엔터 날리기
			음식 = input.nextLine();
			
			System.out.print("입력한 정보가 맞으면 true 틀리면 false : ");
			b = input.nextBoolean();
			System.out.println("결과 : " + b);
			input.nextLine();
			input.close();
			if (b==true) break;
			
		}
		
		System.out.println("=============");
		System.out.println("안녕하세요! 저는 " + 학번 + "학번 " + 나이 + "살 " + 이름 + "이라고 합니다");
		System.out.println("좋아하는 음식은 " + 음식 + "입니다~");
		System.out.println("=============");
		System.out.println("입력한 정보는 모두 " + b + "입니다");
	}
	

}
