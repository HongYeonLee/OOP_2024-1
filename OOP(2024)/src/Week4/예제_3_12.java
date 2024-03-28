package Week4;
import java.util.Scanner;

public class 예제_3_12 {
	
	private static void showArray(int[] ar) {
		for (int i = 0; i < ar.length; i++)
		{
			System.out.printf("%2d ", ar[i]);
		}
		
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public static void setArray(int[] ar)
	{
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = (int)(Math.random()*1000)%101; //나머지 연산은 정수/정수만 가능
		}
	}
	
	private static void sortArray(int[] ar) {
		for (int i = 0; i < ar.length; i++)
		{
			//System.out.printf("%d번째 정렬 ", i);
			for (int j = 0; j < ar.length - 1; j++)
			if (ar[j] > ar[j+1])
			{
				int temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
			}
			//정렬 과정을 보고 싶으면 showArray(ar);
		}
	}
	
	public static void main(String[] args)
	{
		int[] ar;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 몇개를 입력할 까요?: ");
		int size = input.nextInt();
		
		ar = new int[size];
		setArray(ar);
		showArray(ar);
		sortArray(ar);
		showArray(ar);
	}


}
