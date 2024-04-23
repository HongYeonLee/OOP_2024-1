package Week5;
import java.util.Scanner;
public class Lab_3_7 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] intArray = new int[5];
		int value, max = 0;
		
		for (int i = 0; i < 5;)
		{
			System.out.printf("%d번째 : ", i);
			value = input.nextInt();
			if (value < 0) continue;
			
			intArray[i++] = value;
			if(max < value)
				max = value;
			
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
//		int[] test;
//		System.out.println(test.length);
		//배열 초기화 필요

	}
}
