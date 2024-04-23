package Week5;
import java.util.Scanner;
public class Lab_3_12 {
	public static String[] makeArray(int size)
	{
		Scanner input = new Scanner(System.in);
		String[] temp = new String[size];
		for (int i = 0; i < temp.length; i++)
		{
			System.out.printf("to-do[%d] : ", i + 1);
			temp[i] = input.nextLine();
			if (temp[i].equals(".")) break;
		}
		
		return temp;
	}
	
	public static void showArray(String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d : %s\n", i+1 , arr[i]);
	}
	
	public static void main(String[] args)
	{
		String[] arr = null;
		System.out.println("배열의 크기를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		arr = makeArray(size);
		showArray(arr);
	}
}
