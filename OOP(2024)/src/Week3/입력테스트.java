package Week3;
import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) 
	{
		//문자열1, 문자열2, 정수, 실수
//		System.out.println("문자열두개, 정수, 실수를 공백을 사용해서 입력하세요: ");//엔터도 공백문자에 속한다
//		String name = input.next();
//		String address = input.next();
//		int n = input.nextInt();
//		double d = input.nextDouble();
//		
//		System.out.println("==================");
//		System.out.println(name);
//		System.out.println(address);
//		System.out.println(n);
//		System.out.println(d);
//		System.out.println("==================");
		
//		실습1 문자열 다음 숫자 받기
		Scanner input = new Scanner(System.in);
//		String name;
//		int age;
//		System.out.println("이름: ");
//		name = input.next();
//		
//		System.out.println("나이: ");
//		age = input.nextInt();
//		
//		input.close();
//		
//		System.out.println("============");
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("============");
		
		//실습2: 숫자 다음 문자열 받기
		String name;
		int age;
		
		//22(엔터)에서 nextInt()가 22만 먹고 뒤에 엔터를 입력버퍼 맨 앞에 남겨둠
		//nextLine()은 입력버퍼앞에 있는 엔터만 먹고 바로 실행종료
		System.out.print("나이: "); 
		age = input.nextInt();
		System.out.print("이름: ");
		name = input.nextLine();
		
		System.out.println();
		System.out.println("============");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("============");
		
		input.close();

	}
}

