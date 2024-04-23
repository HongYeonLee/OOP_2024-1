package Week3;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String 학번 = " ";
		int 나이 = 0;
		String 이름 = " ";
		String temp = "abc";
		System.out.print("학번: ");
		학번 = input.nextLine();

		System.out.print("나이: ");
		나이 = input.nextInt();

//		if(input.hasNextLine()) temp = input.nextLine();
		System.out.print("이름: ");
		이름 = input.nextLine();
		
		System.out.println(temp);
		System.out.println("저는 " + 학번 + "학번, 이름은 " + 이름 + "입니다.");
		System.out.println("나이는 " + 나이 + "살입니다.");

	}

}
