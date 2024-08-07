package Week5;
import java.util.Scanner;
public class Lab_3_11 {
	
	private static void setArray(int[][] array) {
		for(int i = 0; i < array.length; i++)
			for(int k = 0; k < array[i].length; k++) {
				array[i][k] = (i+1)*10 + k;
			}
	}
	
	private static void showArray(int[][] array) {
		for(int[] row : array) {
			for(int value : row) {
				System.out.printf("%3d", value);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		int[][] array = null;
		Scanner input = new Scanner(System.in);
		
		//행크기와 열크기를 각각 입력 받아서 만들어봅니다
		System.out.print("행크기 입력하세요: ");
		int row = input.nextInt();
		//행생성
		array = new int[row][];
				
		for (int i = 0; i < row; i++)
		{
			System.out.printf("%d행의 열크기: ", i);
			int column = input.nextInt();
			//열생성
			array[i] = new int[column];
		}
		
		//배열의 값 세팅
		setArray(array);
		
		//배열보이기
		showArray(array);
	}




}
