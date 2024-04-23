package Week5;
import java.util.Scanner;
public class Lab_3_9 {
	public static void main(String[] args)
	{
;		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int k : arr)
		{
			System.out.print(k + " ");
			sum += k;
		}
		
		System.out.println("합은 " + sum);
		
		String[] names = {"사과", "배", "포도", "딸기", "체리"};
		
		for (String k : names)
		{
			System.out.print(k + " ");
		}
		
	}
}
