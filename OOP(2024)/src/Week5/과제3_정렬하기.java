package Week5;
import java.util.Scanner;
public class 과제3_정렬하기 {
	
	public static int[] makeArray(int size) 
	{
		int[] temp = new int[size];
		return temp;
	}
	
	public static void setArray_random(int[] arr, int start, int end)
	{
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random()*1000%(end - start + 1)) + start;
	}
	
	public static void sortArrary(int[] arr)
	{
		int temp;
		for (int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}	
	}
	
	public static void showArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args)
	{
		int[] arr;
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int size = input.nextInt();
		arr = makeArray(size);
		
		setArray_random(arr, 20, 50);
		System.out.println("정렬 전 배열: ");
		showArray(arr);
		
		sortArrary(arr);
		System.out.println();
		System.out.println("정렬 후 배열: ");
		showArray(arr);
		
		
	}
}
