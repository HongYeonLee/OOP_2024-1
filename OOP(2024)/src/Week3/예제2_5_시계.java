package Week3;
import java.util.Scanner;
public class 예제2_5_시계 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int 시, 분, 초;
		int time;
		System.out.println("초를 입력하세요 : ");
		time = input.nextInt();
		
		초 = time%60;
		time /= 60;
		분 = time%60;
		시 = time/60;
		
		System.out.printf("%d시 %d분 %d초 입니다", 시, 분, 초);
		input.close();
	}
}
