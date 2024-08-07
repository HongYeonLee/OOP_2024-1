package Week4;
import java.util.Scanner;

public class Lab_3_12 {
	
	private static void showArray(int[] ar) {
		for (int i = 0; i < ar.length; i++)
		{
			System.out.printf("%2d ", ar[i]);
		}
		
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public static void setArray(int[] arr, int start, int end, int[] checker)
	{
		for (int i = 0; i < arr.length;)
		{
			int randNum = (int)(Math.random()*1000)%(end - start + 1); //나머지 연산은 정수/정수만 가능
			if (checker[randNum] == 1) continue;
			checker[randNum] = 1;
			arr[i] = randNum + start;
			i++;
		}
	}
	
	private static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
		{
			//System.out.printf("%d번째 정렬 ", i);
			for (int j = 0; j < arr.length - 1; j++)
			if (arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			//정렬 과정을 보고 싶으면 showArray(ar);
		}
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args)
	{
		int[] arr;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 몇개를 입력할까요?: ");
		int size = input.nextInt();
		arr = new int[size];
		
		System.out.print("start: ");
		int start = input.nextInt();
		
		System.out.print("end: ");
		int end = input.nextInt();
		
		int[] checker = new int[end - start];
		
		setArray(arr, start, end, checker);
		System.out.println("정렬 전 배열");
		showArray(arr);
		sortArray(arr);
		System.out.println("정렬 후 배열");
		showArray(arr);
	}


}
