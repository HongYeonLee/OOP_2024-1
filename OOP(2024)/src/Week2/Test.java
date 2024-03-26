package Week2;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// int data = 12345678911; int형이 4byte이므로 2의 32승까지만 저장가능, 오버플로우 발생
		long bind_data = 123124124124124L;

		// 반지름과 결과변수, 원주율 정의하기
		double r; // 반지름
		double result; // 결과변수, int로 지정할 시 오류 발생

		final double PI = 3.14; // 원주율
		
		Scanner input = new Scanner(System.in);

//		// 우선은 대입해서 씁니다
//		r = 5;
		
		System.out.println("반지름을 실수로 입력하세요 : ");
		// 입력받기
		r = input.nextDouble();
		
		// 계산하고
		result = r * r * PI;
		// 출력하기
		System.out.println("반지름이 " + r + "인 원의 면적은 " + result + "입니다.");
	}

}
