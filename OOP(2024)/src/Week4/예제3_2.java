package Week4;
import java.util.Scanner;

public class 예제3_2 {
	public static void main (String[] args)
	{
		int n, count = 0, sum = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("정수를 입력하세요: (종료하려면 -1 입력)");
			n = input.nextInt();
			if(n == -1)
				break;
			count++;
			sum += n;
		}
		
		avg = (double)sum/count; //sum과 count 둘 중에 하나는 반드시 형변환을 해야 한다 그렇지 않으면 정수/정수이므로 avg가 정수가됨
		
		System.out.printf("총 %d개의 숫자가 입력되었으며 합은 %d이고 평균은 %f입니다", count, sum, avg); //lf로 넣으면 왜 오류가 나지?
	}
	
}
