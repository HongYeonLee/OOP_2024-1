package Baekjoon;
import java.util.Scanner;
public class prog_약수구하기 {

	public static void main(String[] args) {
        int[] answer = {};
        int[] temp = new int[10000];
        int count = 0;
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i ++)
            if (n%i == 0)
            	temp[count++] = i;
        
        answer = new int[count];
        
        for (int i = 0; i < count; i++)
                answer[i] = temp[i];
        
        for (int i = 0; i < answer.length; i++)
        	System.out.print(answer[i] + " ");

	}

}
