package Week5;
import java.util.Scanner;
public class Lab_3_8 {
	
	public static int input_values_in_array(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println(arr.length + "개 만큼의 정수를 입력하세요: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + i + "] : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static void show_array(int[] arr)
	{
		System.out.println("array : ");
		for (int i = 0; i < arr.length; i ++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		int sum = input_values_in_array(intArray);
		show_array(intArray);
		System.out.println("총 합은 " + sum);
		System.out.println("평균은 " + (double)sum/intArray.length);
	}
}
