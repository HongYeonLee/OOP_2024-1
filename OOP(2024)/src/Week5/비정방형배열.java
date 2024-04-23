package Week5;
import java.util.Scanner;

public class 비정방형배열 {
	
	public static void setArray(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++)
			for (int k = 0; k < arr[i].length; k++)
				arr[i][k] = (i+1)*10 + k;
	}
	
	public static void showArray(int[][] arr)
	{
		for (int[] row : arr)
		{
			for(int col : row)
				System.out.print(col  + " ");
			System.out.println();
		}
			
	}
	
	public static void main(String[] args)
	{
		int[][] arr = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("행 크기를 입력하세요: ");
		int row = input.nextInt();
		arr = new int[row][];
		int col = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%d행의 열 크기: ", i);
			col = input.nextInt();
			arr[i] = new int[col];
		}
		setArray(arr);
		showArray(arr);
	}
}
