package Week5;
import java.util.Scanner;

public class Lab_3_13 {
	public static int[] makeArray(int size)
	{
		int[] temp = new int[size];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i + 1;
		
		return temp;
	}
	
	public static void showArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i ++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] arg)
	{
		int[] arr;
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
	
		arr = makeArray(size);
		showArray(arr);
	}
}
